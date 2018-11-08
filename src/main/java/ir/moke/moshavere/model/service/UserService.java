package ir.moke.moshavere.model.service;

import ir.moke.moshavere.model.entity.User;
import ir.moke.moshavere.model.repository.UserRepository;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class UserService {

    @EJB
    private UserRepository repo;

    public void save(User user) {
        repo.insert(user);
    }

    public void update(User user) {
        repo.update(user);
    }

    public User find(long id) {
        return repo.select(id);
    }

    public User find(String username) {
        return repo.select(username);
    }

    public List<User> find() {
        return repo.select();
    }
}
