import java.util.Scanner;
public class W3T2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Give height: ");
		int height = in.nextInt();
		System.out.print("Give width:");
		int width = in.nextInt();in.nextLine();
		System.out.print("Give drawing character: ");
		String character = in.nextLine();
		System.out.print("Filled or not (y=yes, n=no): ");
		String filled = in.nextLine();
		if (filled.charAt(0) == 'y')
		for (int i=0;i<height;i++) {
			for (int j=0;j<width;j++) {
				System.out.print(character.charAt(0));
			}
			System.out.println();
		}
		if(filled.charAt(0) == 'n') {
			for (int j=0;j<width;j++) System.out.print(character.charAt(0));	
			System.out.println();
			for (int i=0;i<height-2;i++) {
					System.out.print(character.charAt(0));
					for (int j=0;j<width-2;j++) {
						System.out.print(" ");
					}
					System.out.println(character.charAt(0));
			}
			for (int j=0;j<width;j++) System.out.print(character.charAt(0));	
			System.out.println();
		}
		in.close();
	}
}
