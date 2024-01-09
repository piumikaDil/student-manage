package me.piumika.student_manage.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;
@Document(collection = "Student")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class StudentEntity {
    private String id = "H-" + UUID.randomUUID().toString().replace("-", "").substring(0, 4);
    private String name;
    private String address;
    private  int age;
    private String dob;
}

