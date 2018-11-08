package ir.moke.moshavere.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "subjects")
public class Subjects {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Basic
    @Column(name = "subject", columnDefinition = "VARCHAR(150)")
    private String subject;

    @Basic
    @Column(name = "price", columnDefinition = "INT")
    private String price;

    @Basic
    @Column(name = "isActive", nullable = false)
    private boolean isActive = true;

    public Subjects(String subject, String price, boolean isActive) {
        this.subject = subject;
        this.price = price;
        this.isActive = isActive;
    }

    public Subjects() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
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
        Subjects subjects = (Subjects) o;
        return id == subjects.id &&
                Objects.equals(subject, subjects.subject) &&
                Objects.equals(isActive, subjects.isActive) &&
                Objects.equals(price, subjects.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, subject, isActive, price);
    }
}
