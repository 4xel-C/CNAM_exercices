package jeuvie;

public class Bestiole {
	
	private final int numero;
	private String couleur;
	private static int compteur = 0;
	
	public static final String VIVANTE = "verte";
	public static final String MORTE = "rouge";
	public static final String VIRTUELLE = "noire";
	
	
	public Bestiole(String couleur) {
		super();
		this.numero = compteur;
		this.couleur = couleur;
		compteur++;
	}
	
	public boolean isVivante() {
		if (this.getCouleur().equals(VIVANTE)) {
			return true;
		}
		
		return false;
	}
	
	// Getters
	public int getNumero() {
		return this.numero;
	}
	
	public String getCouleur() {
		return this.couleur;
	}
	
	// Setters
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	@Override
	public String toString() {
		if (this.isVivante()) {
			return "bestiole " + this.numero + " (vivante)";
		} else {
			return "bestiole " + this.numero;
		}
	}
	

	

	
}
