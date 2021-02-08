package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the number of terms:");
        int b = sc.nextInt();
        if(b<=0){
            System.out.println("0");
            return;
        }
        int sum = 0, a1=a, a2=a+1, a3=a+2;
        for(int i=0; i<b; i++){
            sum += a1*a2*a3;
            a1=a2;
            a2=a3;
            a3=a3+1;
        }
        System.out.println(sum);
    }
}
