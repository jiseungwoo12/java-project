package backjunPractice2;

import java.util.Scanner;

public class 별찍기 {
    public static void main(String[] args) {

//        //SSSS*
//        //SSS**
//        //SS***
//        //S****
//        //*****
//
//        for (int i = 0; i < 5; i++) {
//
//            for (int j = 4; j > i; j--) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k <= i; k++) {
//                System.out.print("*");
//            }
//
//
//            System.out.println();
//        }
//*
//**
//***
//****
//*****

//        for (int i = 0; i < 5; i++) {
//            for (int j = 1; j <= i+1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//*****
//****
//***
//**
//*
//        Scanner sc = new Scanner(System.in);
//        int inputstar = sc.nextInt();  //별의개수


//        for (int i = 0; i < 5; i++) {
//            for (int j = inputstar; j > i; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = n; k > i; k--) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
