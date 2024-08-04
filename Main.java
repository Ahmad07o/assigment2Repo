import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
  /*      Scanner obj=new Scanner(System.in);
        System.out.println("Enter string to check is palindrome or not");
        String str=obj.nextLine();
        int strlen=str.length();
        boolean flag=true;

        for(int i=0;i<strlen;i++){
            if (str.charAt(i)!=str.charAt(strlen-i-1)){
                flag=false;
            }
        }
        if(flag==true){
            System.out.println("is palaindrome");
        }
        else
            System.out.println("not a palindrome"); */

                            //task2
       /* System.out.println("Enter an expression");
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        Pattern p=Pattern.compile("([a-zA-Z]+\\d+|[a-zA-Z]+|[a-zA-Z]+.[a-zA-Z]+)@umt.edu.pk");
        Matcher m=p.matcher(str);
        boolean b=m.matches();
        if(b){
            System.out.println("valid");
        }
        else
            System.out.println("not valid"); */


                                     //Task3
        /*
        LocalDate d= LocalDate.now();
        String newDate=d.format(DateTimeFormatter.ofPattern("dd-MM-YYYY"));
        System.out.println("current format:"+d+"\nformat after code:"+newDate);
*/

      /*                                 //task4
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a date");
        String str=scanner.nextLine();
        LocalDate date=LocalDate.parse(str);
        date=date.plusDays(30);
        System.out.println(date.format(DateTimeFormatter.ofPattern("dd-MM-YYYY")));

*/
                                          //task5

/*

                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter a number:");

                // Read the input number as a string and convert it to an integer
                String str = scanner.nextLine();
                int number = Integer.parseInt(str);

                // Define arrays for Roman numeral symbols and their corresponding values
                int[] arr = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
                String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

                // Initialize an empty string to store the result
                String romanNumber = "";

                // Iterate over the values and append corresponding Roman numeral symbols
                for (int i = 0; i < romanNumerals.length; i++) {
                    while (number >= arr[i]) {
                        romanNumber += romanNumerals[i];
                        number -= arr[i];
                    }
                }

                // Print the resulting Roman numeral
                System.out.println("Roman number is: " + romanNumber);
            }
        }
*/                                //task6
       /*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter brackets:");
        String str = input.nextLine();// ()
       if(Pattern.compile("\\(\\)|\\(\\)\\{\\}\\[\\]|\\[\\{\\(\\)\\}\\]").matcher(str).matches())
            System.out.println("valid");
        else
            System.out.println("Invalid");
    }
*/

}
}

