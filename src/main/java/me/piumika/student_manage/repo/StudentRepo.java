package me.piumika.student_manage.repo;

import me.piumika.student_manage.entity.StudentEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends MongoRepository<StudentEntity,String> {
   StudentEntity getStudentById (String id);
}
