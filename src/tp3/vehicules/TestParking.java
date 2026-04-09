package tp3.vehicules;

	public class TestParking {

		public static void main(String[] args) {
				// TODO Auto-generated method stub

			

				 // a  Creer tableau
			 Vehicule[] v = new Vehicule[4];

			   //b  inisialise tableau
			  v[0] = new Voiture("x1", "Tayouta ",4 );
			  v[1] = new Voiture("x2", "BMW",2 );
			  v[2] = new Moto("11C22", "Yamaha ", true); 
			  v[3] = new Camion("C1", "Camion", 5000);
			  
			  //c Parcours polymorphe
		        for (Vehicule veh : v) {
		            veh.stationner();
		            veh.afficher();
		            System.out.println("-----");
		}  
		        
		        
		        // Afficher uniquement les voitures
		        System.out.println("=== Voitures ===");
		        for (Vehicule veh : v) {
		            if (veh instanceof Voiture) {
		                veh.afficher();
		            }
	       }
		        
	    }
	}
