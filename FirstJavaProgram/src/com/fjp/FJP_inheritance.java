package com.fjp;

class Vehicle{
    private String brand;
    private String name;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Car extends Vehicle{
    private String category;

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}

public class FJP_inheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("Jeep");
        car.setName("Meridian");
        car.setCategory("SUV");

        System.out.printf("%s %s (%s)", car.getBrand(),
                car.getName(), car.getCategory());

    }
}
