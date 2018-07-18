package com.example.dekormarket.dto;

public class PersonRequest {

    private String firstName;

    private String lastName;

    private String phone;

    private String address;

    private String cityAndRegion;



    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCityAndRegion() {
        return cityAndRegion;
    }

    public void setCityAndRegion(String cityAndRegion) {
        this.cityAndRegion = cityAndRegion;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
