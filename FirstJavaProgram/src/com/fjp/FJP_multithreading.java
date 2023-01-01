package com.fjp;

class CookingThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 4000; i++) {
            System.out.println("Cooking");
        }
    }
}

class ChatThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 4000; i++){
            System.out.println("Chatting");
        }
    }
}

public class FJP_multithreading {
    public static void main(String[] args) {
        CookingThread t1 = new CookingThread();
        ChatThread t2 = new ChatThread();

        t1.start();
        t2.start();
    }
}
