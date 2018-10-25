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
		System.out.println("The First char is " + firstLetter + " ");
	}
}
