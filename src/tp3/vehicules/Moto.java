package tp3.vehicules;

public class Moto extends Vehicule {


   //attribut supplementaire
	private boolean avecCasque;
	
	
	public Moto(String matricule, String marque,boolean avecCasque ) {
	   super(matricule, marque);
       this.avecCasque=avecCasque;
	}
	
	@Override
	public void stationner() {
		 System.out.println("la moto se gare dans une place serevee aux deux-roues");    
    }
	
	@Override 
	public void afficher () {
	   super.afficher();
	   System.out.println("avacCasque :" + avecCasque); 
	   
		
	}
	
	
}