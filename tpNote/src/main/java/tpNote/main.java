package tpNote;


public class main {

	public static void main(String[] args) {
		System.out.println("BOnjour !");

	    Entreprise e;
	    Agence a1, a2;
	    Empruntable e1, e2, e3, e4, e5, e6;
	    Employe admin, emp1, emp2, emp3, emp4;
		
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

	        /*
	        e.ajouterAuStock(e1);
	        e.ajouterAuStock(e2);
	        e.ajouterAuStock(e3);
	        e.ajouterAuStock(e4);
	        e.ajouterAuStock(e5);
	        e.ajouterAuStock(e6);
	        */


	        admin = new Administrateur(a1, e);
	        emp1 = new Employe(a1, e);
	        emp2 = new Employe(a1, e);
	        emp3 = new Employe(a2, e);
	        emp4 = new Employe(a2, e);

	        a1.getEmployes().add(admin);
	        a1.getEmployes().add(emp1);
	        a1.getEmployes().add(emp2);

	        a2.getEmployes().add(emp3);
	        a2.getEmployes().add(emp4);
		
		
		
		 a1.listeMateriel().add(e4);
	        a1.listeMateriel().add(e5);
	        e5.declarerDefectueux();

	        int stockActuel = admin.listeMateriel().size();
	       System.out.println( ((Administrateur) admin).attribuerMateriel(new Ecran(), admin));

	       System.out.println("attribuerMateriel: fail "+( stockActuel+1)+" <> "+ admin.listeMateriel().size());
	   	
	}

}
