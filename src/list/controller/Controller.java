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
		moreListStuff();
		listDemo();

		keyboardInput.close();
	}

	private void listDemo()
	{
		System.out.println("What is the word?");
		String firstWord = keyboardInput.nextLine();
		System.out.println("Type in another word...");
		String secondWord = keyboardInput.nextLine();
		// Do you want to keep doing this over and over?????

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



	private void usingWrapperClass()
	{
		ArrayList<Double> lotsOfNumbers = new ArrayList<Double>();

		for (int index = 0; index < 400; index++)
		{
			double random = Math.random();

			lotsOfNumbers.add(random);
		}
		selectionSort(lotsOfNumbers);

		for (double number : lotsOfNumbers)
		{
			System.out.print(number + " ");
		}
	}
	
	private void sortStrings()
	{
		ArrayList<String> demoWords = new ArrayList<String>();
		demoWords.add("this");
		demoWords.add("is");
		demoWords.add("an");
		demoWords.add("insertion");
		demoWords.add("sort");
		demoWords.add("demonstration");
		demoWords.add("Samie");
		
		insertionSort(demoWords);
		
		for (String word : demoWords)
		{
			System.out.println(word);
		}
	}
	
	private void insertionSort(ArrayList<String> words)
	{
		for (int outer = 1; outer < words.size(); outer++)
		{
			String tested = words.get(outer);
			
			int inner = outer - 1;
			
			while ( inner >= 0 && tested.compareTo(words.get(inner)) < 0)
			{
				words.set(inner +1,  words.get(inner));
				inner--;
			}
			words.set(inner + 1,  tested);
			}
		}

	private void selectionSort(ArrayList<Double> numbers)
	{
		for (int outerLoop = 0; outerLoop < numbers.size(); outerLoop++)
		{
			int minIndex = outerLoop;

			for (int inner = outerLoop + 1; inner < numbers.size(); inner++)
			{
				if (numbers.get(inner) < numbers.get(minIndex))
				{
					minIndex = inner;
				}
			}

			if (minIndex != outerLoop)
			{
				swapItem(minIndex, outerLoop, numbers);
			}
		}

	}

	private void swapItem(int firstIndex, int secondIndex, ArrayList<Double> data)
	{
		double tempItem = data.get(firstIndex);
		data.set(firstIndex, data.get(secondIndex));
		data.set(secondIndex, tempItem);
	}

	private void moreListStuff()
	{
		ArrayList<String> messages = new ArrayList<String>();

		for (int index = 0; index < 100; index++)
		{
			String message = "This is a message and is at inde: " + index;
			messages.add(message);
		}

		keyboardInput.nextLine();
	}
}