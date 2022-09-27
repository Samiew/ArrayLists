package list.controller;

import java.util.Scanner;
import java.util.ArrayList;

public class Controller
{
	private Scanner keyboardInput;
	private ArrayList<String> nameList;
	
	public Controller()
	{
		this.keyboardInput = new Scanner(System.in);
		this.nameList = new ArrayList<String>();
	}
	
	public void start()
	{
		listDemo();
		
		
		keyboardInput.close();
	}
	
	private void listDemo()
	{
		System.out.println("What is the word?");
		String firstWord = keyboardInput.nextLine();
		System.out.println("Type in another word...");
		String secondWord = keyboardInput.nextLine();
		//Do you want to keep doing this over and over?????
		
		for (int index = 0; index < 10; index++)
		{
			System.out.println("Type in a name...");
			String name = keyboardInput.nextLine();
			nameList.add(name);
		}
		System.out.println("Name is Not available : (");
		System.out.println("But the list is!!");
		
		for (int index = 0; index < nameList.size(); index++)
		{
			System.out.println("The" + index + "the name is: " + nameList.get(index));
		}
	
	String thisWasTheLastName = nameList.remove(nameList.size() - 1);
	
	System.out.println("There are now " + nameList.size() + " name in the list");
	System.out.println("We took out: " + thisWasTheLastName);
	}
	
}