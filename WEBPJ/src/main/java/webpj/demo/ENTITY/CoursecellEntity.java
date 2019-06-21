package webpj.demo.ENTITY;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "coursecell", schema = "onlinepj")
public class CoursecellEntity {
    private int cellId;
    private int unitId;
    private String cellName;
    private String discription;
    private String path;

    @Id
    @Column(name = "CellID")
    public int getCellId() {
        return cellId;
    }

    public void setCellId(int cellId) {
        this.cellId = cellId;
    }

    @Basic
    @Column(name = "UnitID")
    public int getUnitId() {
        return unitId;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }

    @Basic
    @Column(name = "cellname")
    public String getCellName() {
        return cellName;
    }

    public void setCellName(String cellName) {
        this.cellName = cellName;
    }

    @Basic
    @Column(name = "Discription")
    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
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
        CoursecellEntity that = (CoursecellEntity) o;
        return Objects.equals(cellId, that.cellId) &&
                Objects.equals(unitId, that.unitId) &&
                Objects.equals(cellName, that.cellName) &&
                Objects.equals(discription, that.discription) &&
                Objects.equals(path, that.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cellId, unitId, cellName, discription, path);
    }
}
