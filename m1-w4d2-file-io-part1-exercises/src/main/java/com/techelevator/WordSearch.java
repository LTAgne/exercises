package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		
		System.out.print("Please enter the file you would like to search? (include full path):");
		File userFile = new File(input.nextLine()); 
															  
		System.out.print("What word would you like to search?:");
		String wordToSearch = input.nextLine();   
		
		System.out.print("Would you like this search to be case sensitive?: Yes or No");
		String caseSensitive = input.nextLine(); 
		//Boolean caseSensitive = input.hasNextLine();   
		
		try(Scanner input1 = new Scanner(userFile)){  // this is already case sensitive
			int lineCounter = 0;
			if (caseSensitive.equals("Yes")){
				while(input1.hasNextLine()){           
				String line = input1.nextLine(); 
				lineCounter++;
				if (line.contains(wordToSearch)){
					System.out.print(lineCounter + ") ");
					System.out.println(line);
				}
			}	
			}else if (caseSensitive.equals("No")){
				while(input1.hasNextLine()){           
					String line = input1.nextLine(); 
					lineCounter++;
					if (line.toUpperCase().contains(wordToSearch.toUpperCase())){ 
						System.out.print(lineCounter + ") ");
						System.out.println(line);
			}
			}	
			}		
							
		}catch (FileNotFoundException e) {
			System.out.println("Your file doesn't exist.");
		}
	}
	}




