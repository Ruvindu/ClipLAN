package cliplan;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.FlavorEvent;
import java.awt.datatransfer.FlavorListener;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client extends Thread implements Serializable {

    transient private Registry reg;
    transient public ClipLAN ccl;
    transient private int ref_rate = 1;
    transient private String host = null;
    transient private int port = 2123;

    private boolean connected = false;
    private String my_ip = null;

    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

    public Client(int refresh_rate, String host, int port) {
        this.ref_rate = refresh_rate;
        this.host = host;
        this.port = port;

        try {
            my_ip = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException ex) {
        }
    }

    public void connect() throws RemoteException, NotBoundException, AlreadyConnectedException {
        reg = LocateRegistry.getRegistry(host, port);
        ccl = (ClipLAN) reg.lookup("cliplan.com");
        this.connected = true;
        //System.out.println("when connect " + my_ip);

        if (!ccl.connect_me(my_ip)) {
            throw new AlreadyConnectedException(host);
        }
    }

    public void disconnect() throws RemoteException, NotBoundException {
        this.connected = false;
        //System.out.println("when disconnect " + my_ip);
        ccl.disconnect_me(my_ip);
    }

    public String get_from_clipboard() throws IOException, UnsupportedFlavorException {
        return (String) clipboard.getData(DataFlavor.stringFlavor);
    }

    public void set_to_clipboard(String new_copied) throws IOException, UnsupportedFlavorException {
        StringSelection stringSelection = new StringSelection(new_copied);
        clipboard.setContents(stringSelection, null);
    }

    @Override
    public void run() {

        //Detect copied data
        Thread copy_action_detecter = new Thread() {
            @Override
            public void run() {

                clipboard.addFlavorListener(new FlavorListener() {
                    @Override
                    public void flavorsChanged(FlavorEvent e) {
                        try {
                            CopyContent copycontent = new CopyContent();
                            copycontent.setSource_device_ip(my_ip);
                            copycontent.setContent(get_from_clipboard());
                            //ccl.transfer((String) clipboard.getData(DataFlavor.stringFlavor));
                            ccl.transfer(copycontent);

                        } catch (Exception ex) {
                        }
                    }
                });
            }
        };
        //update clipboard
        Thread updater = new Thread() {
            @Override
            public void run() {

                long previous = 0;
                while (connected) {

                    try {
                        CopyContent pulled_content = ccl.update();

                        if (pulled_content != null && !pulled_content.getSource_device_ip().equals(my_ip)) {

                            System.out.println(pulled_content.getTimestamp());//
                            System.out.println(pulled_content.getContent());

                            if (previous != pulled_content.getTimestamp()) {
                                set_to_clipboard(pulled_content.getContent());
                                previous = pulled_content.getTimestamp();
                            }
                        }

//                        if (!get_from_clipboard().equals(pulled_data)) {
//                            set_to_clipboard(pulled_data);
//                        }
                        Thread.sleep(1000 * ref_rate);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                        }
                    }

                    //System.out.println("when running " + my_ip);
                }
            }
        };

        copy_action_detecter.start();
        updater.start();

    }

}
