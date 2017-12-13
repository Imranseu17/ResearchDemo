package bd.ac.seu.researchdemo.repository;

import bd.ac.seu.researchdemo.Models.Registration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface RegistrationDao extends CrudRepository<Registration,Integer> {
    public List<Registration> findBySectionId(int id);
    public  List<Registration> findByStudentStudentId(String id);

}
