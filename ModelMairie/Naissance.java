

import java.util.*;

/**
 * 
 */
public class Naissance extends EvenementCivil {

    /**
     * Default constructor
     */
    public Naissance(Date dateE, String l, Homme h, Mairie mri, Femme f) {
    	super(dateE, l);
		h = homme;
		mri = mairie;
		f = femme;
    }

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