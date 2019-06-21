package webpj.demo.ENTITY;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "execution", schema = "onlinepj", catalog = "")
@IdClass(ExecutionEntityPK.class)
public class ExecutionEntity {
    private int hid;
    private int uid;
    private int score;
    private String homework;

    @Id
    @Column(name = "HID")
    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
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
    @Column(name = "Score")
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Basic
    @Column(name = "Homework")
    public String getHomework() {
        return homework;
    }

    public void setHomework(String homework) {
        this.homework = homework;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExecutionEntity that = (ExecutionEntity) o;
        return Objects.equals(hid, that.hid) &&
                Objects.equals(uid, that.uid) &&
                Objects.equals(score, that.score) &&
                Objects.equals(homework, that.homework);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hid, uid, score, homework);
    }
}
