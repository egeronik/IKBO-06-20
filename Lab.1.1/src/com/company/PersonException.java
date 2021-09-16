package com.company;

public class PersonException {
    protected int age, height;
    protected String name = "";
    protected Gender gender;


    public PersonException(int age, int height, String name, Gender gender) {
        this.age = age;
        this.height = height;
        this.name = name;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception{

        if ((age > 150) || (age < 0)) throw new Exception("Imposible age");
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) throws Exception {
        if ((height > 250) || (height < 100)) throw new Exception ("Imposible height");
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return
                "Age: " + age + System.lineSeparator()
                        + "Heigth: " + height + System.lineSeparator()
                        + "Name: " + name + System.lineSeparator()
                        + "Gender: " + gender + System.lineSeparator();
    }
}
