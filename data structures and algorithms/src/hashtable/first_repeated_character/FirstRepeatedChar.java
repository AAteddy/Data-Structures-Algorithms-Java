package hashtable.first_repeated_character;

public class FirstRepeatedChar {

    public static void main(String[] args) {
        CharFinder finder = new CharFinder();

        String str = "a green apple";

        var found = finder.findFirstRepeatedChar(str);
        System.out.println(found);
    }
}
