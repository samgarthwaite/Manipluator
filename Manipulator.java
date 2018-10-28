/**
 * 
 * @author Sam Garthwaite
 *
 */
public class Manipulator 
{
	public static void main(String[] args)
	{
		Scanner Keyboard = new Scanner(System.in);
		System.out.println("Please input any string \t");
		String str = Keyboard.nextLine();
		
		char firstLetter = str.charAt(0);
		char secondLetter = str.charAt(str.length() - 1);
		System.out.println("The First char is " + firstLetter + " and it is " + secondLetter + " and the length is " + str.length());
		
		System.out.println("Press enter to continue");
		String hmm = Keyboard.nextLine();
		
		String firstHalf = str.substring(0, str.length() / 2);
		System.out.println("The first half of the string " + firstHalf);
		
		System.out.println("Press enter to continue");
		hmm = Keyboard.nextLine();
		
		System.out.println("Please input a char to search for");
		String bigChar = Keyboard.nextLine();
		System.out.println("the index where this char is " + str.indexOf(bigChar));
		
		System.out.println("Press enter to continue");
		hmm = Keyboard.nextLine();
		
		System.out.println("Please input a starting point");
		String startStr = Keyboard.nextLine();
		int start = Integer.parseInt(startStr);
		
		System.out.println("Please input an end");
		String endStr = Keyboard.nextLine();
		int end = Integer.parseInt(endStr);
		
		System.out.println("The string you selected is " + str.substring(start, end));
	}
}
