package tech.getarrays.employeemanager2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import tech.getarrays.employeemanager2.model.Employee;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    @Transactional
    @Modifying
    @Query("delete from Employee e where e.id = ?1")
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
