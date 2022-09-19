package tech.getarrays.employeemanager2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

@SpringBootApplication
public class EmployeeManager2Application {

    public static void main(String[] args) {
        RandomGeneratorFactory<RandomGenerator> factory = RandomGeneratorFactory.of("L128X1024MixRandom");
        RandomGenerator randomGenerator= factory.create();
        SpringApplication.run(EmployeeManager2Application.class, args);
    }

}
