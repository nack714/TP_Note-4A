package tpNote;

import java.util.ArrayList;
import java.util.List;

public class Emprunteur {
	public List<Empruntable> stock = new ArrayList<Empruntable>();

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
