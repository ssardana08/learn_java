package com.fjp;

public class FJP_arrays {
    public static void main(String[] args) {
//        Classroom with n number of students
        int[] mathsMarks = new int[5];
        mathsMarks[0] = 100;
        mathsMarks[1] = 50;
        mathsMarks[2] = 88;
        mathsMarks[3] = 98;
        mathsMarks[4] = 87;
        System.out.println(mathsMarks[3]);

        int[] englishMarks = {40, 50,60, 70, 80};
        System.out.println(englishMarks[3]);
        System.out.printf("Number of students in maths class: %d", mathsMarks.length);

        System.out.println("Maths marks");
        for (int i = 0; i < mathsMarks.length-1; i++){
            System.out.println(mathsMarks[i]);
        }

        System.out.println();
        System.out.println("English marks");
        for (int m: englishMarks){
            System.out.println(m);
        }
    }
}
