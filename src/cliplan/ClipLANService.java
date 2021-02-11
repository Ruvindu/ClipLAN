package cliplan;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class ClipLANService extends UnicastRemoteObject implements ClipLAN {

    private ArrayList<String> connected_client_ips = new ArrayList<String>();
    //private int connected_client_count = 0;
    //private String copied_data = ""
    private CopiedContent copycontent;

    private ClipLANDemo main_window;

    public ClipLANService(ClipLANDemo main_window) throws RemoteException {
        super();
        this.main_window = main_window;
    }

    @Override
    public boolean connect_me(String ip) {
        if (!connected_client_ips.contains(ip)) {
            connected_client_ips.add(ip);
            //connected_client_count = connected_client_ips.size();
            main_window.connected_clients_label.setText(String.valueOf(connected_client_ips.size()));
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void disconnect_me(String ip) {
        connected_client_ips.remove(ip);
        //connected_client_count = connected_client_ips.size();
        main_window.connected_clients_label.setText(String.valueOf(connected_client_ips.size()));
    }

    @Override
    public void transfer(CopiedContent copycontent) {
        this.copycontent = copycontent;
    }

    @Override
    public CopiedContent update() throws RemoteException {
        return this.copycontent;
    }

}
