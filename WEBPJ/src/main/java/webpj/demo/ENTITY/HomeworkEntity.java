package webpj.demo.ENTITY;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "homework", schema = "onlinepj", catalog = "")
public class HomeworkEntity {
    private int hid;
    private int courseId;
    private String discription;

    @Id
    @Column(name = "HID")
    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    @Basic
    @Column(name = "CourseID")
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
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
        HomeworkEntity that = (HomeworkEntity) o;
        return Objects.equals(hid, that.hid) &&
                Objects.equals(courseId, that.courseId) &&
                Objects.equals(discription, that.discription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hid, courseId, discription);
    }
}
