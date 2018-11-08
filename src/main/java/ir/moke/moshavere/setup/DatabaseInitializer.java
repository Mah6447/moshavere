package ir.moke.moshavere.setup;

import ir.moke.moshavere.model.entity.Role;
import ir.moke.moshavere.model.entity.Subject;
import ir.moke.moshavere.model.entity.User;
import ir.moke.moshavere.model.repository.RoleRepository;
import ir.moke.moshavere.model.repository.UserRepository;
import ir.moke.moshavere.model.service.SubjectService;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Startup
@Singleton
public class DatabaseInitializer {

    @EJB
    private SubjectService service;


    @PostConstruct
    public void setup() {

        Subject s = new Subject();
        s.setName("AAAAAA");
        s.setPrice(123455);

        service.save(s);
    }
}
