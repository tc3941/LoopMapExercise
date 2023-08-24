import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<Integer>();
        System.out.println("Please provide 5 numbers");
        Scanner in = new Scanner(System.in);

        int product = 1;
        int sum = 0;
        int largest = 0;
        int smallest = 0;
        int num = 0;

        for (int i = 0; i <5;i++){
            num = in.nextInt();
           nums.add(num);
           sum += num;
            product *= num;

           if( i == 0){
            largest = num;
            smallest = num;
           }

           if(num>largest)
               largest = num;

           if(num<smallest)
               smallest = num;
        }
        System.out.println(nums.toString());

        System.out.println("Here is the sum: " + sum);
        System.out.println("Here is the product: " + product);
        System.out.println("Here is the largest: " + largest);
        System.out.println("Here is the smallest : " + smallest);


        System.out.println(" ");

    }
}