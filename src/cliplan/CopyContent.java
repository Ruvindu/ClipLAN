package cliplan;

import java.io.Serializable;
import java.sql.Timestamp;

public class CopyContent implements Serializable {

    long timestamp = new Timestamp(System.currentTimeMillis()).getTime();
    String source_device_ip;
    String content;

    public long getTimestamp() {
        return timestamp;
    }

    public String getSource_device_ip() {
        return source_device_ip;
    }

    public void setSource_device_ip(String source_device_ip) {
        this.source_device_ip = source_device_ip;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
