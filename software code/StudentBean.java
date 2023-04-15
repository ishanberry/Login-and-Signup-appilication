/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ishan -pc
 */
 public class StudentBean {
    private long phone_no;
    private String firstname,lastname,username,password,emailid,country,state,address;
    public StudentBean(String firstname,String lastname,String username,String 
            password,String emailid,String country,String state ,long  phoneno,String address)
    {
        
        this.firstname =firstname;
        this.lastname = lastname;
        this.username= username;
        this.password = password;
        this.emailid =emailid;
        this.country =country;
        this.state =state;
        this.phone_no = phoneno;
        this.address =address;
    }

    StudentBean(String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     
     public String getfirstName()
     {
     return firstname;
     }

    public String getLastname() {
        return lastname;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmailid() {
        return emailid;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }
    public long getphoneNo()
     {
     
        return phone_no;
     
     }

    public String getAddress() {
        return address;
    }

   

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setState(String state) {
        this.state = state;
    }
     public void setPhoneno(int phoneno) {
        this.phone_no = phoneno;
    }

    public void setAddress(String address) {
        this.address = address;
    }
   
  
     
}
