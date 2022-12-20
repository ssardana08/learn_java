package com.fjp;

interface Camera{
    void takePic();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4kVideo(){
        System.out.println("Recording 4K Video");
    }
}

interface GPS{
    void getNetwork();
}

class CellPhone {
    void acceptCall(){
        System.out.println("Accepting Call");
    }

    void dial(int phoneNumber){
        System.out.println("Dialling: " + phoneNumber + " ...");
    }

    void rejectCall(){
        System.out.println("Rejecting Call");
    }
}

class SmartPhone extends CellPhone implements Camera, GPS{
    @Override
    public void getNetwork() {
        System.out.println("Getting network");
    }

    @Override
    public void takePic() {
        System.out.println("Say Cheese!");
    }

    @Override
    public void recordVideo() {
        System.out.println("Lights Camera Action!");
    }
}

public class FJP_default_method_interface {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.recordVideo();
        sp.dial(12112);

        GPS g = new SmartPhone();
        g.getNetwork();
    }
}
