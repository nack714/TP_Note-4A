package tpNote;

public class Employe extends Emprunteur{
	protected Agence agence;
	protected Entreprise entreprise;
	
	public Employe(Agence a, Entreprise e) {
		agence = a;
		entreprise = e;
		a.addEmploye(this);
		e.addEmploye(this);
	}
	
	public Entreprise getEntreprise() {
		return entreprise;
	}
}
