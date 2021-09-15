package com.techelevator;

public class RectangleWall extends Wall{
    String name;
    String color;
    int length = 0;
    int height = 0;

    public int getArea() {
        return length * height;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getColor() {
        return color;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public String toString() {
        return name + " ("+ length + "x" + height + ") rectangle";
    }

    public RectangleWall(String name, String color, int length, int height) {
        super(name, color);
        this.name = name;
        this.color = color;
        this.length = length;
        this.height = height;
    }
}
