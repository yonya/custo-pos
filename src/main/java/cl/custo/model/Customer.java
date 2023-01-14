package cl.custo.model;

import java.util.Date;
import java.util.UUID;

public class Customer extends Person {
    private Date lastshop;

    public Customer(UUID uuid, String personId, String name, String surname, Date birthdate, Address[] address, String mail, Date lastshop) {
        super(uuid, personId, name, surname, birthdate, address, mail);
        this.lastshop = lastshop;
    }

    public Date getLastshop() {
        return lastshop;
    }

    public void setLastshop(Date lastshop) {
        this.lastshop = lastshop;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "lastshop=" + lastshop +
                '}';
    }
}
