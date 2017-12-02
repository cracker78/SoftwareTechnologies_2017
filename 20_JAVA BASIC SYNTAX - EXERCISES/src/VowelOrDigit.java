import java.util.Scanner;

public class VowelOrDigit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        char input=scanner.nextLine().charAt(0);

        if (input=='a'||input=='e'||input=='i'||input=='o'||input=='u'){

            System.out.println("vowel");
        } else if (input=='1'||input=='2'||input=='3'||input=='4'||input=='5'
                ||input=='6'||input=='7'||input=='8'||input=='9'||input=='0'){
            System.out.println("digit");
        }
        else {
            System.out.println("other");
        }
    }
}
