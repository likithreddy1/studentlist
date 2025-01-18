package studentmanagement.com.example.student.service;

import studentmanagement.com.example.student.entity.StudentEntity;

import java.util.List;

public interface StudentServiceInt {
    public List<StudentEntity> getAllStudents();
    public StudentEntity addStudent(StudentEntity student);
    public StudentEntity getByID(Long id);
    public StudentEntity updateStudentData(StudentEntity student);
    public void deleteStudentData(Long id);

}
