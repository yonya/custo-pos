package cl.custo.model;

import cl.custo.constants.Country;

public class Address {
    private String street;
    private String restofaddress;
    private String city;
    private String state;
    private String zip;
    private Country country;

    public Address(String street, String city, String state, String zip, Country country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Address [street=" + street + ", city=" + city + ", state="
                + state + ", zip=" + zip + "]";
    }

}