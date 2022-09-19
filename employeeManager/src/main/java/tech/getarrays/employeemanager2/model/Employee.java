package tech.getarrays.employeemanager2.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String phone;
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String employeeCode;

    /**
     * Constructor without the id
     * @param name
     * @param email
     * @param jobTitle
     * @param phone
     * @param imageUrl
     * @param employeeCode
     */
    public Employee(String name, String email, String jobTitle, String phone, String imageUrl, String employeeCode) {
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.phone = phone;
        this.imageUrl = imageUrl;
        this.employeeCode = employeeCode;
    }
    /**
     * empty/default constructor
     */
    public Employee() {}

    // getter for Id
    public Long getId() {
        return id;
    }

    // getter for name
    public String getName() {
        return name;
    }

    // getter for email
    public String getEmail() {
        return email;
    }

    // getter for job title
    public String getJobTitle() {
        return jobTitle;
    }

    // getter for phone
    public String getPhone() {
        return phone;
    }

    // getter for image URL
    public String getImageUrl() {
        return imageUrl;
    }

    // getter for employee code
    public String getEmployeeCode() {
        return employeeCode;
    }

    // setter for Id
    public void setId(Long id) {
        this.id = id;
    }

    // setter for name
    public void setName(String name) {
        this.name = name;
    }

    // setter for email
    public void setEmail(String email) {
        this.email = email;
    }

    // setter for job title
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    // setter for phone
    public void setPhone(String phone) {
        this.phone = phone;
    }

    // setter for image URL
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    // setter for employee code
    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", employeeCode='" + employeeCode + '\'' +
                '}';
    }
}
