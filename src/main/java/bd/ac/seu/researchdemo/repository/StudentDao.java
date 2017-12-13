package bd.ac.seu.researchdemo.repository;

import bd.ac.seu.researchdemo.Models.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface StudentDao  extends CrudRepository<Student,String>{
    List<Student> findByStudentId(String id);
}
