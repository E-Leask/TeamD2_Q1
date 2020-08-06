import java.util.ArrayList;
import java.util.List;

public class ServiceManagementImpl implements ServiceManagement {
	
	List<ServiceAccount> accountList = new ArrayList<ServiceAccount>();

	@Override
	public void createAccount(String accountPackage) {
		System.out.println("Current available service packages are: BasicPackage, SilverPackage, GoldPackage, and PlatinumPackage");
		System.out.println("Please enter the service package for the new account:");
		Scanner sc = new Scanner(System.in);
		String service = sc.nextLine();
		sc.close();
		ServicePackage servicePackage;
		ServiceAccount serviceAccount;
		switch (service) {
			case "BasicPackage": servicePackage = new BasicPackage(); 
				serviceAccount = new ServiceAccount(servicePackage);
				accountList.add(serviceAccount);
				break;
			case "SilverPackage": servicePackage = new SilverPackage();
				serviceAccount = new ServiceAccount(servicePackage);
				accountList.add(serviceAccount);
				break;
			case "GoldPackage": servicePackage = new GoldPackage();
				serviceAccount = new ServiceAccount(servicePackage);
				accountList.add(serviceAccount);
				break;
			case "PlatinumPackage": servicePackage = new PlatinumPackage();
				serviceAccount = new ServiceAccount(servicePackage);
				accountList.add(serviceAccount);
				break;
			default: System.out.println("Wrong package name being entered"); 
				break;
		}
	}

	@Override
	public void createAccounts(List<String> accountPackages) {
		System.out.println("Current available service packages are: BasicPackage, SilverPackage, GoldPackage, and PlatinumPackage");
		System.out.println("Please enter the service package for the new accounts separated by comma (one package per account):");
		Scanner sc = new Scanner(System.in);
		String servicesUserInput = sc.nextLine();
		sc.close();
		String[] services =  servicesUserInput.split(",*\\s*");
		ServicePackage servicePackage;
		ServiceAccount serviceAccount;
		for (String service : services) {
			switch (service) {
			case "BasicPackage": servicePackage = new BasicPackage(); 
				serviceAccount = new ServiceAccount(servicePackage);
				accountList.add(serviceAccount);
				break;
			case "SilverPackage": servicePackage = new SilverPackage();
				serviceAccount = new ServiceAccount(servicePackage);
				accountList.add(serviceAccount);
				break;
			case "GoldPackage": servicePackage = new GoldPackage();
				serviceAccount = new ServiceAccount(servicePackage);
				accountList.add(serviceAccount);
				break;
			case "PlatinumPackage": servicePackage = new PlatinumPackage();
				serviceAccount = new ServiceAccount(servicePackage);
				accountList.add(serviceAccount);
				break;
			default: System.out.println("Wrong package name being entered, or input format is wrong (i.e. BasicPackage, GoldPackage)"); 
				break;
			}
		}
	}

	@Override
	public void removeAccount(String accountName) {
		// accountList.remove(accountName)
		
	}

	@Override
	public void removeAccounts(List<String> accountNames) {
		// for (accountName : accountNames) { accountList.remove(accountName) }
		
	}

	@Override
	public void getAccountDetails(String accountName) {
		// ServiceAccount.toString
		
	}

	@Override
	public void updateAccount() {
		//There is no distingushier in the accountList
		//While interacting with client, how do we know which account in the accountList should be updated?
		
	}

	@Override
	public void listAccountByUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listAccountByService() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listAllAccounts() {
		// for (Account : accountList) { print Account.name }
		
	}

	@Override
	public void getMonthlyFeesAllAccounts() {
		for (ServiceAccount i:accountList) {
			System.out.println(i.getServicePackage().getMonthlyFee());	 
		}
	}

	@Override
	public void getMonthlyFeesByUser(String userName) {
		// TODO Auto-generated method stub
	}

}
