package com.fjp;

class Student{
    private String name;
    private int id;

    public Student(){}
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void setName(String s){
        name = s;
    }

    public String getName(){
        return name;
    }

    public void setId(int i){
        id = i;
    }

    public int getId(){
        return id;
    }
}

public class FJP_access_modifier_private {
    public static void main(String[] args) {
        Student s = new Student();
        s.setId(1);
        s.setName("Sumit");
        System.out.println(s.getId() + ": " + s.getName());

        Student s2 = new Student(2, "Rahul");
        System.out.println(s2.getId() + ": " + s2.getName());

    }
}
