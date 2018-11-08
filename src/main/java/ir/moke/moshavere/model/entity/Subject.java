package ir.moke.moshavere.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "subjects")
public class Subject {

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

    public Subject(String subject, String price, boolean isActive) {
        this.subject = subject;
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
        Subject subject = (Subject) o;
        return id == subject.id &&
                Objects.equals(this.subject, subject.subject) &&
                Objects.equals(isActive, subject.isActive) &&
                Objects.equals(price, subject.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, subject, isActive, price);
    }
}
