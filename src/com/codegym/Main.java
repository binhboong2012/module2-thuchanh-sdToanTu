package com.codegym;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);// khai báo đối tượng Scanner.

        System.out.println("Enter width: ");
        width = scanner.nextFloat();// nhập chiều dài

        System.out.println("Enter height: ");
        height = scanner.nextFloat();// nhập chiều rộng

        float area = width * height ;

        System.out.println("Area is: " + area);
    }
}
