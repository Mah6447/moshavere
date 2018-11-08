package ir.moke.moshavere.model.repository;

import ir.moke.moshavere.model.entity.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class UserRepository {

    @PersistenceContext
    private EntityManager em;

    public void insert(User user) {
        em.persist(user);
    }

    public void update(User user) {
        em.merge(user);
    }

    public User select(long id) {
        return em.find(User.class, id);
    }

    public User select(String username) {
        return (User) em.createQuery("SELECT u from User u where u.username=:x").setParameter("x", username).getSingleResult();
    }

    @SuppressWarnings("unchecked")
    public List<User> select() {
        return (List<User>) em.createQuery("SELECT  u from User u").getSingleResult();
    }
}
