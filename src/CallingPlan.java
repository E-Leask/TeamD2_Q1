import java.util.Scanner;
public class CallingPlan extends Receiver {
    
    public CallingPlan(String name)
    {
        super(name);
    }
    
    public boolean resolve(ServicePackage servicePackage) //return false to pass it to Messageplan.java
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Type which Call plans to use ------------- ");
        System.out.println("Do not need Calling plan                 0 ");
        System.out.println("Unlimited Canada & US Calling            1 ");
        System.out.println("Unlimited Canada Calling                 2 ");
        System.out.println("100 Minutes Canada Calling               3 ");
        System.out.println("30 Minutes Canada Calling                4 ");
        String input = in.nextLine();
        int choice = Integer.parseInt(input);
        

        if(choice == 0){
            return false;
        }

        choice -= 1;
        if(choice == 0){
            servicePackage.canadaCalling =  Plans.values()[choice].getCalling();
            servicePackage.usCalling =  Plans.values()[choice].getCalling();
        }
        else{
            servicePackage.canadaCalling =  Plans.values()[choice].getCalling();
        }
        servicePackage.monthlyFee += Plans.values()[choice].getPrice();

        return false;
    }
    public void done()
    {
        System.out.println("Pick and Choose package finished");
    }
}