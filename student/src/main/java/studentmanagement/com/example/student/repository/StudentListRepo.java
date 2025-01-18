package studentmanagement.com.example.student.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import studentmanagement.com.example.student.entity.StudentEntity;

public interface StudentListRepo extends JpaRepository<StudentEntity, Long> {

}


