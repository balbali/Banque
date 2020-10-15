package metier;

public class ComptePayant extends Compte {
	

	public ComptePayant(float s) {
		super(s);
	
	}
	public void verser(float mt) {
		super.verser(mt);
		try {
			super.retirer(mt*5/100);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public void retirer(float mt) {
		try {
			super.retirer(mt);
			super.retirer(mt*5/100);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String toString() {
		return "Compte payant :"+super.toString();
	}

}
