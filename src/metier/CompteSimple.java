package metier;

public class CompteSimple extends Compte {
	private float decouvert;

	public CompteSimple(float s, float d) {
		super(s);
		this.decouvert = d;
	}
	
	public void retirer(float mt) throws Exception {
		if(mt>solde+decouvert) throw new Exception ("solde insuffisant du compte simple");
			solde-=mt;
	}
	
	public float getDecouvert() {
		return decouvert;
	}
	public void setDecouvert(float decouvert) {
		this.decouvert = decouvert;
	}
	@Override
	
	public String toString() {
		return("Compte Simple "+super.toString()+" Découvert="+decouvert);

	}	
}
