import java.util.Scanner;

class charCheck{

    char charValue;
    charCheck(char charLocal){
        charValue = charLocal;
    }
    public void  charCheck(){

        if (charValue >= 'A' && charValue <= 'Z')
            System.out.println(charValue + " is an UpperCase character");

        else if (charValue >= 'a' && charValue <= 'z')
            System.out.println(charValue + " is an LowerCase character" );

        else{
            System.out.println("Enter valid character");
        }

}

}

public class upperCaseLowerCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character to check upper case or lower case");
        char charValue = sc.next().charAt(0);
        charCheck obj = new charCheck(charValue);
        obj.charCheck();

    }
}
