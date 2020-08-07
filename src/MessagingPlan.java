import java.util.Scanner;
public class MessagingPlan extends Receiver {
    
    public MessagingPlan(String name)
    {
        super(name);
    }
    
    public boolean resolve(ServicePackage servicePackage) //return false if success (return true only when you need to cut chain)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Type which Call plans to use ------------- ");
        System.out.println("Do not need Messaging plan               0 ");
        System.out.println("Unlimited Messaging                      1 ");
        System.out.println("100K Messaging                           2 ");
        System.out.println("5K Messaging                             3 ");
        System.out.println("250 Messaging                            4 ");
        String input = in.nextLine();
        int choice = Integer.parseInt(input);

        if(choice == 0){
            return false;
        }

        choice -= 1;
        servicePackage.messaging =  MessagePlans.values()[choice].getValue();
        servicePackage.monthlyFee += MessagePlans.values()[choice].getPrice();

        return false;
    }
    public void done()
    {
        System.out.println("Pick and Choose package finished");
    }
}