package org.format.demo.service.impl;

import org.format.demo.dao.IBaseDao;
import org.format.demo.model.Employee;
import org.format.demo.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    private IBaseDao baseDao;

    public Employee getById(Integer id) {
        return (Employee)baseDao.getById(id, Employee.class);
    }

    public void saveOrUpdate(Employee employee) {
        baseDao.saveOrUpdate(employee);
    }

    public void delete(Employee user) {
        baseDao.delete(user);
    }

    public void delete(Integer id) {
        baseDao.delete(baseDao.getById(id, Employee.class));
    }

    public List<Employee> list() {
        return (List<Employee>)baseDao.list(Employee.class);
    }
}
