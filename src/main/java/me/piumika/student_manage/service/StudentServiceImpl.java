package me.piumika.student_manage.service;
//Author : Piumika Dilshan
//Connect : piumikadil@gmail.com

import me.piumika.student_manage.dto.StudentDTO;
import me.piumika.student_manage.entity.StudentEntity;
import me.piumika.student_manage.exeption.NotFoundException;
import me.piumika.student_manage.repo.StudentRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    ModelMapper mapper;
    @Autowired
    private StudentRepo repo;

    @Override
    public void saveStudent(StudentDTO dto) {
        StudentEntity testH = new StudentEntity();
        StudentEntity mapped = mapper.map(dto, StudentEntity.class);
        mapped.setId(testH.getId());
        repo.save(mapped);

    }

    @Override
    public void deleteStudent(String id) {
        if (repo.existsById(id)){
            repo.delete(repo.getStudentById(id));
        }else {
            throw new NotFoundException("This studdent not founs...");
        }

    }

    @Override
    public void updateStudent(String id, StudentDTO dto) {
        StudentEntity student = repo.getStudentById(id);

        if (repo.existsById(id)){
            student.setName(dto.getName());
            repo.save(student);
        }else{
            throw new NotFoundException("Please check the Id...");
        }
    }

    @Override
    public List<StudentDTO> getAllStudent() {
        return mapper.map(repo.findAll(), new TypeToken<List<StudentDTO>>() {
        }.getType());
    }

    @Override
    public StudentDTO getOneStudent(String id) {
        if (!repo.existsById(id)) throw new NotFoundException("Student Does not exist");
        StudentEntity student = repo.findById(id).get();
        return mapper.map(student, StudentDTO.class);
    }

//
}

