package com.pockocmoc.spring.rest.dao;

import com.pockocmoc.spring.rest.entity.Employee;
import java.util.List;

public interface EmployeeDAO {
    
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);
    
    public void deleteEmployee(int id);
}
