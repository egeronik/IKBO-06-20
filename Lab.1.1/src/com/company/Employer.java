package com.company;

public class Employer extends AbstractPerson {
    private int workerID;
    public Employer(int workerID){
        this.workerID = workerID;
    }

    public Employer(int age, int height, String name, Gender gender, int workerID) {
        super(age, height, name, gender);
        this.workerID = workerID;
    }

    public int getWorkerID() {
        return workerID;
    }

    @Override
    public String toString() {
        return
                "Worker:" + System.lineSeparator()
                        + "\tAge: " + age + System.lineSeparator()
                        + "\tHeight: " + height + System.lineSeparator()
                        + "\tName: " + name + System.lineSeparator()
                        + "\tGender: " + gender + System.lineSeparator()
                        + "\tID: " + workerID;
    }
}
