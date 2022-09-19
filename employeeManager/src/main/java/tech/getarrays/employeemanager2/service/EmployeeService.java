package tech.getarrays.employeemanager2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.getarrays.employeemanager2.exception.UserNotFoundException;
import tech.getarrays.employeemanager2.model.Employee;
import tech.getarrays.employeemanager2.repo.EmployeeRepo;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {

    private final EmployeeRepo employeeRepo;

    /**
     * Constructor.
     * @param employeeRepo Autowired repository to be used by the service.
     */
    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    /**
     * Method that adds a new employee into the repository.
     * @param employee Employee to be added.
     * @return Employee added.
     */
    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

    /**
     * Method that returns all employees in our repository.
     * @return List of all employees.
     */
    public List<Employee> findAllEmployee() {
        return employeeRepo.findAll();
    }

    /**
     * Method that updates an employee.
     * @param employee Employee to be updated.
     * @return Employee updated.
     */
    public Employee updateEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    /**
     * Method that finds an employee by his id.
     * @param id Id of the employee we're looking for.
     * @return Employee with that id or an exception if he doesn't exist.
     */
    public Employee findEmployeeById(Long id) {
        return employeeRepo.findEmployeeById(id).orElseThrow(() -> new UserNotFoundException("User with Id " + id + " was not found."));
    }

    /**
     * Method that deletes an employee.
     * @param id Id of the employee to be deleted.
     */
    public void deleteEmployee(Long id) {
        employeeRepo.deleteEmployeeById(id);
    }
}
