package edu.gatech.oad.antlab.person;
import java.util.Random;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Bob
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
        /*
        Random rand = new Random();
        int  n = rand.nextInt(input.length()) + 1;
        String result = "";
        for ( int i = 0; i < input.length(); i++) {
            
        }
        while ()
            return result;
        */
        String[] inputChar = input.split("");
        int length = inputChar.length;
        int counter = length;
        String newInput = "";
        Random r = new Random();
        while (counter != 0) {
            int index = r.nextInt(length);
            if (!inputChar[index].equals("")){
                newInput+=inputChar[index];
                inputChar[index] = "";
                counter--;
            }
        }
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
}
