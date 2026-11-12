package jeuvie.bestiole;
import jeuvie.Couleur;

public abstract class Bestiole implements IBestiole {

	private static int compteur = 0;
	protected Couleur couleur;
	protected boolean vivante = true;
	protected final int numero;
	
	protected abstract Couleur getCouleurVivant();
	protected abstract Couleur getCouleurMort();
	public abstract Bestiole clone();
	
	public Bestiole() {
		this.numero = compteur;
		compteur++;
	}
	
	// Cloning constructor, avoid incrementing compteur
	public Bestiole(Bestiole that) {
		this.couleur = that.couleur;
		this.vivante = that.vivante;
		this.numero = that.numero;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public boolean isVivante() {
		return this.vivante;
	}
	
	public Couleur getCouleur() {
		return this.vivante ? getCouleurVivant() : getCouleurMort();
	}
	
	public void tuer(){
		this.vivante = false;
	}
	
	
}
