import java.util.Scanner;

public class CompareCharArrays {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String[] arr1=scanner.nextLine().split("\\s");
        String[] arr2=scanner.nextLine().split("\\s");

        int minLen = Math.min(arr1.length,arr2.length);

        if (arr1.length<arr2.length){
                System.out.println(String.join("", arr1));
                System.out.println(String.join("", arr2));
            }
        else if(arr1.length>arr2.length){
                System.out.println(String.valueOf(String.join("", arr2)));
                System.out.println(String.valueOf(String.join("", arr1)));
            }

        else {

        int result = arr1[0].compareTo(arr2[0]);

        if (result >= 1) {
            System.out.println(String.join("",arr2));
            System.out.println(String.join("",arr1));

        }
        else {
            System.out.println(String.join("", arr1));
            System.out.println(String.join("", arr2));

        }
    }
}
}