package codingDay.code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class binaryFuckery {
	
	public static int oneCounter(int n) {
		int maxExp = (int) Math.floor((Math.log10(n)) / (Math.log10(2)));
	//	System.out.println(maxExp);
		int count = 0;
		for(int i = maxExp; i >= 0; i--) {
			if(n >= Math.pow(2, i)) {
	//			System.out.println("n: " + n);
				count ++;
				n -=  Math.pow(2, i);
			}
		}
		return count;
	}
	
	public static int loopyBoiz(int hi, int lo, int x) {
		int numKs = 0;
		for(int i = hi; i<= lo; i++) {
			int k = 0;
			int count = i;
			while(count > 1) {
				count = oneCounter(count);
				k++;
			}
			if(k == x){
				numKs ++;
			}
			}
		return numKs;
	}

	 public static void main(String[] args) throws NumberFormatException, IOException{
		 String input; 
		 StringTokenizer idata;
		 
		//Enter data using BufferReader 
	    BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in)); 
	    
	    // (input =  reader.readLine()) != null
	    while(true) {
	    	 input =  reader.readLine();
	    	 if(input.equals("0 0 0")) {
	    		 break;
	    	 }
			 idata = new StringTokenizer(input);
			 int hi = Integer.parseInt(idata.nextToken());
			 int lo = Integer.parseInt(idata.nextToken());
			 int x = Integer.parseInt(idata.nextToken());
			

			 System.out.println(loopyBoiz(hi, lo, x));
		}
			 
	 }
	
	
	
}
