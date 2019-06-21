package webpj.demo.ENTITY;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users", schema = "onlinepj", catalog = "")
public class UsersEntity {
    private int uid;
    private String UserName;
    private String pass;

    @Id
    @Column(name = "UID")
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "username" )
    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        this.UserName = userName;
    }

    @Basic
    @Column(name = "Pass")
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersEntity that = (UsersEntity) o;
        return Objects.equals(uid, that.uid) &&
                Objects.equals(UserName, that.UserName) &&
                Objects.equals(pass, that.pass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, UserName, pass);
    }
}
