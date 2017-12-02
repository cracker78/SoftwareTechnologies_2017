import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class ReverseCharacters {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String[] arr=new String[3];

        for (int i=0; i<3; i++){
            String n=scanner.nextLine();
            arr[i]=n;
        }

        Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER);
        Collections.reverse(Arrays.asList(arr));

        System.out.println(String.join("",arr));
    }
}
