package studentmanagement.com.example.student.entity;

import jakarta.persistence.*;

@Entity
@Table(name="studentData")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long studentid;
    @Column(name = "name", nullable = false)
    private String studentname;
    @Column(name = "age", nullable = false)
    private String studentage;
    @Column(name = "class", nullable = false)
    private String studentclass;
    @Column(name = "number", nullable = false)
    private String phonenumber;

    public StudentEntity(){

    }
    public StudentEntity(String studentname, String studentage, String studentclass, String phonenumber) {
        this.studentname = studentname;
        this.studentage = studentage;
        this.studentclass = studentclass;
        this.phonenumber = phonenumber;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public long getId() {
        return studentid;
    }

    public void setId(long studentid) {
        this.studentid = studentid;
    }

    public String getStudentclass() {
        return studentclass;
    }

    public void setStudentclass(String studentclass) {
        this.studentclass = studentclass;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getStudentage() {
        return studentage;
    }

    public void setStudentage(String studentage) {
        this.studentage = studentage;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "id=" + studentid +
                ", studentname='" + studentname + '\'' +
                ", studentage='" + studentage + '\'' +
                ", studentclass='" + studentclass + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                '}';
    }
}
