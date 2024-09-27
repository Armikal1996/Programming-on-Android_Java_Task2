package HelloApp;

public class Practice3 {

	public static void main(String[] args) {
		String text = "0 1 01 10 11 100 110 001011 11001 1101";
		String word = "" , small = "", large= "";
		String[] words = new String[100];
		int length = 0;
		
		for(int i = 0; i<text.length(); i++) {
			//
			if(text.charAt(i) != ' ') {
				word = word + text.charAt(i);
			}
			else {
				words[length] = word;
				length++;
				word = "";
			}
		}
		small = large = words[0];
		
		for(int k = 0; k< length; k++) {
			if(small.length() > words[k].length())
				small = words[k];
			if(large.length() < words[k].length())
				large = words[k];
		}
		
		System.out.println("Smallest group: " + small);
		System.out.println("Largest group: " + large);
	}

}
