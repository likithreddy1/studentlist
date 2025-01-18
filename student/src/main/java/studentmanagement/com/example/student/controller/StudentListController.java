package studentmanagement.com.example.student.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import studentmanagement.com.example.student.entity.StudentEntity;
import studentmanagement.com.example.student.service.StudentService;

@Controller
public class StudentListController {

    private final StudentService studentService;

    public StudentListController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }

    @RequestMapping("/students")
    @ResponseBody
    public String listStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }

    @PostMapping("/students")
    public String addStudent(@ModelAttribute("student") StudentEntity student) {
        studentService.addStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/students/edit/{id}")
    public String updateStudendata(@PathVariable Long id, Model model) {
        model.addAttribute("student", studentService.getByID(id));
        return "edit_student";
    }

    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id,
                                @ModelAttribute("student") StudentEntity student,
                                Model model) {

        // get student from database by id
        StudentEntity oldData = studentService.getByID(id);
        oldData.setId(id);
        oldData.setStudentname(student.getStudentname());
        oldData.setStudentage(student.getStudentage());
        oldData.setStudentclass(student.getStudentclass());
        oldData.setPhonenumber(student.getPhonenumber());

        // save updated student object
        studentService.updateStudentData(oldData);
        return "redirect:/students";
    }

    // handler method to handle delete student request

    @GetMapping("/students/{id}")
    public String deleteStudentData(@PathVariable Long id) {
        studentService.deleteStudentData(id);
        return "redirect:/students";
    }
}
