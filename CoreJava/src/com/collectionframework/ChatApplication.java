package com.collectionframework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
class User implements Comparable<User>
{
	private String user_name;	
	private String password;
	public User(String user_name, String password) {
		super();
		this.user_name = user_name;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [f_name=" + user_name + ", password=" + password + "]";
	}
	@Override
	public int compareTo(User o) {
		if(this.user_name.compareTo(o.user_name)>0)
			return 1;
		else if (this.user_name.compareTo(o.user_name)<0)
			return -1;
		else	
		{
			if(this.password.compareTo(o.password)>0)
				return 1;
			else if (this.password.compareTo(o.password)<0)
				return -1;
			else
				return 0;
		}
	}
	
}
public class ChatApplication {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		HashMap<String, TreeSet<User>> usermap = new HashMap<String, TreeSet<User>>();
		TreeSet<User> user = new TreeSet<User>();
		HashMap<String,ArrayList<String>> msgmap = new HashMap<String,ArrayList<String>>();
		List<String> msglist = new ArrayList<String>();
		while(true) 
		{
			System.out.println("Option:\nA.Create a chatroom.\nB. Add the user.\nC.User login\nD.Send a message\nE.Display the messages from a specific chatroom\nF.List down all users belonging to the specified chat room\nG.Logout\nH.Delete an user\nI.Delete the chat room.");
			System.out.println("Please Enter your Option");
			Scanner sc= new Scanner(System.in);
			String opt=sc.next();
			System.out.println(opt);
			switch(opt)
			{
			case "A":
					System.out.println("Enter The name of the chart room:");
					String chartroom_name=sc.next();
					
					if(usermap.containsKey(chartroom_name))
					{
						System.out.println("Chat Room Already exist");
					}
					usermap.put(chartroom_name,new TreeSet<User>());
					msgmap.put(chartroom_name,new ArrayList<String>());
					System.out.println("Chat Room Created");
					break;
			case "B":
				    System.out.println("Enter the Chat Room name Where you want :");
				    String chartroom_name1=sc.next();
				    if((user.contains(chartroom_name1)))
				    {
						System.out.println("Enter the user name:");
						String user_name=sc.next();
						System.out.println("Enter the password:");
						String password=sc.next();
						if(user.contains(new User(user_name,password)))
						{
							System.out.println("User Already exist ");
						}
						else {
							user.add(new User(user_name,password));
							//usermap.put(chartroom_name1,new TreeSet<User>());
							System.out.println("User Created");
						}
				    }
				    else
				    {
				    	System.out.println("Chat room not found");
				    }
					break;
			case "C":
					System.out.println("Enter the user name:");
					String user_name1=sc.next();
					System.out.println("Enter the password:");
					String password1=sc.next();
					if(user.contains(new User(user_name1,password1)))
					{
						System.out.println("Login Completed");
					}
					else
						System.out.println("Inncorect Credential");
					break;
			
			}
		}
	}

}
