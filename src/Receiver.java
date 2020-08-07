public abstract class Receiver {
    
    public String name;                    //Name of receiver
    private Receiver next=null;          //Object that will receive request
    ServicePackage servicePackage;
    //List of enums to be used for options for the plan

    public enum Plans {
        UNLIMITED_US_CANADA(40, "unlimited"), UNLIMITED_CANADA(35, "unlimited"), CANADA_500(25 ,"300"), CANADA_100(15 ,"100");
    
        private int price;
        private String calling;
    
        Plans(int price, String calling) {
            this.price = price;
            this.calling = calling;
        }
    
        public int getPrice() {
            return price;
        }

        public String getCalling(){
            return calling;
        }
    }

    public enum MessagePlans {
        UNLIMITED(40, "unlimited"), TENK(30, "100000"), FIVEK(20 ,"5000"), TWOFIVE(15 ,"250");
    
        private int price;
        private String value;
    
        MessagePlans(int price, String value) {
            this.price = price;
            this.value = value;
        }
    
        public int getPrice() {
            return price;
        }

        public String getValue(){
            return value;
        }
    }

    public enum DataPlans {
        UNLIMITED(40, 10), TENK(30, 5), FIVEK(20 ,2), TWOFIVE(0 ,0);
    
        private int price;
        private int value;
    
        DataPlans(int price, int value) {
            this.price = price;
            this.value = value;
        }
    
        public int getPrice() {
            return price;
        }

        public int getValue(){
            return value;
        }
    }

    public Receiver(String name)
    {
        this.name=name;
    }
    public Receiver setNext(Receiver next) //appoint which object will be called next
    {
        this.next = next;
        return next;
    }
    public final void support(ServicePackage servicePackage) //actuall implementation of PC package
    {
        if(resolve(servicePackage))                 //Check if object successfully executed request 
        {               
            done();
        }
        else if(next != null)                //Finished object execution pass it to next plan (data, message)
        {
            next.support(servicePackage);
        }
        else                          //Once execution is finished print status of your package
        {
            System.out.println("Your Pick & Choose Package have");
            System.out.println("US calling     : " + servicePackage.usCalling);
            System.out.println("Canda calling  : " + servicePackage.canadaCalling );
            System.out.println("Data           : " + servicePackage.data);
            System.out.println("Message        : " + servicePackage.messaging);
            System.out.println("Price          : " + servicePackage.getMonthlyFee());

        }
    }
    public abstract boolean resolve(ServicePackage servicePackage);
    public abstract void done();
}
 