package compressionString;

public class Stringcomp2 {
	public String compressTring(String s){
		String compreString ="";
		int counter = 0;
		for (int i = 0; i< s.length(); i++){
			counter ++;
			
			if (i+1 >= s.length() || s.charAt(i) != s.charAt(i+1)){
				compreString += ""+s.charAt(i)+ counter;
				counter = 0;
			}
		}
		return compreString.length() < s.length() ? compreString : s ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringcomp2 test = new Stringcomp2();
		System.out.println(test.compressTring("aaabbcccdd"));
	}
}
