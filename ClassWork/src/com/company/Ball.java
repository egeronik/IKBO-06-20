package com.company;

public class Ball {
    private int radius;
    private String color;
    private int weight;

    public int getRadius(){

        return radius;
    }

    public void setRadius(int radius) throws Exception{
        if(radius<=0) throw new Exception("Мяча нет");
        this.radius = radius;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) throws Exception{
        if(color.isEmpty()) throw new Exception("Строка пустая");
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) throws Exception{
        if (weight<=0) throw new Exception("Вес не задан");
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Мяч" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", weight=" + weight ;
    }

    public Ball() {

    }
}
