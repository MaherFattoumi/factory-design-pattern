package com.mf.factory.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.mf.factory.Employee;
import com.mf.factory.EmployeeFactory;

public class EmployeeFactoryTest {
    @Test
    void testCreateManager() {
        EmployeeFactory factory = new EmployeeFactory();
        Employee employee = factory.createEmployee("Manager");
        assertEquals("Manager", employee.getRole());
    }

    @Test
    void testCreateDeveloper() {
        EmployeeFactory factory = new EmployeeFactory();
        Employee employee = factory.createEmployee("Developer");
        assertEquals("Developer", employee.getRole());
    }

    @Test
    void testCreateTester() {
        EmployeeFactory factory = new EmployeeFactory();
        Employee employee = factory.createEmployee("Tester");
        assertEquals("Tester", employee.getRole());
    }

    @Test
    void testInvalidEmployeeType() {
        EmployeeFactory factory = new EmployeeFactory();
        assertThrows(IllegalArgumentException.class, () -> {
            factory.createEmployee("InvalidType");
        });
    }
}

