package ir.moke.moshavere.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "User_Subject")
public class UserSubject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToMany
    private User user;

    @ManyToMany
    private Subject subject;

}
