package cz.czechitas.java2webapps.ukol3.entity;

public class Card {
    private String name;
    private String company;
    private String street;
    private String city;
    private String email;
    private String phoneNumber;
    private String webAddress;

    public Card() {
    }

    public Card(String name, String company, String street, String city, String email, String phoneNumber, String webAddress) {
        this.name = name;
        this.company = company;
        this.street = street;
        this.city = city;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.webAddress = webAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
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

    public String getAddress() {
        return street + ", " + city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getWebAddress() {
        return webAddress;
    }

    public void setWebAddress(String webAddress) {
        this.webAddress = webAddress;
    }
}
