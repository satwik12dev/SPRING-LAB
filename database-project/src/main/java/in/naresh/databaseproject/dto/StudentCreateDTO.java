package in.naresh.databaseproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentCreateDTO {
    private String name;
    private String phoneNumber;
    private String email;
    private Date date;


}
