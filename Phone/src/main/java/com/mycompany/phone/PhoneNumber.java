/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.phone;

/**
 *
 * @author Admin
 */
import java.util.*;
public class PhoneNumber {
    String name;
    ArrayList<String> phone;

    public PhoneNumber(String name,String phone) {
        this.name = name;
        this.phone = new ArrayList<>();
        this.phone.add(phone);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getPhone() {
        return phone;
    }
}
