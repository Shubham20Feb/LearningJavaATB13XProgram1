package ex_12_Task23Day;

import java.util.Scanner;

public class Lab_Palindrome_String {
    public static void main(String[] args) {
        //  Palindrome
        //   madam ->  reverse(madam) -> madam ==
        //   s1 = madam
        //   s1_reverse = mada...
        Scanner sc = new Scanner(System.in);
        System.out.println("Print the name ");
        String name = sc.next();

        // convert to lower case to ignore case
        String org = name.toLowerCase();
        String reverse = "";
               // ORG =   nitin
        for(int i = org.length()-1; i >= 0;   i--){
            // i	original.charAt(i)	reversed (after +=)  reverse
            //4	            'n'          	"n"              n
            //3           	'i'          	"ni"
            //2	             't'          	"nit"
            //1            	 'i'	        "niti"
            //0	             'n'	        "nitin"

            reverse = reverse + org.charAt(i);//

        }
        if ( org.equals(reverse)){
            System.out.println("This String is palindrome : " + org +" __ "+  reverse);
        }else {
            System.out.println("this string is not palindrome : ");
        }
    }
}
