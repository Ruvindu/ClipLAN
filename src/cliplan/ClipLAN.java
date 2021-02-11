package cliplan;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ClipLAN extends Remote {

    public boolean connect_me(String ip) throws RemoteException;

    public void disconnect_me(String ip) throws RemoteException;

    public void transfer(CopiedContent copycontent) throws RemoteException;

    public CopiedContent update() throws RemoteException;

}
