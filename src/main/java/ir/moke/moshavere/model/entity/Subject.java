package ir.moke.moshavere.model.entity;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "subjects")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonbTransient
    private long id;

    @Basic
    @Column(name = "name", columnDefinition = "VARCHAR(150)")
    private String name;

    @Basic
    @Column(name = "price", columnDefinition = "INT")
    private int price;

    @Basic
    @Column(name = "isActive", nullable = false)
    private boolean isActive = true;

    public Subject(String name, int price, boolean isActive) {
        this.name = name;
        this.price = price;
        this.isActive = isActive;
    }

    public Subject() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject name = (Subject) o;
        return id == name.id &&
                Objects.equals(this.name, name.name) &&
                Objects.equals(isActive, name.isActive) &&
                Objects.equals(price, name.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, isActive, price);
    }
}
