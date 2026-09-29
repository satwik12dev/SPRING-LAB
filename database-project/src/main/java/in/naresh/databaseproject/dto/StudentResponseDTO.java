package in.naresh.databaseproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponseDTO {

    private String rollno;
    private String name;
    private String email;
    private String phoneNumber;
    private Date date;
}
