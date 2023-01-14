package cl.custo.model;

import java.util.Date;
import java.util.UUID;


public class User extends Person {

    private String username;
    private Boolean active;
    private Date createdDate;
    private Date lastupdated;

    public User(UUID uuid, String personId, String name, String surname, Date birthdate, Address[] address, String mail, String username, Boolean active, Date createdDate, Date lastupdated) {
        super(uuid, personId, name, surname, birthdate, address, mail);
        this.username = username;
        this.active = active;
        this.createdDate = createdDate;
        this.lastupdated = lastupdated;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastupdated() {
        return lastupdated;
    }

    public void setLastupdated(Date lastupdated) {
        this.lastupdated = lastupdated;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", active=" + active +
                ", createdDate=" + createdDate +
                ", lastupdated=" + lastupdated +
                '}';
    }
}
