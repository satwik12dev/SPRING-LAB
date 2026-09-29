package in.naresh.databaseproject.controller;


import in.naresh.databaseproject.dto.StudentCreateDTO;
import in.naresh.databaseproject.dto.StudentResponseDTO;
import in.naresh.databaseproject.entity.StudentEntity;
import in.naresh.databaseproject.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
public class StudentController {

    private final StudentService studentService;

    @PostMapping("/user")
    public StudentResponseDTO createStudent(@RequestBody StudentCreateDTO student) {
        return studentService.createStudentData(student);
    }

}
