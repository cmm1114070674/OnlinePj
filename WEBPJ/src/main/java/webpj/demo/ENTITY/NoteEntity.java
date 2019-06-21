package webpj.demo.ENTITY;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "note", schema = "onlinepj", catalog = "")
@IdClass(NoteEntityPK.class)
public class NoteEntity {
    private int courseId;
    private int uid;
    private String discription;

    @Id
    @Column(name = "CourseID")
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Id
    @Column(name = "UID")
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
        NoteEntity that = (NoteEntity) o;
        return Objects.equals(courseId, that.courseId) &&
                Objects.equals(uid, that.uid) && Objects.equals(discription, that.discription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId, uid, discription);
    }
}
