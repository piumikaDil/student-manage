package me.piumika.student_manage.service;

import me.piumika.student_manage.dto.StudentDTO;

import java.util.List;

public interface StudentService {
    void saveStudent(StudentDTO dto);
    void deleteStudent (String id);
    void updateStudent(String id, StudentDTO dto);
    List<StudentDTO> getAllStudent();
    StudentDTO getOneStudent(String id);
//    HotelDTO searchHotel(String hotelName);
}
