package borisova.numbers;

import java.util.Scanner;

public class Numbertask1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int a= scan.nextInt();
        System.out.println("Integer is " + a);
        String by = Integer.toBinaryString(a);
        System.out.println("Byte: " + by);
        String hex = Integer.toHexString(a);
        System.out.println("Hexa decimal: " + hex);
        String oct = Integer.toOctalString(a);
        System.out.println("Octal: " + oct);
    }
}
