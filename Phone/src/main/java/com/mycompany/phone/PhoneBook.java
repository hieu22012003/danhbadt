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
public class PhoneBook {
     public ArrayList<PhoneNumber> PhoneList;

    public PhoneBook() {
        PhoneList = new ArrayList<>();
    }

    
    void insertPhone(String name, String phone) {
        for(PhoneNumber p : PhoneList) {
            if(p.getName().equals(name)){
                if(p.getPhone().contains(phone)){
                    System.out.println("Lien lac nay da ton tai");
                    return;
                }
                p.getPhone().add(phone);
                System.out.println("da them so "+phone+" vao lien lac co san");
                return;
            }
        }
        PhoneNumber pn = new PhoneNumber(name,phone);
        PhoneList.add(pn);
        System.out.println("da them "+name+" vao lien lac");
    }

    void removePhone(String name) {
        for(PhoneNumber p : PhoneList) {
            if(p.getName().equals(name)){
                PhoneList.remove(p);
            }
        }
    }

    void updatePhone(String name, String oldPhone, String newPhone) {
        for(PhoneNumber p : PhoneList) {
            if(p.getName().equals(name)){
                p.getPhone().remove(oldPhone);
                p.getPhone().add(newPhone);
            }
        }
    }

    PhoneNumber searchPhone(String name) {
        for(PhoneNumber p : PhoneList) {
            if(p.getName().equals(name)){
                return p;
            }
        }
        return null;
    }

    void sort() {
        Collections.sort(PhoneList, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
}
