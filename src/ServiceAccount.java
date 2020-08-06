package mobileservice;

import java.util.*;

class ServiceAccount {
	List<UserAccount> user = new ArrayList<UserAccount>();
	List<Integer> phoneNumber = new ArrayList<Integer>();
	ServicePackage servicePackage;
	int monthlyFees;
	
	public ServiceAccount(ServicePackage servicePackage) {
		this.servicePackage = servicePackage;
	}
	
	public void addUser(UserAccount user) {
		this.user.add(user);
		System.out.println("User " + user + " is added to the service account");
	}
	
	public void removeUser(UserAccount user) {
		if (this.user.contains(user)==true) {
			this.user.remove(user);
			System.out.println("User " + user +" is removed");
		} else {
			System.out.println("User doesn't exist in this service account");
		}
	}
	
	public void addPhoneNumber(int phoneNumber) {
		this.phoneNumber.add(phoneNumber);
		System.out.println("Phone number: " + phoneNumber + " is added to the service account");
	}
	
	public void removePhoneNumber(int phoneNumber) {
		if (this.phoneNumber.contains(phoneNumber) == true) {
			this.phoneNumber.remove(phoneNumber);
			System.out.println("Phone number " + phoneNumber + " is removed");
		} else {
			System.out.println("Phone number doesn't exist in this service account");
		}
	}
}
