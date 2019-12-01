package codingDay.code;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;

public class maxProfit {

	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		ArrayList<Integer[]> arrays = new ArrayList<Integer[]>();
		
//		while(s.hasNext()) {
//			int size = s.nextInt();
//			if(size == 0) {
//				break;
//			}
//			Integer[] arr = new Integer[size];
//			for(int i = 0; i< size; i++) {
//				arr[i] = s.nextInt();
//			}
//			arrays.add(arr);
//		}
//		s.close();
		
		String input;
		StringTokenizer idata;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while((input = reader.readLine()) != null) {
			idata = new Str	
		}
		
		for(int i = 0; i < arrays.size(); i++) {
			profitMax(arrays.get(i));
		}
	}
	
	public static void profitMax(Integer[] array) {
		int[] results = new int[array.length];
		results[0] = array[0];
		
		for(int i = 1; i < array.length; i++) {
			results[i] = Math.max(results[i-1] + array[i], array[i]);
		}
		
		int maxValue = results[0];
		for(int i = 1; i < array.length; i++) {
			if(results[i] > maxValue) {
				maxValue = results[i];			}
		}
		System.out.println(maxValue);
	}
}
