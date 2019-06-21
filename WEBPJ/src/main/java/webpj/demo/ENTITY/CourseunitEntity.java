package webpj.demo.ENTITY;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "courseunit", schema = "onlinepj", catalog = "")
public class CourseunitEntity {
    private int unitId;
    private String unitName;
    private int courseId;

    @Id
    @Column(name = "UnitID")
    public int getUnitId() {
        return unitId;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }

    @Basic
    @Column(name = "unitname")
    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    @Basic
    @Column(name = "CourseID")
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseunitEntity that = (CourseunitEntity) o;
        return Objects.equals(unitId, that.unitId) &&
                Objects.equals(unitName, that.unitName) &&
                Objects.equals(courseId, that.courseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unitId, unitName, courseId);
    }
}
