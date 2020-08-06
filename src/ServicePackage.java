public abstract class ServicePackage {
	String name;
	double canadaCalling;
	double usCalling;
	double messaging;
	int data;
	int monthlyFee;
	
	String getName() {
		System.out.println(name);
		return name;
	}
	
	int getMonthlyFee() {
		System.out.println(monthlyFee);
		return monthlyFee;
	}
	
	
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("----"+ name + " ----\n");
		display.append("Canada calling plan: " + canadaCalling + " min \n");
		display.append("US calling plan: " + usCalling + " min \n");
		display.append("Messaging plan: " + messaging + " messages \n");
		display.append("Data plan: " + data + " GB \n");
		display.append("Monthly fee: $"  + monthlyFee + "\n");
		//System.out.println(display);
		
		return display.toString();
	}
}
