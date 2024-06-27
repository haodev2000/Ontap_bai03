package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số : ");
        int so = sc.nextInt();

        String c = String.valueOf(so);

        System.out.println("Số đầu tiên : " + c.charAt(0));

    }
}
