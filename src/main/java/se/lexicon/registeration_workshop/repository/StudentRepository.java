package se.lexicon.registeration_workshop.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.registeration_workshop.entity.Student;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, String> {

    List<Student> findByEmail(String email);

    List<Student> findByFirstNameAndLastName(String firstNme, String lastName);

    List<Student> findByFirstName(String firstName);

    List<Student> findByLastName(String lastName);
}
