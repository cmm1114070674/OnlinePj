package webpj.demo.ENTITY;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class NoteEntityPK implements Serializable {
    private int courseId;
    private int uid;
    private String discription;

    @Column(name = "CourseID")
    @Id
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Column(name = "UID")
    @Id
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "Discription")
    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoteEntityPK that = (NoteEntityPK) o;
        return Objects.equals(courseId, that.courseId) &&
                Objects.equals(uid, that.uid) && Objects.equals(discription, that.discription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId, uid, discription);
    }
}
