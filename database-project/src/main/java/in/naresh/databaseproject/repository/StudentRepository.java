package in.naresh.databaseproject.repository;

import in.naresh.databaseproject.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
}
