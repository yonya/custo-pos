package cl.custo.model;

import java.util.Date;
import java.util.UUID;

public class Employee extends Person {
    private Department departmentName;
    private String employeeId;
    private Boolean active;
    private Boolean isUser;
    private User user;

    public Employee(UUID uuid, String personId, String name, String surname, Date birthdate, Address[] address, String mail, Department departmentName, String employeeId, Boolean active, Boolean isUser, User user) {
        super(uuid, personId, name, surname, birthdate, address, mail);
        this.departmentName = departmentName;
        this.employeeId = employeeId;
        this.active = active;
        this.isUser = isUser;
        this.user = user;
    }

    public Department getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(Department departmentName) {
        this.departmentName = departmentName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getUser() {
        return isUser;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setUser(Boolean user) {
        isUser = user;
    }

}