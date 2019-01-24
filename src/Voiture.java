
public class Voiture {
	// les propriétés de l'objet ne doivent pas êtres publiques
	// private: elles sont accessibles uniquement à l'interieur de la classe {}
	// = encapsulation
	private String nom;
	private int nombreDePortes;
	private int nombreDePlaces;
	private String moteur;
	private String couleur;

	// constructeur sans paramètres
	public Voiture() {
		super();
	}

	// constructeur avec paramètres
	// dès qu'on en génère un il faut générer le sans paramètres avec
	public Voiture(String nom, int nombreDePortes, int nombreDePlaces, String moteur, String couleur) {
		super();
		this.nom = nom;
		this.nombreDePortes = nombreDePortes;
		this.nombreDePlaces = nombreDePlaces;
		this.moteur = moteur;
		this.couleur = couleur;
	}
//----------------------------------------------------------------------------------

	// méthodes commandent des actions
	public void avancer() {
		System.out.println("vrouuuummmm!");
	}

	public void freiner() {
		System.out.println("Stop!");
	}

	public void marcheAr() {
		System.out.println("Marche arrière");
	}

	public void tourner() {
		System.out.println("je tourne");
	}

	public void changerCouleur(String nouvelleCouleur) {
		couleur = nouvelleCouleur;
	}
// ---------------------------------------------------------------------------------

	// Getters: (accesseurs) pour récupérer les valeurs des propriétés non public
	public String getNom() {
		return nom;
	}

	// Setters: (mutateurs) pour changer les propriétés
	public void setNom(String nouveauNom) {
		nom = nouveauNom;
	}

	// pour les générer: (clicdroit-source) ou alt shift S-generate getters and
	// setters
	// selection + cocher la case comments et éventuellement last member
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
	 * les constructeurs doivent (presque tjs être en public sinon impossibilité de
	 * construire de nouveaux objets
	 */
// ----------------------------------------------------------------------------------

	// MOULE:
	// - propriétés non publiques
	// - constructeurs: avec et sans paramètres
	// - méthodes
	// - getters et setters

}
