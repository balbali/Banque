package metier;

public class CompteEpargne extends Compte {
	private float taux;
	//Constructeur
	public CompteEpargne(float solde, float taux) {
		super(solde);
		this.taux=taux;
		
	}
	public CompteEpargne() {
		this(0,6);
	}
	public void calculInterets() {
		solde=solde*(1+taux/100);
	}
	public float getTaux() {
		return taux;
	}
	public void setTaux(float taux) {
		this.taux = taux;
	}
	@Override
	public String toString() {
		return "CompteEpargne "+super.toString()+" avec un taux=" + taux + ".";
	}
	

}
