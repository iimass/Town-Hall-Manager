import java.util.*;

/**
 * 
 */
public class Deces extends EvenementCivil {

    /**
     * Default constructor
     */
    public Deces(Date dateE, String l, Femme f, Homme h, Mairie mri) {
    super(dateE, l);
		f = femme;
		h = homme;
		mri = mairie;
		
    }

    /**
     * 
     */
    public Femme femme;

    /**
     * 
     */
    public Homme homme;

    /**
     * 
     */
    public Mairie mairie;

}