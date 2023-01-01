package com.fjp;

class CookingRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 4000; i++) {
            System.out.println("Cooking");
        }
    }
}

class ChatRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 4000; i++) {
            System.out.println("Chatting");
        }
    }
}

public class FJP_multithreading_2 {
    public static void main(String[] args) {
        CookingRunnable r1 = new CookingRunnable();
        ChatRunnable r2 = new ChatRunnable();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}
