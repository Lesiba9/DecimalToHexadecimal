import java.util.Scanner;

public class DecimalToHex {
    public static void main(String args[])
    {
        Scanner sc = new Scanner( System.in );
        System.out.print("Enter a decimal number : ");
        int num =sc.nextInt();

        // For storing remainder
        int remainder;

        // For storing result
        String result="";

        // Digits in hexadecimal number system
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        while(num > 0)
        {
            remainder = num % 16;
            result = hex[remainder] + result;
            num = num/16;
        }
        System.out.println("Decimal to hexadecimal: "+ result);
    }
}
