
public class Main {
	public static void main(String[] args) {	
		Etudiant e1 = new Etudiant();
		Etudiant e2 = new Etudiant();
		e1.nom = "AYA";
		e1.taille = 1.64;
		e1.age = 21;
		e2.nom ="Ayou";
		e2.taille = 1.74;
		e2.age = 31;
				
		e1.afficher();
		e2.afficher();
		
	}
}