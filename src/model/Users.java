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
public class Users {
    private int userid;
    private String username;
    private String password;
    private String phone;
    private String neigborhood;
    private String zipcode;
    private String city;
    private String state;
    private String street;
    private String email;
    private String streetnumber;
    private String cellphone;
    private int companyid;
    private int roleid;
    private char gender;

    public Users() {
    }

    public Users(int userid, String username, String password, String phone, String neigborhood, String zipcode, String city, String state, String street, String email, String streetnumber, String cellphone, int companyid, int roleid, char gender) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.neigborhood = neigborhood;
        this.zipcode = zipcode;
        this.city = city;
        this.state = state;
        this.street = street;
        this.email = email;
        this.streetnumber = streetnumber;
        this.cellphone = cellphone;
        this.companyid = companyid;
        this.roleid = roleid;
        this.gender = gender;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public int getCompanyid() {
        return companyid;
    }

    public void setCompanyid(int companyid) {
        this.companyid = companyid;
    }

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    
    
}
