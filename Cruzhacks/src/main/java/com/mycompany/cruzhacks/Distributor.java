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
public class Distributor extends User{
    
    public Distributor(String name, String email, String password, String address,
            String phone){
        super(name, email, password, address, phone, false);
    }
    
}
