package com.company;

public class Client extends AbstractPerson {
    private int orderNumber;


    public Client(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Client(int age, int height, String name, Gender gender, int orderNumber) {
        super(age, height, name, gender);
        this.orderNumber = orderNumber;
    }

    public int getOrderNumber() {
        return orderNumber;
    }



    @Override
    public String toString() {
        return
                "Client:" + System.lineSeparator()
                        + "\tAge: " + age + System.lineSeparator()
                        + "\tHeight: " + height + System.lineSeparator()
                        + "\tName: " + name + System.lineSeparator()
                        + "\tGender: " + gender + System.lineSeparator()
                        + "\tOreder number: " + orderNumber;
    }
}
