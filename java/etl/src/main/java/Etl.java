import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.collect.ImmutableMap;

public class Etl {
	public Map transform(Map<Integer, List<String>> old) {
		HashMap<String, Integer> flattened = new HashMap();
		for (Map.Entry<Integer, List<String>> entry : old.entrySet()) {
		    Integer score = entry.getKey();
		    List<String> letters = entry.getValue();
		    for (String letter : letters ) {
		    	flattened.put(letter.toLowerCase(), score);
		    }
		}
		return flattened;
	}
}
