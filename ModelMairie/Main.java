import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Mairie maMairie = new Mairie(1);
		Homme sami = new Homme(100, "Hammouche", "Sami", new Date(), maMairie);
		System.out.println("Citoyens 100 : ID unique : " +sami.idUnique+ ", Prénom : "+sami.prenom+", Nom : "+sami.nom+", Date de naissance : "+sami.dateNaissance+", Citoyens de la mairie ID : "+sami.mairie.idUnique);
	}

}
