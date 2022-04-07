/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 001001895
 */
public class Theater {
    private String id;
    private String name;
    private String address;
    private String phoneNumber;
    private operatingHours operatingHours;

    public Theater(String id, String name, String address, String phoneNumber, operatingHours operatingHours) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.operatingHours = operatingHours;
    }

    public operatingHours getOperatingHours() {
        return operatingHours;
    }

    public void setOperatingHours(operatingHours operatingHours) {
        this.operatingHours = operatingHours;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
}
