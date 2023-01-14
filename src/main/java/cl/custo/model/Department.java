package cl.custo.model;

import java.util.UUID;

public class Department {
    private UUID uuid;
    private String departmentId;
    private Boolean active;

    public Department(UUID uuid, String departmentId, Boolean active) {
        this.uuid = uuid;
        this.departmentId = departmentId;
        this.active = active;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

}
