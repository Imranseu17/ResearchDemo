package bd.ac.seu.researchdemo.Models.data;

import bd.ac.seu.researchdemo.Models.Attendance;
import bd.ac.seu.researchdemo.Models.course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface AttendenceDao extends CrudRepository<Attendance,Integer> {
}
