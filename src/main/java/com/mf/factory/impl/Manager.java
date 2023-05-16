package com.mf.factory.impl;

import com.mf.factory.Employee;

public class Manager implements Employee {
	@Override
	public String getRole() {
		return "Manager";
	}
}
