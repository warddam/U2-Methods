import java.util.Locale;



public class StringExamples {


    public static void main(String[] args) {

        String greeting = "Hello";
        String name = "Hephaestus";

        //Style 1
        int greetingSize = greeting.length();
        System.out.println(greeting + " has " + greetingSize + " letters. ");

        //Style 2
        System.out.println(name + " has " + name.length() + " letters. ");

        String message = "Good morning, Mr. Smith.";

        String lowerCaseMessage = message.toLowerCase();
        String upperCaseMessage = message.toUpperCase();
        int messageLength = message.length();  //notice this counts spaces!!
        char thirdLetter = message.charAt(2);
        int mIndex = message.indexOf('m');
        String lastPart = message.substring(14);
        String firstPart = message.substring(0, 11);

        System.out.println("Original message: " + message);
        System.out.println("Lowecase: " + lowerCaseMessage);
        System.out.println("Uppercase: " + upperCaseMessage);
        System.out.println("Number of characters: " + messageLength);
        System.out.println("The third letter is: " + thirdLetter);
        System.out.println("'m' is found at index: " + mIndex);
        System.out.println("The last part: " + lastPart);
        System.out.println("The first part: " + firstPart);
    }

}


