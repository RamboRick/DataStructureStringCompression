package compressionString;

import java.util.HashSet;

public class Stringcompression {
	public String compressString (String inputString){
		HashSet<Character> crr = new HashSet<>();
		char[] newChar = inputString.toCharArray();
		for (int i = 0; i < newChar.length; i++){
			if(crr.contains(newChar[i])) {
				count ++; 
			}else {
				crr.add(s);
			}
		}
	}
}
