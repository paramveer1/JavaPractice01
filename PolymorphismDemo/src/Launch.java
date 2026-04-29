
public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alto alto = new Alto();
		Launch launch = new Launch();
		launch.showDetails(alto);
		System.out.println();
		Swift swift = new Swift();
		launch.showDetails(swift);
		System.out.println();
		Thar thar = new Thar();
		launch.showDetails(thar);

	}
	
	
	void showDetails(Car c) {
	 System.out.println("Details of Car" );
	 c.colour();
	 c.mileage();
	 c.speed();
		
	}

}
