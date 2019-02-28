
public class RomanAdditionner {
	static public String compute(String a, String op, String b) {
		String res = "";
		RomanToNumeral roman = new RomanToNumeral();
		NumeralToRoman numeral = new NumeralToRoman();
		int chiffreA = roman.getNumeral(a);
		int chiffreB = roman.getNumeral(b);
		if (op.equals("+")) {
			int add = chiffreA+chiffreB;
			
		} else if (op.equals("-")) {
			
		}
		
		return res;
	}
}
