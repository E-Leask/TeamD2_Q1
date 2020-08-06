import java.util.List;

public interface ServiceManagement {
	
	public void createAccount();
	
	public void createAccounts();
	
	public void removeAccount(String accountName);
	
	public void removeAccounts(List<String> accountNames);
	
	public void getAccountDetails(String accountName);
	
	public void updateAccount();
	
	public void listAccountByUser();
	
	public void listAccountByService();
	
	public void listAllAccounts();
	
	public void getMonthlyFeesAllAccounts();
	
	public void getMonthlyFeesByUser();
	

}
