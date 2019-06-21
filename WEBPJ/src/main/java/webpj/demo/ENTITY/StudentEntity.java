package webpj.demo.ENTITY;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "student", schema = "onlinepj", catalog = "")
@IdClass(StudentEntityPK.class)
public class StudentEntity {
    private int courseId;
    private int uid;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentEntity that = (StudentEntity) o;
        return Objects.equals(courseId, that.courseId) &&
                Objects.equals(uid, that.uid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId, uid);
    }
}
