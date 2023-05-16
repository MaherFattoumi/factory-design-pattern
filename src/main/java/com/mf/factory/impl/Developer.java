package com.mf.factory.impl;

import com.mf.factory.Employee;

public class Developer implements Employee {
    @Override
    public String getRole() {
        return "Developer";
    }
}

