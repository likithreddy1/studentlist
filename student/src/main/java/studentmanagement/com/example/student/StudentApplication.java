package studentmanagement.com.example.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import studentmanagement.com.example.student.entity.StudentEntity;
import studentmanagement.com.example.student.repository.StudentListRepo;

@SpringBootApplication
public class StudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}

//	@Autowired
//	private StudentListRepo studentRepository;
//
//	public void run(String... args) throws Exception {
//
//
//		 StudentEntity student1 = new StudentEntity("likith", "10","5","9003320102");
//		 studentRepository.save(student1);
//		StudentEntity student2 = new StudentEntity("likith", "10","5","9003320102");
//		 studentRepository.save(student2);
//		StudentEntity student3 = new StudentEntity("likith", "10","5","9003320102");
//		 studentRepository.save(student3);
//
//
//	}

}
