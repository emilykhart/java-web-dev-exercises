package exercises;
import java.util.Scanner;
public class Alice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String aliceLine = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println("Enter a term that could appear in the first line of Alice's Adventures in Wonderland: ");
        String searchTerm = input.nextLine();

        Boolean outputFinal =  aliceLine.toLowerCase().contains(searchTerm);
        System.out.println("Your term of " + searchTerm +" is " + outputFinal);

        int index = aliceLine.indexOf(searchTerm);
        int length = searchTerm.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = aliceLine.replace(searchTerm, "");
        System.out.println(modifiedSentence);
        input.close();
    }
}
