import java.util.Scanner;

public class CompareCharArrays {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String arr1=scanner.nextLine().strip();
        String arr2=scanner.nextLine().trim();

        if (arr1.length()==arr2.length()){
            if (arr1.equals(arr2)){
                System.out.println(arr2.trim());
                System.out.println(arr1.trim());
            }
            else{
                System.out.println(arr1.trim());
                System.out.println(arr2.trim());
            }
        } else if (arr1.length()<arr2.length()){
            System.out.println(arr1.trim());
            System.out.println(arr2.trim());
        }
        else {
            System.out.println(arr2.trim());
            System.out.println(arr1.trim());
        }
    }
}