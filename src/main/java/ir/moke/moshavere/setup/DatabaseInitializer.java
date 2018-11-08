package ir.moke.moshavere.setup;

import ir.moke.moshavere.model.entity.Role;
import ir.moke.moshavere.model.entity.User;
import ir.moke.moshavere.model.repository.RoleRepository;
import ir.moke.moshavere.model.repository.UserRepository;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Startup
@Singleton
public class DatabaseInitializer {

    @EJB
    private UserRepository userRepository;

    @EJB
    private RoleRepository roleRepository ;

    @PostConstruct
    public void setup() {
        User u = new User();
        u.setUsername("admin");
        u.setPassword("adminpass");

        Role role = new Role() ;
        role.setName("admin");
        role.setUsername("admin");

        userRepository.insert(u);
        roleRepository.insert(role);
    }
}
