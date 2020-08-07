public class Main {
 
    public static void main(String argsp[]) throws InterruptedException
    {    
        Receiver callingPlabReceiver = new CallingPlan("Calling Plan");
        Receiver messagingPlanReceiver = new MessagingPlan("Message plan");
        Receiver dataPlanReceiver = new DataPlan("Data Plan");
        ServicePackage servicePackage = new BearBone();
        callingPlabReceiver.setNext(messagingPlanReceiver);
        messagingPlanReceiver.setNext(dataPlanReceiver);

        callingPlabReceiver.support(servicePackage);
    }
}