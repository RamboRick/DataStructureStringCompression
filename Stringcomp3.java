package compressionString;

public class Stringcomp3 {
	public String compressTring(String s){
		StringBuilder compreStringBuider =new StringBuilder();
		int counter = 0;
		for (int i = 0; i< s.length(); i++){
			counter ++;
			
			if (i+1 >= s.length() || s.charAt(i) != s.charAt(i+1)){
				compreStringBuider.append(s.charAt(i));
				compreStringBuider.append(counter);
				counter = 0;
			}
		}
		return compreStringBuider.length() < s.length() ? compreStringBuider.toString() : s ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringcomp2 test = new Stringcomp2();
		System.out.println(test.compressTring("aaabbcccdd"));
	}
}

