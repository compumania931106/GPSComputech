/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author VictorManuel
 */
public class Client {
    private int clientid;
    private String clientname;
    private String phone;
    private String neigborhood;
    private String zipcode;
    private String city;
    private String state;
    private String street;
    private String email;
    private String streetnumber;
    private String rfc;
    private String cellphone;
    private char gender;

    public Client() {
        
    }

    public Client(int clientid, String clientname, String phone, String neigborhood, String zipcode, String city, String state, String street, String email, String streetnumber, String rfc, String cellphone, char gender) {
        this.clientid = clientid;
        this.clientname = clientname;
        this.phone = phone;
        this.neigborhood = neigborhood;
        this.zipcode = zipcode;
        this.city = city;
        this.state = state;
        this.street = street;
        this.email = email;
        this.streetnumber = streetnumber;
        this.rfc = rfc;
        this.cellphone = cellphone;
        this.gender = gender;
    }

    public int getClientid() {
        return clientid;
    }

    public void setClientid(int clientid) {
        this.clientid = clientid;
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNeigborhood() {
        return neigborhood;
    }

    public void setNeigborhood(String neigborhood) {
        this.neigborhood = neigborhood;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreetnumber() {
        return streetnumber;
    }

    public void setStreetnumber(String streetnumber) {
        this.streetnumber = streetnumber;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    
    
    
    
}
