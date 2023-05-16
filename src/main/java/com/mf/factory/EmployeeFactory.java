package com.mf.factory;

import com.mf.factory.impl.Developer;
import com.mf.factory.impl.Manager;
import com.mf.factory.impl.Tester;

public class EmployeeFactory {
    public Employee createEmployee(String employeeType) {
        if (employeeType.equals("Manager")) {
            return new Manager();
        } else if (employeeType.equals("Developer")) {
            return new Developer();
        } else if (employeeType.equals("Tester")) {
            return new Tester();
        } else {
            throw new IllegalArgumentException("Invalid employee type: " + employeeType);
        }
    }
}


