import java.util.HashMap;

public class RomanToNumeral {
	protected HashMap<String,Integer> Ci = new HashMap<String, Integer>();
	public RomanToNumeral(){
		this.Ci.put("I",1);
		this.Ci.put("V", 5);
		this.Ci.put("X", 10);
		this.Ci.put("L", 50);
		this.Ci.put("C",100);
		this.Ci.put("D", 500);
		this.Ci.put("M", 1000);
	}
	
	public int getNumeral(String nombre) {
		int res = 0;
		for (int i = 0; i<=nombre.length()-1; i++) {
			String lettre = nombre.charAt(i)+"";
			int chiffre = this.Ci.get(lettre);
			if (nombre.length() != 1) {
				String lettreSuivante = nombre.charAt(i+1)+"";
				int chiffreSuivant = this.Ci.get(lettreSuivante);	
				//Conditions
				if (chiffre >= chiffreSuivant) {
					res += chiffre;
				}
				else {
					res += chiffreSuivant-chiffre;
					i=i+1;
				}
			} else {
				res += chiffre;
			}
			
			
			
		}
		return res;
	}
	
	
	public static void main(String[] args) {
		RomanToNumeral test = new RomanToNumeral();
		int res = test.getNumeral("C");
		System.out.println(res);
	}
	
	
}
