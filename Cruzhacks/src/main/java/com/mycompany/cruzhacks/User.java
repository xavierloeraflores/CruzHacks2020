/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cruzhacks;

/**
 *
 * @author xavierloera
 */
public class User {
    private String name;
    private String phone;
    private String email;
    private String address;
    private boolean userType; //1 for collector, 0 for distributor
    private String password;
    
    public User(String inname, String inemail, String inpassword, String inaddress, 
            String inphone, boolean intype ){
        name=inname; 
        email=inemail;
        password=inpassword;
        address=inaddress;
        phone=inphone;
        userType=intype;
                                    
    }
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public String getEmail(){
        return this.email;
    }
    public boolean getUserType(){
        return this.userType;
    }
    
    public boolean checkPass(String intext){
        if(password.equals(intext)){
            return true;
        }
        return false;
    }
    
}
