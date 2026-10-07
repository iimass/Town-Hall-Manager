
import java.util.*;

/**
 * 
 */
public class Mariage extends EvenementCivil {

    /**
     * Default constructor
     */
    public Mariage(Date dateE, String l, Divorce d, Homme h, Mairie mri, Femme f) {
    	super(dateE,l);
		d = divorce;
		h = homme;
		f = femme;
		mri = mairie;
    }

    /**
     * 
     */
	public Mariage(Date dateE, String l, Homme h, Mairie mri, Femme f) {
		super(dateE,l);
		h = homme;
		mri = mairie;
		f = femme;
    }

    /**
     * 
     */
    public Divorce divorce;

    /**
     * 
     */
    public Homme homme;

    /**
     * 
     */
    public Mairie mairie;

    /**
     * 
     */
    public Femme femme;

}