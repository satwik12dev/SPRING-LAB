package com.naresh.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@AllArgsConstructor
public class StudentDeails {

    private int rollNumber;
    private String name;
    private String email;
    private String phone;
    private String address;
}