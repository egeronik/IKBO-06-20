package com.company;

import java.util.Scanner;

public class HumansTest {
    public static void testPerson() {
        System.out.println("\nClass test Client, Employer, Person: \n");
        Scanner scanner = new Scanner(System.in);

        AbstractPerson person = new AbstractPerson() {
            @Override
            public String toString() {
                return
                        "Human:" + System.lineSeparator()
                                + "\tAge: " + age + System.lineSeparator()
                                + "\tHeight: " + height + System.lineSeparator()
                                + "\tName: " + name + System.lineSeparator()
                                + "\tGender: " + gender + System.lineSeparator();
            }
        };

        System.out.println("Person:");
        test(scanner, person);

        AbstractPerson client = new Client(123);

        System.out.println("Client:");
        test(scanner, client);

        AbstractPerson employer = new Employer(1337);

        System.out.println("Employer:");
        test(scanner,employer);

        System.out.println("\nTests passed");
    }

    private static void test(Scanner scanner, AbstractPerson human) {
        try {
            System.out.print("\tImput age: ");
            human.setAge(scanner.nextInt());

            System.out.print("\tImput height: ");
            human.setHeight(scanner.nextInt());

            System.out.print("\tImput name: ");
            human.setName(scanner.next());

            System.out.print("\tImput gender (m,f,h,other): ");
            String gender = scanner.next();
            switch (gender) {
                case "m" -> human.setGender(Gender.MALE);
                case "f" -> human.setGender(Gender.FEMALE);
                case "h " -> human.setGender(Gender.ATTACK_HELICOPTER);
                default -> human.setGender(Gender.OTHERS);
            }
        }
        catch (Exception exception) {
            System.out.println(exception);
            System.exit(0);
        }
        System.out.println(human);
    }
}
