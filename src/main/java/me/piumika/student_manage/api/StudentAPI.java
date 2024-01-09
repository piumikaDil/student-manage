package me.piumika.student_manage.api;
//Author : Piumika Dilshan
//Connect : piumikadil@gmail.com

import me.piumika.student_manage.dto.StudentDTO;
import me.piumika.student_manage.service.StudentService;
import me.piumika.student_manage.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/student")
@CrossOrigin("*")
public class StudentAPI {
    @Autowired
    private StudentService service;

    @PostMapping
    public ResponseUtil saveStudent(@RequestBody StudentDTO dto) {
        service.saveStudent(dto);
        return new ResponseUtil(200, "Save success!", null);
    }

    @DeleteMapping("/{id}")
    public ResponseUtil deleteStudent(@PathVariable(value = "id") String id) {
        service.deleteStudent(id);
        return new ResponseUtil(200, "Delete success!", null);
    }

    @PutMapping("/{id}")
    public ResponseUtil updateStudent(@PathVariable(value = "id") String id, @RequestBody StudentDTO dto) {
        service.updateStudent(id, dto);
        return new ResponseUtil(200, "Update success!", null);
    }

    @GetMapping
    public List<StudentDTO> addStudent() {
        return service.getAllStudent();
    }

    @GetMapping("/{id}")
    public StudentDTO getOneStudent(@PathVariable(value = "id")String id){
        return service.getOneStudent(id);
    }



}
