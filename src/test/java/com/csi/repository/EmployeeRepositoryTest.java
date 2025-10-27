package com.csi.repository;

import com.csi.model.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

@DataJpaTest
class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    void testFindByNameContainingIgnoreCase() {
        List<Employee> results = employeeRepository.findByEmpNameContainingIgnoreCase("becca");
        assertEquals(1, results.size());
        assertEquals("Rebecca V", results.get(0).getEmpName());
    }
}

