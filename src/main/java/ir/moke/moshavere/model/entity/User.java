package ir.moke.moshavere.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;

    @Basic
    @Column(name = "username",columnDefinition = "VARCHAR(32)")
    private String username ;

    @Basic
    @Column(name = "password",columnDefinition = "VARCHAR(32)")
    private String password ;

    @Basic
    @Column(name = "firstName",columnDefinition = "VARCHAR(20)")
    private String firstName ;

    @Basic
    @Column(name = "lastName",columnDefinition = "VARCHAR(30)")
    private String lastName ;

    @Basic
    @Column(name = "mobile",columnDefinition = "VARCHAR(20)")
    private String mobile ;

    @Basic
    @Column(name = "email",columnDefinition = "VARCHAR(100)")
    private String email ;

    @Basic
    @Column(name = "grad",columnDefinition = "VARCHAR(80)")
    private String grad ;

    @Basic
    @Column(name = "nationalCode",columnDefinition = "VARCHAR(12)")
    private String nationalCode ;

    @Basic
    @Column(name = "shaba",columnDefinition = "VARCHAR(50)")
    private String shaba ;

    public User(String username, String password, String firstName, String lastName, String mobile, String email, String grad, String nationalCode, String shaba) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.email = email;
        this.grad = grad;
        this.nationalCode = nationalCode;
        this.shaba = shaba;
    }

    public User() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getShaba() {
        return shaba;
    }

    public void setShaba(String shaba) {
        this.shaba = shaba;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                Objects.equals(username, user.username) &&
                Objects.equals(password, user.password) &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(mobile, user.mobile) &&
                Objects.equals(email, user.email) &&
                Objects.equals(grad, user.grad) &&
                Objects.equals(nationalCode, user.nationalCode) &&
                Objects.equals(shaba, user.shaba);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, firstName, lastName, mobile, email, grad, nationalCode, shaba);
    }
}
