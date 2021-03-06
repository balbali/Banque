package metier;
public abstract class Compte {
 // classe abstraite compte 
	private int code;
	protected float solde;
	private static int nbComptes;
	public Compte(float s) {
		++nbComptes;
		code=nbComptes;
		this.solde=s;
	}
/**
 * 
 * @param mt
 */
	public void verser(float mt) {
		solde+=mt;
	}
	/**
	 * 
	 * @param mt
	 * @throws Exception
	 */
	public void retirer(float mt) throws Exception {
		if(mt>solde)throw new Exception ("Solde insuffisant");
			solde-=mt;
	}
	public int getCode() {
		return code;
	}
	public static int getNbComptes() {
		return nbComptes;
	}
	public static void setNbComptes(int nbComptes) {
		Compte.nbComptes = nbComptes;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String toString() {
		return("Code="+code+" Solde="+solde);
	}

}
