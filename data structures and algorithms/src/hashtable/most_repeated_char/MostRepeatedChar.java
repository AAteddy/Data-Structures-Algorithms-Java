package hashtable.most_repeated_char;

import java.util.HashMap;
import java.util.Map;

public class MostRepeatedChar {

    public char findMostRepeatedChar(String str) {
        Map<Character, Integer> map = new HashMap<>();

        var chars = str.toCharArray();
        for ( char ch: chars) {
            var count = map.getOrDefault(ch, 0);
            map.put(ch, count + 1);
        }

        for ( char ch : chars )
            if ( map.get(ch) > 1 ) {
                var temp = map.get(ch);
            }

        return Character.MIN_VALUE;
    }
}
