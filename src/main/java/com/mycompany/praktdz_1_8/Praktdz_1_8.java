/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.praktdz_1_8;

/**
 *
 * @author Andrew B
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;

public class Praktdz_1_8 {
    public static void main(String[] args) {
        System.out.println("Богданов Андрей Вариант 4");

        ArrayList<Passport> passports = new ArrayList<>();

        passports.add(new Passport(223344,
                "Егоров Егор Егорович", "работник", true));
        passports.add(new Passport(445566,
                "Антонов Андрей Антонович", "сантехник", false));
        passports.add(new Passport(123456,
                "Иванов Иван Иванович", "директор", true));
        passports.add(new Passport(112134,
                "Яковлева Юлия Аристарховна", "секретарь", false));
        passports.add(new Passport(778899,
                "Антонов Антон Антонович", "охранник", false));

        Scanner input = new Scanner(System.in);

        System.out.println("Добавить пропуск в список? 1 - да, 0 - нет");
        int f = input.nextInt();
        if (f == 1) {
            while (f == 1) {
                System.out.println("Введите номер");
                int newNumber = input.nextInt();

                System.out.println("Введите имя");
                String newName = input.next();
                System.out.println("Введите должность");
                String newJob = input.next();
                System.out.println("Есть допуск на территорию? 1 - да, 0 - нет");
                int inputBoolean = input.nextInt();
                boolean newPass;
                if (inputBoolean == 1) {
                    newPass = true;
                }
                else {
                    newPass = false;
                }
                passports.add(new Passport(newNumber, newName, newJob, newPass));

                //сортировка по именам
                Collections.sort(passports, Comparator.comparing(Passport::getName));
                for (Passport p : passports) {
                    System.out.println(p.getName() + ", " + p.getNumber() + ", " + p.getJob() + ", " + p.getPass());
                }
                System.out.println(" ");
                //сортировка по номерам
                Collections.sort(passports, Comparator.comparingInt(Passport::getNumber));
                for (Passport p : passports) {
                    System.out.println(p.getName() + ", " + p.getNumber() + ", " + p.getJob() + ", " + p.getPass());
                }
                System.out.println("Добавить еще? 1 - да, 0 - нет");
                f = input.nextInt();
            }
        }
        else {
            //сортировка по именам
            Collections.sort(passports, Comparator.comparing(Passport::getName));
            for (Passport p : passports) {
                System.out.println(p.getName() + ", " + p.getNumber() + ", " + p.getJob() + ", " + p.getPass());
            }
            System.out.println(" ");
            //сортировка по номерам
            Collections.sort(passports, Comparator.comparingInt(Passport::getNumber));
            for (Passport p : passports) {
                System.out.println(p.getName() + ", " + p.getNumber() + ", " + p.getJob() + ", " + p.getPass());
            }
        }
    }
}