package histoire;

import Personnages.Druide;
import Personnages.Gaulois;
import Personnages.Romain;

public class Scenario {
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix",8, 0);
		Gaulois ob = new Gaulois("Obelix",8, 0);
		Romain minus = new Romain("Minus",6);

		Druide Panoramix = new Druide("Panoramix",5,10);
		Panoramix.parler("Je vais aller préparer une petite potion");
		Panoramix.preparation();
		Panoramix.booster(ob);
		ob.parler("Par bélenos, ce n'est pas juste");
		Panoramix.booster(asterix);
		asterix.parler("  Bonjour à tous ");
		minus.parler(" UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		
		
	}

}