package webpj.demo.ENTITY;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "resource", schema = "onlinepj")
public class ResourceEntity {
    private int rid;
    private int courseId;
    private Date createTime;
    private String path;

    @Id
    @Column(name = "RID")
    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
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
    @Column(name = "createtime")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "Path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResourceEntity that = (ResourceEntity) o;
        return Objects.equals(rid, that.rid) &&
                Objects.equals(courseId, that.courseId) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(path, that.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rid, courseId, createTime, path);
    }
}
