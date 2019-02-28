import java.util.HashMap;

public class NumeralToRoman {
	protected HashMap<Integer,String> Ci = new HashMap<Integer, String>();
	public NumeralToRoman(){
		this.Ci.put(1,"I");
		this.Ci.put(5,"V");
		this.Ci.put(10,"X");
		this.Ci.put(50,"L");
		this.Ci.put(100,"C");
		this.Ci.put(500,"D");
		this.Ci.put(1000,"M");
	}
	
	public String getRoman(int nombre) {
		String res ="";
		int nb = nombre;
		while(nb > 0) {
			if (nb >= 1000) {
				res += "M";
				nb -= 1000;
			} else if (nb >= 500) {
				res += "D";
				nb -= 500;
			} else if (nb >= 100) {
				res += "C";
				nb -= 100;
			} else if (nb >= 50) {
				res += "L";
				nb -= 50;
			} else if (nb >= 10) {
				res += "X";
				nb -= 10;
			} else if (nb >= 5) {
				res += "V";
				nb -= 5;
			} else if (nb >= 1) {
				res += "I";
				nb -= 1;
			}
		}
		System.out.println(res);
		
		return res;
	}
	
	public static void main(String[] args) {
		NumeralToRoman test = new NumeralToRoman();
		test.getRoman(2100);
	}
}
