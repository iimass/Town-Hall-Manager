
import java.util.*;

/**
 * 
 */
public class Homme extends Citoyens {

    /**
     * Default constructor
     */
    public Homme(int id, String n, String p, Date dateN, Mairie mri) {
    	super(id,n,p,dateN,mri);
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