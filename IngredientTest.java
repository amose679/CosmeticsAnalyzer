/*
	Basic java Ingredient Analyzer
	To run: open in.txt and paste the product ingredients (separated in ", ""), then open ing.txt and paste in the ingredients you are sensitive to.
	Then javac and java IngredientTest
*/

import java.io.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.lang.String;

public class IngredientTest{

  public static void test(String in, String ing){
		FileReader fReader;
		try {

			//in file
			BufferedReader inBR = new BufferedReader(new FileReader("in.txt"));
			String inText = inBR.readLine();
			inText.toLowerCase();
			String[] inTextArr = inText.split(", ");

			//ingredient file
			BufferedReader ingBR = new BufferedReader(new FileReader("ing.txt"));
			String ingText = ingBR.readLine();
			ingText.toLowerCase();
			String[] ingTextArr = ingText.split(", ");

			//hash the ingredients
			HashMap<String, String> hashy = new HashMap<String, String>();
			for(int i=0; i < ingTextArr.length; i++){
				hashy.put(ingTextArr[i], ingTextArr[i]);
			}

			for(int i=0; i < inTextArr.length; i++){
				if(hashy.containsKey(inTextArr[i])){
					System.out.println("Ingredient "+i+"\\"+inTextArr.length+":    "+inTextArr[i]);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("not a good file input!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



     
  }

  /*test cases*/
  public static void main(String[] args) {
  test("in.txt", "ing.txt");  
  }
}