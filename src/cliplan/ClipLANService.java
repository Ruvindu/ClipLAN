package cliplan;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class ClipLANService extends UnicastRemoteObject implements ClipLAN {

    private ArrayList<String> connected_client_ips = new ArrayList<String>();
    //private int connected_client_count = 0;
    //private String copied_data = ""
    private CopyContent copycontent;
    
    
    private ClipLANDemo main_window;
    
    
    

    public ClipLANService(ClipLANDemo main_window) throws RemoteException {
        super();
        this.main_window = main_window;
    }

    @Override
    public boolean connect_me(String ip) {
        //System.out.println(ip);
        
        for (String connected_client_ip : connected_client_ips) {
            System.out.println("["+connected_client_ip+"]");
        }

        if (!connected_client_ips.contains(ip)) {
            connected_client_ips.add(ip);
            //connected_client_count = connected_client_ips.size();
            main_window.connected_clients_label.setText(String.valueOf(connected_client_ips.size()));
            return true;
        }else{
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
    public void transfer(CopyContent copycontent) {
        this.copycontent = copycontent;
    }

    @Override
public CopyContent update() throws RemoteException {
        return this.copycontent;
    }

}
