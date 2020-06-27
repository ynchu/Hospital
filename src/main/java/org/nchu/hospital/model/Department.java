package org.nchu.hospital.model;

public class Department extends  NamedEntity{
    private  String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
