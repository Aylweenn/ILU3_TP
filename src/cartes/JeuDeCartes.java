package cartes;

public class JeuDeCartes {
	Configuration[] typesDeCartes;
	
	public JeuDeCartes() {
		typesDeCartes = new Configuration[19];
		
		typesDeCartes[0] = new Configuration(new Attaque(Type.FEU), 5);
		typesDeCartes[1] = new Configuration(new Attaque(Type.ACCIDENT), 3);
		typesDeCartes[2] = new Configuration(new Attaque(Type.CREVAISON), 3);
		typesDeCartes[3] = new Configuration(new Attaque(Type.ESSENCE), 3);
		typesDeCartes[8] = new Configuration(new DebutLimite(), 4);
		typesDeCartes[8] = new Configuration(new FinLimite(), 6);
		typesDeCartes[4] = new Configuration(new Parade(Type.FEU), 14);
		typesDeCartes[5] = new Configuration(new Parade(Type.ACCIDENT), 6);
		typesDeCartes[6] = new Configuration(new Parade(Type.CREVAISON), 6);
		typesDeCartes[7] = new Configuration(new Parade(Type.ESSENCE), 6);
		typesDeCartes[8] = new Configuration(new Botte(Type.ACCIDENT), 1);
		typesDeCartes[9] = new Configuration(new Botte(Type.FEU), 1);
		typesDeCartes[10] = new Configuration(new Botte(Type.ESSENCE), 1);
		typesDeCartes[11] = new Configuration(new Botte(Type.CREVAISON), 1);
		typesDeCartes[12] = new Configuration(new Borne(25), 10);
		typesDeCartes[8] = new Configuration(new Borne(50), 10);
		typesDeCartes[8] = new Configuration(new Borne(75), 10);
		typesDeCartes[8] = new Configuration(new Borne(100), 12);
		typesDeCartes[8] = new Configuration(new Borne(200), 4);
	}
	
	public String affichageJeuDeCartes() {
		StringBuilder jeu = new StringBuilder();
		for (int i=0; i < typesDeCartes.length; i++) {
			 jeu.append(typesDeCartes[i].getNbExemplaires());
	         jeu.append(" ");
	         jeu.append(typesDeCartes[i].getCarte().toString());
	         jeu.append("\n");
		}
		return jeu.toString();
	}
	
	public Carte[] donnerCartes() {
		Carte[] cartes = new Carte[110];
		int i=0;
	    for(int j=0;j<19;j++) {
	    	for(int k=0;k<typesDeCartes[j].getNbExemplaires();k++,i++) {
	    		cartes[i]=(typesDeCartes[j].getCarte());
	        }
	    }
	    return cartes;
	}
	
}
