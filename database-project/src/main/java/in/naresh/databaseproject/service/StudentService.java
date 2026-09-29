package in.naresh.databaseproject.service;


import in.naresh.databaseproject.dto.StudentCreateDTO;
import in.naresh.databaseproject.dto.StudentResponseDTO;
import in.naresh.databaseproject.entity.StudentEntity;
import in.naresh.databaseproject.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentResponseDTO createStudentData(StudentCreateDTO student) {

        System.out.println("Service called");
        StudentEntity entity = new StudentEntity();
        entity.setName((student.getName()));
        entity.setPhoneNumber(student.getPhoneNumber());
        entity.setEmail(student.getEmail());
        entity.setDate(student.getDate());
        studentRepository.save(entity);

        StudentResponseDTO responseDTO = new StudentResponseDTO();
        responseDTO.setName(entity.getName());
        responseDTO.setEmail(entity.getEmail());
        responseDTO.setPhoneNumber(entity.getPhoneNumber());
        responseDTO.setRollno(entity.getRollNo());
        responseDTO.setDate(entity.getDate());

        return  responseDTO;
    }
}
