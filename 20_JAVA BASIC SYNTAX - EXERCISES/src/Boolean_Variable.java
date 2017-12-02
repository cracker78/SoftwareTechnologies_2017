import java.util.Scanner;

public class Boolean_Variable {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);

        Boolean bool=Boolean.parseBoolean(sn.nextLine());

        if (bool) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
