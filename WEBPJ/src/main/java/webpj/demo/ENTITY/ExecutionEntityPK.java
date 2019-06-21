package webpj.demo.ENTITY;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ExecutionEntityPK implements Serializable {
    private int hid;
    private int uid;

    @Column(name = "HID")
    @Id
    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    @Column(name = "UID")
    @Id
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExecutionEntityPK that = (ExecutionEntityPK) o;
        return Objects.equals(hid, that.hid) &&
                Objects.equals(uid, that.uid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hid, uid);
    }
}
