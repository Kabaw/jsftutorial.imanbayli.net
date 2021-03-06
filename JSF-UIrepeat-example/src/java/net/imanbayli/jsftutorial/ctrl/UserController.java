/*
 * UserController.java
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on May 20, 2016  6:32:36 PM
 * Copyright www.imanbayli.net 2016.All rights reserved
 */
package net.imanbayli.jsftutorial.ctrl;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import net.imanbayli.jsftutorial.bean.Employee;

/**
 *
 * @author Murad R. Imanbayli <muradimanbayli at gmail.com>
 */
@ManagedBean
@SessionScoped
public class UserController {
    private List<Employee> employees=null;
    
    @PostConstruct
    public void init(){
        employees=new ArrayList<Employee>();
        employees.add(new Employee("Murad", "Imanbayli", 1992));
        employees.add(new Employee("Ilkin", "Abdullayev", 1993));
        employees.add(new Employee("Fuad", "Pasabeyli", 1990));
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    
    
    
}
