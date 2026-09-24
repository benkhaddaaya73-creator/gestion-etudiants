public class Main {
	public static void main(String[] args) {	
		Etudiant e1 = new Etudiant();
		Etudiant e2 = new Etudiant();
		Etudiant e3 = new Etudiant();
		
		e1.nom = "AYA";
		e1.taille = 1.64;
		e1.age = 21;
		e2.nom ="Ayou";
		e2.taille = 1.74;
		e2.age = 31;
		e3.nom = "Sara";
		e3.taille = 1.68;
		e3.age = 25;
				
		e1.afficher();
		e2.afficher();
		e3.afficher();
		
		Voiture v1 = new Voiture();
		v1.marque = "Toyota";
		v1.modele = "Corolla";
		v1.annee = 2022;
		v1.afficher();
	}
}