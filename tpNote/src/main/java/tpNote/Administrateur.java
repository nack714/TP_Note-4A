package tpNote;

import java.util.ArrayList;
import java.util.List;

public class Administrateur extends Employe {

	public Administrateur(Agence a, Entreprise e) {
		super(a, e);
	}



	public boolean attribuerMateriel(Empruntable m, Emprunteur e) {
		if (e instanceof Entreprise) {
			return false;
		} else {
			if (e instanceof Agence) {
				if(((Agence) e).getEntreprise().listeMateriel().remove(m)) {
					e.listeMateriel().add(m);
					return true;
				}else {
					return false;
				}
			} else if (e instanceof Employe) {
				if (m.isLimitationPretAgence()) {
					return false;
				} else {
					if(((Employe) e).getEntreprise().listeMateriel().remove(m)) {
						e.listeMateriel().add(m);
						return true;
					}else {
						System.out.println("err 6");
						return false;
					}
				}
			} else {
				return false;
			}
		}
	}
	
	public boolean recupererMateriel(Empruntable m, Emprunteur e) {
		if (e instanceof Agence) {
			e.listeMateriel().remove(m);
			listeMateriel().add(m);
			return true;
		} else if (e instanceof Employe) {
			e.listeMateriel().remove(m);
			listeMateriel().add(m);
			return true;
		} else {
			return false;
		}
	}

	public List<Empruntable> stockEntreprise() {
		List<Empruntable> stock = new ArrayList<Empruntable>();
		stock.addAll(entreprise.listeMateriel());
		for (Agence a : entreprise.getAgences()) {
			stock.addAll(a.listeMateriel());
		}
		return stock;
	}

	public List<Empruntable> stockAgence() {
		List<Empruntable> stock = new ArrayList<Empruntable>();
		stock.addAll(agence.listeMateriel());
		for (Emprunteur e : agence.getEmployes()) {
			stock.addAll(e.listeMateriel());
		}
		return stock;
	}
	
	public List<Empruntable> stockEmploye(Employe e) {
		return e.listeMateriel();
	}
	

	public void transfererMateriel(Emprunteur e1, Empruntable m, Emprunteur e2) {
		if ( !(e2 instanceof Employe && m.isLimitationPretAgence() )) {
			if (e1.listeMateriel().remove(m)) {
				e2.listeMateriel().add(m);
			}
		}
	}
	
	public void supprimerMateriel(Empruntable m) {
		listeMateriel().remove(m);
	}
	
	public void supprimerMaterielDefectueuxEntreprise() {
		supprimerMaterielDefectueuxDe(entreprise);
	}
	
	public void supprimerMaterielDefectueuxAgence(Agence a) {
		supprimerMaterielDefectueuxDe(a);
	}
	
	public void supprimerMaterielDefectueuxAgence() {
		supprimerMaterielDefectueuxDe(agence);
	}
	

	
	public void supprimerMaterielDefectueuxDe(Emprunteur e) {
		for(int i=0;i<e.listeMateriel().size();i++) {
			if(e.listeMateriel().get(i).isDefectueux()) {
				e.listeMateriel().remove(e.listeMateriel().get(i));
			}
		}
	}

}
