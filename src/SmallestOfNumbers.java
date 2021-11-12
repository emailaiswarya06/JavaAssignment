import java.util.Scanner;

/*Java Assignment Day 1
        Assignment : Find smallest of four numbers

 */
public class SmallestOfNumbers {

    public static void main(String[] args) {

        int number1,number2,number3,number4;
        int min;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter four numbers");

        number1 = sc.nextInt();
        number2 = sc.nextInt();
        number3 = sc.nextInt();
        number4 = sc.nextInt();

        if(number1<number2) {min = number1;}
        else{min = number2;}

        if (number3<number4){
            if(number3<min){min = number3;}
            }
        else {
            if(number4<min){min = number4;}
        }

        System.out.println("Smallest of four given number is " +min);

    }
}
