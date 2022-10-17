
public class Taxi {
	
	
	
		public Taxi(String numberPlate, double km, double taxiMeter, double fuel, int passenger) {
			
			
		this.numberPlate = numberPlate;
		this.km = km;
		this.taxiMeter = taxiMeter;
		this.fuel = fuel;
		this.passenger = passenger;
	}
		public Taxi() {
			
			System.out.println("Yetersiz gelir: " + getTaxiMeter());
			
	}
		private String numberPlate = "35 T 3535";
		private double km = 250.79;
		private double taxiMeter = km/2*9;
		private double fuel = km*1.5;
		private int passenger = 39;
		public String getNumberPlate() {
			return numberPlate;
		}
		public void setNumberPlate(String numberPlate) {
			this.numberPlate = numberPlate;
		}
		public double getKm() {
			return km;
		}
		public void setKm(double km) {
			this.km = km;
		}
		public double getTaxiMeter() {
			return taxiMeter;
		}
		public void setTaxiMeter(double taxiMeter) {
			this.taxiMeter = taxiMeter;
		}
		public double getFuel() {
			return fuel;
		}
		public void setFuel(double fuel) {
			this.fuel = fuel;
		}
		public int getPassenger() {
			return passenger;
		}
		public void setPassenger(int passenger) {
			this.passenger = passenger;
		}
		

		
		
	}
	 
	
	
	

	
	
	


