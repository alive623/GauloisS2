package Personnages;

public class Gaulois {
private String nom;
private int force;
private int effetPotion = 1;

public Gaulois(String nom, int force , int effetPotion) {
this.nom = nom;
this.force = force;
this.effetPotion=effetPotion;
}
public String getNom() {
return nom;


}
public void setEffetPotion(int effetPotion) {
	this.effetPotion = effetPotion;
}
public void parler(String texte) {
System.out.println(prendreParole() + "« " + texte + "»");
}
private String prendreParole() {
return "Le gaulois " + nom + " : ";
}
public void frapper(Romain romain) {
System.out.println(nom + " envoie un grand coup dans la mâchoire de "
+ romain.getNom());
romain.recevoirCoup((force / 3)*effetPotion);
}

public void boirePotion(int forcepotion) {
	effetPotion=forcepotion;
	parler("Merci Druide, je sens que ma force est 3 fois décuplée.");
	
	
	
}



//public String toString() {return "Gaulois [nom=" + nom + ", force=" + force+ ", effetPotion=" + effetPotion + "]";
//}
public static void main(String[] args) {
	Gaulois asterix = new Gaulois("Astérix",8,5);
	System.out.print(asterix);
	System.out.println("le nom est :" + asterix.getNom() + "la Force est  : " + asterix.force);
	System.out.println(asterix);
	System.out.println(asterix.getNom());
	System.out.print(asterix);
	System.out.println();
	asterix.parler(" Hello");
	Romain combattant = new Romain("Dany",15) ;
	asterix.frapper(combattant);
	Druide  Panoramix = new Druide ("Panoramix",5,10);
	int force = Panoramix.preparation();
	asterix.boirePotion(force); 
	
	
	

}
}