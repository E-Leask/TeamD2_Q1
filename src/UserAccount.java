class UserAccount{
	String userName;
	String userAddress;
	String userEmail;
	
	public UserAccount(String userName, String userAddress, String userEmail) {
		this.userName = userName;
		this.userAddress = userAddress;
		this.userEmail = userEmail;
	}
	
	public void printUserAccount() {
		System.out.println("User Name: " + userName);
		System.out.println("User Address: " + userAddress);
		System.out.println("User Email: " + userEmail);
	}
}
