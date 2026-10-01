
import java.util.*;

/**
 * 
 */
public class Citoyens {

    /**
     * Default constructor
     */
    public Citoyens(int id, String n, String p, Date dateN, Mairie mri) {
		idUnique = id;
		nom = n;
		prenom = p;
		dateNaissance = dateN;
		mairie = mri;
    }

    /**
     * 
     */
    public int idUnique;

    /**
     * 
     */
    public String nom;

    /**
     * 
     */
    public String prenom;

    /**
     * 
     */
    public Date dateNaissance;

    /**
     * 
     */
    public Mairie mairie;

}