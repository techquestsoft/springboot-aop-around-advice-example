package com.training.springboot.aop.springbootaopbeforeadviceexample.service;

import org.springframework.stereotype.Service;
import com.training.springboot.aop.springbootaopbeforeadviceexample.model.Employee;
@Service
public class EmployeeService
{
    public Employee createEmployee( String empId, String fname, String sname)
    {
        System.out.println("At starting of the createEmployee method");
        Employee emp = new Employee();
        emp.setEmpId(empId);
        emp.setFirstName(fname);
        emp.setSecondName(sname);
        System.out.println("Before returning of the createEmployee method");
        return emp;
    }
    public void deleteEmployee(String empId)
    {
    }
}