package com.fjp;

interface Bicycle{
    void speedUp(int increment);
    void applyBrake(int decrement);
}

interface Chain{
    void oilChain();
}

class AvonCycle implements Bicycle, Chain{
    private int speed;

    AvonCycle(int speed){
        this.speed = speed;
    }

    @Override
    public void speedUp(int increment) {
        System.out.println("Speeding up");
        speed+=increment;
    }

    @Override
    public void applyBrake(int decrement) {
        System.out.println("Applying brakes");
        speed -= decrement;
    }

    @Override
    public void oilChain() {
        System.out.println("Oiling chain");
    }

    public int currentSpeed(){
        return this.speed;
    }
}

public class FJP_interface {
    public static void main(String[] args) {
        AvonCycle myCycle = new AvonCycle(10);
        myCycle.speedUp(3);
        myCycle.applyBrake(2);
        myCycle.oilChain();

        System.out.println("Current speed is: " + myCycle.currentSpeed());
    }
}
