package ir.moke.moshavere.model.service;

import ir.moke.moshavere.model.entity.Subject;
import ir.moke.moshavere.model.repository.SubjectRepository;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class SubjectService {

    @EJB
    private SubjectRepository repository;

    public void save(Subject subject){
        repository.insert(subject);
    }

    public void edit(Subject subject){
        repository.update(subject);
    }

    public void remove(Subject subject){
        repository.delete(subject);
    }

    public Subject find(long id){
        return repository.select(id);
    }

    public List<Subject> findAll(){
        return repository.select();
    }
}
