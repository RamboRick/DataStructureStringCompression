package compressionString;

public class OptimalCompression {
	
	public String checkStr(String str){
		
		int finalLength = getLength(str);
		if (finalLength > str.length()){
			return str;
		}
		StringBuilder compreStringBuider =new StringBuilder();
		int counter = 0;
		for (int i = 0; i< str.length(); i++){
			counter ++;
			
			if (i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)){
				compreStringBuider.append(str.charAt(i));
				compreStringBuider.append(counter);
				counter = 0;
			}
		}
		return compreStringBuider.length() < str.length() ? compreStringBuider.toString() : str ;
	}
	public int getLength(String str){
		int compreLength = 0;
		int count = 0;
				
		for (int i = 0; i<str.length(); i++){
			count++;
			if (i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)){
				compreLength+= 1 + String.valueOf(count).length();
				count = 0;
			}
		}
		return compreLength;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringcomp2 test = new Stringcomp2();
		System.out.println(test.compressTring("aaabbcccdd"));
	}

}
