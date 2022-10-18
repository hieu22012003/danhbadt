/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.phone;

/**
 *
 * @author Admin
 */
public class test {
    public static void main(String[] args){
        PhoneBook pb = new PhoneBook();
        pb.insertPhone("Bach","0962310869");
        pb.insertPhone("Bach","0962310869");
        pb.insertPhone("Bach","0987654321");
        pb.insertPhone("Trung","0982629263");
        pb.insertPhone("Vanh","0987693535");
        pb.insertPhone("Huy","0986485002");
        System.out.println(pb.PhoneList.size());
        pb.updatePhone("Trung","0982629263","0948967883");

        PhoneNumber p = pb.searchPhone("Nam");
        if(p != null){
            System.out.println(p.getName());
        }else{
            System.out.println("Not found");
        }

        pb.sort();
        for(PhoneNumber pn: pb.PhoneList){
            System.out.println(pn.getName());
        }
    }    
}
