package ir.moke.moshavere.model.repository;

import ir.moke.moshavere.model.entity.Subject;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class SubjectRepository {

    @PersistenceContext
    private EntityManager em;

    public void insert(Subject subject){
        em.persist(subject);
    }

    public void update(Subject subject){
        em.merge(subject);
    }

    public void delete(Subject subject){
        em.remove(subject);
    }

    public Subject select(long id){
        return em.find(Subject.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<Subject> select(String name, String price){
        return em.createQuery("select e from Subject e where e.name = :n and e.price = :p")
                .setParameter("n", name)
                .setParameter( "p", price).getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<Subject> select(){
        return em.createQuery("select e from Subject e").getResultList();
    }
}
