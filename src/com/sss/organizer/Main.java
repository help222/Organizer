package com.sss.organizer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> events = EventsGen.events();
        List<String> tasks = EventsGen.tasks();
        List<String> notes = EventsGen.notes();
        List<String> times = new ArrayList<String>();
        Random random = new Random();
        while (true) {
            System.out.println("1.Подивитися всі події");
            System.out.println("2.Подивитися всі завдання");
            System.out.println("3.Подивитися всі замітки");
            System.out.println("4.Додати подію");
            System.out.println("5.Додати завдання");
            System.out.println("6.Додати замітку");
            System.out.println("7.Видалити подію");
            System.out.println("8.Видалити завдання");
            System.out.println("9.Видалити замітку");
            System.out.println("10.Вийти");
            int resp = Integer.parseInt(scanner.nextLine());
            if (resp == 1) {
                System.out.println("Події на сьогодні");
                    if (times.isEmpty()){
                        for (int i = 0; i < events.size(); i++) {
                            String minutes2;
                            int hours = random.nextInt(24);
                            int minutes = random.nextInt(60);
                            if (minutes <= 10) {
                                minutes2 = "0" + String.valueOf(minutes);
                            } else minutes2 = String.valueOf(minutes);
                            System.out.println(events.get(i) + " час: " + hours + ":" + minutes2);
                            times.add(hours + ":" + minutes2);
                        }
                    }
                    else {
                        for (int i = 0; i < events.size(); i++) {
                            System.out.println(events.get(i) + " час: " + times.get(i));
                        }
                    }
                scanner.nextLine();
            } else if (resp == 2) {
                System.out.println("Завдання сьогодні");
                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println(tasks.get(i));
                }
                scanner.nextLine();
            } else if (resp == 3) {
                System.out.println("Замітки сьогодні");
                for (int i = 0; i < notes.size(); i++) {
                    System.out.println(notes.get(i));
                }
                scanner.nextLine();


            } else if (resp == 4){
                System.out.println("Яку подію хочете додати?");
                String event = scanner.nextLine();
                System.out.println("Коли буде ця подія");
                String time = scanner.nextLine();
                events.add(event);
                times.add(time);
            } else if (resp == 5){
                System.out.println("Яке завдання хочете додати?");
                String task = scanner.nextLine();
                tasks.add(task);
            }
            else if (resp == 6){
                System.out.println("Яку замітку хочете додати?");
                String note = scanner.nextLine();
                notes.add(note);
            }else if (resp == 7){
                System.out.println("Яку подію хочете видалити?");
                for (int i = 0; i < events.size() ; i++) {
                    System.out.println((i+1) + "." + events.get(i));
                }
                int choice = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i <events.size() ; i++) {
                    if (choice == i+1){
                        events.remove(i);
                    }
                }
            }
            else if (resp == 8){
                System.out.println("Яке завдання хочете видалити?");
                for (int i = 0; i < tasks.size() ; i++) {
                    System.out.println((i+1) + "." + tasks.get(i));
                }
                int choice = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i <tasks.size() ; i++) {
                    if (choice == i+1){
                        tasks.remove(i);
                    }
                }
            }
            else if (resp == 9){
                System.out.println("Яку заміту хочете видалити?");
                for (int i = 0; i < notes.size() ; i++) {
                    System.out.println((i+1) + "." + notes.get(i));
                }
                int choice = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i <notes.size() ; i++) {
                    if (choice == i+1){
                        notes.remove(i);
                    }
                }
            }
            else if (resp == 10){
                System.out.println("Допобачення");
                break;
            }
        }
    }
}
