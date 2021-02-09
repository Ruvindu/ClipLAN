package cliplan;

public class AlreadyConnectedException extends Exception {

    public AlreadyConnectedException(String ip) {
        super(ip + " is already connected");
    }

}
