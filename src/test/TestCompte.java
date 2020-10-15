package test;
import metier.*;
public class TestCompte {

	public static void main(String[] args) {
		//Tester la classe Compte Simple
		CompteSimple c1=new CompteSimple(8000,4000);
		System.out.println(c1.toString());
		c1.verser(3000);
		try {
			c1.retirer(5000);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("----------------Tester la classe Compte Simple ------------------------------");
		System.out.println(c1.toString());
		c1.setDecouvert(5500);
		try {
			c1.retirer(155000);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(c1.toString());
		// Tester la classe Compte Epargne
		System.out.println("-----------------Tester la classe Compte Epargne-----------------------------");
		CompteEpargne c2= new CompteEpargne(5000,5);
		System.out.println(c2);
		c2.verser(30000);
		try {
			c2.retirer(1600000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c2.calculInterets();
		System.out.println(c2);
		c2.setTaux(6);
		c2.calculInterets();
		System.out.println(c2);
		//Tester la classe Compte payant
		System.out.println("-----------------Tester la classe Compte payant-----------------------------");
		ComptePayant c3= new ComptePayant(5000);
		System.out.println(c3);
		c3.verser(6000);
		try {
			c3.retirer(1333000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c3);

	}

}
