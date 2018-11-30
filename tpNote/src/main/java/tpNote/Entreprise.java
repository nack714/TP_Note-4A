package tpNote;

import java.util.ArrayList;
import java.util.List;

public class Entreprise extends Emprunteur {
	private List<Agence> agences = new ArrayList<Agence>();
	private List<Employe> employes = new ArrayList<Employe>();
	private String nomEntreprise;

	public Entreprise(String n) {
		nomEntreprise = n;
	}
	
	public void addEmploye(Employe e) {
		employes.add(e);
	}

	public void addAgence(Agence a) {
		agences.add(a);		
	}
	
	public List<Agence> getAgence() {
		return agences;
	}
}
