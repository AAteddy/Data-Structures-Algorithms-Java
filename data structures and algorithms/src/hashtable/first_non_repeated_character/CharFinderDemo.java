package hashtable.first_non_repeated_character;

public class CharFinderDemo {

    public static void main(String[] args) {

        FirstNonRepeatedChar charFinder = new FirstNonRepeatedChar();

        String str = "a green apple";
        var find = charFinder.findFirstNonRepeatedChar(str);
        System.out.println(find);
    }
}
