import java.util.Scanner;
public class DataPlan extends Receiver {
    
    public DataPlan(String name)
    {
        super(name);
    }
    
    public boolean resolve(ServicePackage servicePackage) // return false for finishing chain
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Type which Data plans to use ------------- ");
        System.out.println("Do not need Data plan                    0 ");
        System.out.println("10 Gigabyte Data                         1 ");
        System.out.println("5 Gigabyte Data                          2 ");
        System.out.println("2 Gigabyte Data                          3 ");
        System.out.println("0 Gigabyte Data                          4 ");
        String input = in.nextLine();
        int choice = Integer.parseInt(input);

        if(choice == 0){
            return false;
        }

        choice -= 1;
        servicePackage.data =  DataPlans.values()[choice].getValue();
        servicePackage.monthlyFee += DataPlans.values()[choice].getPrice();

        return false;
    }
    public void done()
    {
        System.out.println("Pick and Choose package finished");
    }
}