import java.util.List;

public class ServiceManagementImpl implements ServiceManagement {
	
	List<ServiceAccount> accountList = new List<ServiceAccount>();

	@Override
	public void createAccount(String accountPackage) {
		//Call factory method with accountPackage
		//accountList.add(ServiceAccount)
		
	}

	@Override
	public void createAccounts(List<String> accountPackages) {
		// Call factory method
		//accountList.addAll(ServiceAccount Obj)
		
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
		// TODO Auto-generated method stub
		
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
		// for (Account : accountList) { print Account.fee }
		
	}

	@Override
	public void getMonthlyFeesByUser() {
		// TODO Auto-generated method stub
		
	}

}
