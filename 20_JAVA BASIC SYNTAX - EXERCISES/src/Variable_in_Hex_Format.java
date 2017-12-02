import java.util.Scanner;

public class Variable_in_Hex_Format {

    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);

        String input=sn.nextLine();

        System.out.println(Integer.parseInt(input, 16));

    }
}
