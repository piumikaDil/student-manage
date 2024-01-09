package me.piumika.student_manage.dto;
//Author : Piumika Dilshan
//Connect : piumikadil@gmail.com

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {
    private String id;
    private String name;
    private String address;
    private  int age;
    private String dob;

}
