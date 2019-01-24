
public class Voiture {
	// les propri�t�s de l'objet ne doivent pas �tres publiques
	// private: elles sont accessibles uniquement � l'interieur de la classe {}
	// = encapsulation
	private String nom;
	private int nombreDePortes;
	private int nombreDePlaces;
	private String moteur;
	private String couleur;

	// constructeur sans param�tres
	public Voiture() {
		super();
	}

	// constructeur avec param�tres
	// d�s qu'on en g�n�re un il faut g�n�rer le sans param�tres avec
	public Voiture(String nom, int nombreDePortes, int nombreDePlaces, String moteur, String couleur) {
		super();
		this.nom = nom;
		this.nombreDePortes = nombreDePortes;
		this.nombreDePlaces = nombreDePlaces;
		this.moteur = moteur;
		this.couleur = couleur;
	}
//----------------------------------------------------------------------------------

	// m�thodes commandent des actions
	public void avancer() {
		System.out.println("vrouuuummmm!");
	}

	public void freiner() {
		System.out.println("Stop!");
	}

	public void marcheAr() {
		System.out.println("Marche arri�re");
	}

	public void tourner() {
		System.out.println("je tourne");
	}

	public void changerCouleur(String nouvelleCouleur) {
		couleur = nouvelleCouleur;
	}
// ---------------------------------------------------------------------------------

	// Getters: (accesseurs) pour r�cup�rer les valeurs des propri�t�s non public
	public String getNom() {
		return nom;
	}

	// Setters: (mutateurs) pour changer les propri�t�s
	public void setNom(String nouveauNom) {
		nom = nouveauNom;
	}

	// pour les g�n�rer: (clicdroit-source) ou alt shift S-generate getters and
	// setters
	// selection + cocher la case comments et �ventuellement last member
	/**
	 * @return the nombreDePortes
	 */
	public int getNombreDePortes() {
		return nombreDePortes;
	}

	/**
	 * @param nombreDePortes the nombreDePortes to set
	 */
	public void setNombreDePortes(int nombreDePortes) {
		if (nombreDePortes > 5) {
			this.nombreDePortes = 5;
		} else {
			this.nombreDePortes = nombreDePortes;
		}
	}

	/**
	 * @return the nombreDePlaces
	 */
	public int getNombreDePlaces() {
		return nombreDePlaces;
	}

	/**
	 * @param nombreDePlaces the nombreDePlaces to set
	 */
	public void setNombreDePlaces(int nombreDePlaces) {
		this.nombreDePlaces = nombreDePlaces;
	}

	/**
	 * @return the moteur
	 */
	public String getMoteur() {
		return moteur;
	}

	/**
	 * @param moteur the moteur to set
	 */
	public void setMoteur(String moteur) {
		this.moteur = moteur;
	}

	/**
	 * @return the couleur
	 */
	public String getCouleur() {
		return couleur;
	}

	/**
	 * @param couleur the couleur to set
	 */
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	/*
	 * les constructeurs doivent (presque tjs �tre en public sinon impossibilit� de
	 * construire de nouveaux objets
	 */
// ----------------------------------------------------------------------------------

	// MOULE:
	// - propri�t�s non publiques
	// - constructeurs: avec et sans param�tres
	// - m�thodes
	// - getters et setters

}
