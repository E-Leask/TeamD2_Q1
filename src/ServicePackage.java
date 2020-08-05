
public abstract class ServicePackage {
	String name;
	double canada_calling;
	double us_calling;
	double messaging;
	int data;

	
	String getName() {
		System.out.println(name);
		return name;
	}
	
	public String toString() {
		// code to display pizza name and ingredients
		StringBuffer display = new StringBuffer();
		display.append("----"+ name + " ----\n");
		display.append("Canada calling plan: " + canada_calling + " min \n");
		display.append("US calling plan: " + us_calling + " min \n");
		display.append("Messaging plan:" + messaging + " messages \n");
		display.append("Data plan: " + data + "GB \n");

		//System.out.println(display);
		
		return display.toString();
	}
}
