import java.util.*;
public class W5T4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create array
		int array1[] = {1,5,2,3,3,3};
		int array2[] = new int[array1.length];
		//Start for loop
		System.out.print(Arrays.toString(array1));
		for (int i=0;i < array1.length;i++) {
			array2[i] = array1[i];
		}
		System.out.print(Arrays.toString(array2));
	}
	
}
