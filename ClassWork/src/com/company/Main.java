package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ball мяч = new Ball();
        Book книга = new Book();
        try {
            мяч.setColor(scanner.nextLine());
            мяч.setRadius(scanner.nextInt());
            мяч.setWeight(scanner.nextInt());
            книга.setAuthor(scanner.nextLine());
            книга.setName(scanner.nextLine());
            книга.setNumberOfPages(scanner.nextInt());

        } catch (Exception exception) {
            System.out.println(exception);
        }

    }
}
