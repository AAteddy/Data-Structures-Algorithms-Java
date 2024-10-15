package hashtable.first_repeated_character;


import java.util.HashSet;
import java.util.Set;

public class CharFinder {

    public char findFirstRepeatedChar(String str) {
        Set<Character> set = new HashSet<>();

        for ( char ch: str.toCharArray() ) {
            if ( set.contains(ch) )
                return ch;
            set.add(ch);
        }

        return Character.MIN_VALUE;
    }
}

//a green apple