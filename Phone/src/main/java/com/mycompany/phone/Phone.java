/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.phone;

/**
 *
 * @author Admin
 */
public abstract class Phone {

    abstract void insertPhone(String name, String phone);
    abstract void removePhone(String name);
    abstract void updatePhone(String name,String oldPhone, String newPhone);
    abstract PhoneNumber searchPhone(String name);
    abstract void sort();
}
