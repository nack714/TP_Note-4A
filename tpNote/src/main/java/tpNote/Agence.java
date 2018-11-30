package tpNote;

import java.util.ArrayList;
import java.util.List;

public class Agence extends Emprunteur {

	private List<Employe> employes = new ArrayList<Employe>();
	private String nom;
	private Entreprise entreprise;

	public Agence(Entreprise e, String n) {
		entreprise = e;
		e.addAgence(this);
		nom = n;
	}
	public Agence(String n) {
		nom = n;
	}

	public Entreprise getEntreprise() {
		return entreprise;
	}

	public List<Employe> getEmployes() {
		return employes;
	}

	public void addEmploye(Employe e) {
		employes.add(e);
	}
}
