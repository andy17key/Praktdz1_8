/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktdz_1_8;

/**
 *
 * @author Andrew B
 */
public class Passport implements Comparable<Passport> {
    private int number;
    private String name;
    private String job;
    private boolean pass;

    public Passport(int number, String name, String job, boolean pass) {
        this.number = number;
        this.name = name;
        this.job = job;
        this.pass = pass;
    }
    public int getNumber() {
        return number;
    }
    public String getName() {
        return name;
    }
    public String getJob() {
        return job;
    }
    public boolean getPass() {
        return pass;
    }

    @Override
    public int compareTo(Passport o) {
        return name.compareTo(o.getName());
    }
}

