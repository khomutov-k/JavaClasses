package Task1;
import java.util.*;
public class TestCase {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = new ArrayList(Arrays.asList(1,3,6,2,5));
		System.out.println(MathUtils.CalculateTotal(numbers));
		System.out.println(MathUtils.MaximumNumber(numbers));
		System.out.println(MathUtils.CalculateAverage(numbers));
		
	}

}
