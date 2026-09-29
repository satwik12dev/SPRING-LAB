package in.naresh.databaseproject.entity;

import in.naresh.databaseproject.rollgenerate.GenerateRollNo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "students_details")
public class StudentEntity {

    @Id
    @GenerateRollNo
    private String rollNo;

    private String name;
    private String phoneNumber;
    private String email;
    private Date date;
}