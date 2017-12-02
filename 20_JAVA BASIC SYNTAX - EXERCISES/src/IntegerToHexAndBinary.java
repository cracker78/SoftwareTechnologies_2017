import java.util.Scanner;

import static java.lang.Integer.*;

public class IntegerToHexAndBinary {
    public static void main(String[] args) {
        Scanner scaner=new Scanner(System.in);

        Integer input=scaner.nextInt();

        System.out.println(Integer.toHexString(input).toUpperCase());
        System.out.println(Integer.toBinaryString(input).toUpperCase());

    }
}
