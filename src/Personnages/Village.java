package Personnages;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois=0;
	private int nbVillageoisMaximum;
	private Gaulois [] villageois;

	
	public Village(String nom,int nbVillageoisMaximum) {
		this.nom = nom;
		this.nbVillageoisMaximum=nbVillageoisMaximum;
		this.villageois=new Gaulois [nbVillageoisMaximum];
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois]=gaulois;
		nbVillageois++;
	}
	
	public Gaulois trouverHabitant (int numero) {
			return villageois[numero];
	}

	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles",30);
		/*Gaulois gaulois = village.trouverHabitant(30);*/
		Chef chef = new Chef("Abraracourcix ",6,village);
		village.setChef(chef);
		Gaulois gauloi = new Gaulois ("Asterix",8,0);
		village.ajouterHabitant(gauloi);
		/*Gaulois gaulois = village.trouverHabitant(1);
		System.out.println(gaulois);*/
		

		
	}
}
