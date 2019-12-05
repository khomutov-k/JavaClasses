package Task1;
import java.util.*;
public class MathUtils {

	static int CalculateTotal(List<Integer> numberList) {
		int sum = 0;
		for(int number:numberList) {
			sum+=number;
		}
		return sum;
	}
	static int MaximumNumber(List<Integer> numberList) {
		int max = 0;
		for(int number:numberList){
			if(number>max) max = number; 
		}
		return max;
	}
	static double CalculateAverage(List<Integer> numberList) {
		double sum=0;
		for(int number:numberList) {
			sum+=number;
		}
		return sum/numberList.size();
	}
}
