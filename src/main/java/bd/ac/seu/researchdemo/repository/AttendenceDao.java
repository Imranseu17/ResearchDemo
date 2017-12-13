package bd.ac.seu.researchdemo.repository;

import bd.ac.seu.researchdemo.Models.Attendance;
import bd.ac.seu.researchdemo.Models.AttendenceStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;

@Repository
@Transactional
public interface AttendenceDao extends CrudRepository<Attendance,Integer> {
    public List<Attendance> findBySectionId(int id);
    public List<Attendance> findByAttendenceStatusAndSection_IdAndStudentStudentId(AttendenceStatus attendendenceStatus, int sectionId, String studentId);
    public List<Attendance> findByStudentStudentIdAndSectionId(String Sid,int SecId);


}
