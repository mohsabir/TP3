package tp3.vehicules;

public class Vehicule {
//	
     //attributs proteges 
	protected String matricule; 
	protected String marque;
	
	 //constructeur prametre
	public Vehicule(String matricule, String marque ) {
	  this.matricule= matricule;
	  this.marque= marque;
}
	

	public void stationner() {
		System.out.println("le véhicule se gare dans le parking");
	
	}
	
    public void afficher() {
    	System.out.println("Matricule:" + matricule +",Marque"+ marque);
    }
    
}
