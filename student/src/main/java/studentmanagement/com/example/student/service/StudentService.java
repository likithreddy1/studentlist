package studentmanagement.com.example.student.service;

import org.springframework.stereotype.Service;
import studentmanagement.com.example.student.entity.StudentEntity;
import studentmanagement.com.example.student.repository.StudentListRepo;

import java.util.List;
@Service
public class StudentService implements StudentServiceInt{

    public  StudentService(){}
    private StudentListRepo studentListRepo ;
    public StudentService(StudentListRepo studentListRepo) {
        this.studentListRepo = studentListRepo;
    }

    public List<StudentEntity> getAllStudents(){
        return studentListRepo.findAll();
    }

    @Override
    public StudentEntity addStudent(StudentEntity student) {
        return studentListRepo.save(student);
    }

    @Override
    public StudentEntity getByID(Long id) {
        return studentListRepo.getReferenceById(id);
    }

    @Override
    public StudentEntity updateStudentData(StudentEntity student) {
        return studentListRepo.save(student);
    }

    @Override
    public void deleteStudentData(Long id) {
        studentListRepo.deleteById(id);;

    }


}
