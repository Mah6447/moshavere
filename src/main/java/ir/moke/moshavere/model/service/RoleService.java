package ir.moke.moshavere.model.service;

import ir.moke.moshavere.model.entity.Role;
import ir.moke.moshavere.model.repository.RoleRepository;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class RoleService {

    @EJB
    private RoleRepository repo;

    public void save(Role role) {
        repo.insert(role);
    }

    public List<Role> select(String username) {
        return repo.select(username);
    }
}
