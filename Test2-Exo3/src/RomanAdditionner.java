
public class RomanAdditionner {
	static public String compute(String a, String op, String b) {
		String res = "";
		RomanToNumeral roman = new RomanToNumeral();
		NumeralToRoman numeral = new NumeralToRoman();
		int chiffreA = roman.getNumeral(a);
		int chiffreB = roman.getNumeral(b);
		if (op.equals("+")) {
			int add = chiffreA+chiffreB;
			res = numeral.getRoman(add);
		} else if (op.equals("-")) {
			int sou = chiffreA-chiffreB;
			res = numeral.getRoman(sou);
		}
		
		return res;
	}
	
	public static void main (String[] args) {
		String res = RomanAdditionner.compute("X", "+", "M");
		System.out.println(res);
	}
}
