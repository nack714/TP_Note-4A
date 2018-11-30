package tpNote;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ComparableAgenceTest {
	   Entreprise e;
	    Agence a1, a2;
	    Empruntable e1, e2, e3, e4, e5, e6;
	    Administrateur admin;

	    @Before
	    public void setUp() throws Exception {

	        e = new Entreprise("Super Entreprise de l'ENSIM");
	        a1 = new Agence(e, "Agence du Sud");
	        a2 = new Agence(e, "Agence du Nord");

	        e.getAgences().add(a1);
	        e.getAgences().add(a2);

	        e1 = new Imprimante(true);//Changement par Impriamte
	        e2 = new Ecran();
	        e3 = new Souris();
	        e4 = new Clavier();
	        e5 = new Clavier();
	        e6 = new Ecran();

	        e1.declarerDefectueux();
	        e3.declarerDefectueux();
	        e5.declarerDefectueux();
	        e6.declarerDefectueux();

	        a1.listeMateriel().add(e1);
	        a1.listeMateriel().add(e2);
	        a2.listeMateriel().add(e3);
	        a2.listeMateriel().add(e4);
	        a2.listeMateriel().add(e5);
	        a2.listeMateriel().add(e6);

	        admin = new Administrateur(a1, e);

	        a1.getEmployes().add(admin);
	        
	    }

	    
	  @Test
	    public void test() {


	        Assert.assertEquals("attribuerMateriel: fail", -2, a1.compareTo(a2));
	    }
}
