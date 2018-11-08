package ir.moke.moshavere.model.repository;

import ir.moke.moshavere.model.entity.Role;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class RoleRepository {

    @PersistenceContext
    private EntityManager em;

    public void insert(Role role) {
        em.persist(role);
    }

    @SuppressWarnings("unchecked")
    public List<Role> select(String username) {
        return em.createQuery("select r from Role r where r.username=:u").setParameter("u",username).getResultList();
    }
}
