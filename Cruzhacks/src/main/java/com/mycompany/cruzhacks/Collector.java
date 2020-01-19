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
public class Collector extends User{
    private boolean collectsCardboard;
    private boolean collectsMetal;
    private boolean collectsEwaste;
    private boolean collectsBattery;
    private boolean collectsWood;
    private Collector(String name, String email, String password, String address,
            String phone, boolean type){
        super(name, email, password, address, phone, true);
        collectsCardboard=false;
        collectsMetal=false;
        collectsEwaste=false;
        collectsBattery=false;
        collectsWood=false;        
    }
    public void setCarboard(boolean change){
        this.collectsCardboard = change;
    }
    public void setMetal(boolean change){
        this.collectsMetal = change;
    }
    public void setEwaste(boolean change){
        this.collectsEwaste = change;
    }
    public void setBattery(boolean change){
        this.collectsBattery = change;
    }
    public void setWood(boolean change){
        this.collectsWood = change;
    }
    public boolean getsCardboard(){
        return this.collectsCardboard;
    }
    public boolean getsMetal(){
        return this.collectsMetal ;
    }
    public boolean getsEwaste(){
        return this.collectsEwaste ;
    }
    public boolean getsBattery(){
        return this.collectsBattery ;
    }
    public boolean getsWood(){
        return this.collectsWood ;
    }
    
}
