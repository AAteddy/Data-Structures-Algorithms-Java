package hashtable.first_non_repeated_character;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedChar {

    public char findFirstNonRepeatedChar(String str) {
        Map<Character, Integer> map = new HashMap<>();

        var chars = str.toCharArray();
        for ( char ch: chars ) {
            // var count = map.containsKey(ch) ? map.get(ch) : 0;
            var count = map.getOrDefault(ch, 0);
            map.put(ch, count +1);
//            if ( map.containsKey(ch)) {
//                map.compute(ch, (k, count) -> count);
//            } else
//                map.put(ch, 1);
        }

        for ( char ch: chars )
            if ( map.get(ch) == 1 )
                return ch;

        return Character.MIN_VALUE;
    }

}

// a green apple