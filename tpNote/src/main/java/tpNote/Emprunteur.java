package tpNote;

import java.util.ArrayList;
import java.util.List;

public abstract class Emprunteur {
	private List<Empruntable> stock = new ArrayList<Empruntable>();

	public void ajouterAuStock(Empruntable emprunt) {
		stock.add(emprunt);
	}

	public List<Empruntable> listeMateriel() {
		return stock;
	}

	public boolean perdreMateriel(Empruntable materiel) {
		return stock.remove(materiel);
	}
}
