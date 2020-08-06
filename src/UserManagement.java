import java.util.*;

public class UserManagement{
    
    public static ServiceAccount AddUser(ServiceAccount account,UserAccount user){
        account.addUser(user);
        return account;
    }
    public static ServiceAccount AddUsers(ServiceAccount account,ArrayList<UserAccount> users){
        Iterator<UserAccount> user = users.iterator();
        while (user.hasNext()) {
            account.addUser(user);
        }
        return account;
    }
    public static ServiceAccount RemoveUser(ServiceAccount account,UserAccount user){
        account.removeUser(user);
        return account;
    }
    public static ServiceAccount RemoveUsers(ServiceAccount account,ArrayList<UserAccount> users){
        Iterator<UserAccount> user = users.iterator();
        while (user.hasNext()) {
            account.removeUser(user);
        }
        return account;
    }
    public static ServiceAccount UpdateUser(ServiceAccount account,UserAccount originalUser,UserAccount replacementUser){
        	if (account.user.contains(OriginalUser)==true) {
			account.user=replacementUser;
			System.out.println("User " + user +" is updated");
		} else {
			System.out.println("User doesn't exist in this service account");
		}
        return account;
    }
    public void ListUsers(ServiceAccount account){
    Iterator<UserAccount> user = users.iterator();
        while (user.hasNext()) {
            user.printUserAccount(); //
        }    
    }
}