

import java.util.*;

/**
 * 
 */
public class Mairie {

    /**
     * Default constructor
     */
    public Mairie(int id) {
		idUnique = id;
    }

    /**
     * 
     */
    public int idUnique;

    /**
     * 
     */
    public Vector<Citoyens> list_citoyens = new Vector<Citoyens>();
	public void ajourcitoyens(Citoyens citoyens){
		this.list_citoyens.add(citoyens);
	}

    /**
     * 
     */
    public Vector<Naissance> list_naissance = new Vector<Naissance>();
	public void ajoutnaissance(Naissance naissance){
		this.list_naissance.add(naissance);
	}

    /**
     * 
     */
    public Vector<Mariage> list_mariage = new Vector<Mariage>();
	public void ajoutmariage(Mariage mariage){
		this.list_mariage.add(mariage);
	}

    /**
     * 
     */
    public Vector<Deces> list_deces = new Vector<Deces>();
	public void ajoutdeces(Deces deces){
		this.list_deces.add(deces);
	}

}