package test;

import java.util.Scanner;

import static sun.swing.MenuItemLayoutHelper.max;

public class example_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int higher = max(a, b, c);
        
        sc.close();
    }
}
