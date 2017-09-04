package ${groupId}.jpa.dto;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

public class SampleEntityDto implements Serializable {

    private Long id;
    private String column;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SampleEntityDto that = (SampleEntityDto) o;

        if (column != null ? !column.equals(that.column) : that.column != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return column != null ? column.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "SampleEntityDto{" +
                "id=" + id +
                ", column='" + column + '\'' +
                '}';
    }
}
