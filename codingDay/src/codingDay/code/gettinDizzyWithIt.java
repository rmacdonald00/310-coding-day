package codingDay.code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//import codingDay.code.gettinDizzayyyy.Node;

public class gettinDizzyWithIt {

	public static class Node{
		int funLevel;
		int dizzyLevel;
		
		public Node(int f, int d) {
			funLevel = f;
			dizzyLevel = d;
		}
	}
	
	public static int findMaxFun(int n, int k, int l, int[][]fd, Node current, int level) {
	//	System.out.println(Math.pow(2, n));
	//	int arrSize = n;
	//	System.out.println(arrSize);
		
		//baseCase
		//check dizzy levels, return fun levels
		if(level == n) {
			if(current.dizzyLevel < l) {
				if(current.dizzyLevel + fd[level-1][1] > l) {
					return fd[level-1][0];
				}else {
					return (fd[level-1][0] + current.funLevel);
				}
			}else {
				return Integer.MIN_VALUE;
			}
		}else {
			int max = Math.max(findMaxFun(n, k, l, fd, new Node(current.funLevel, Math.max(0, current.dizzyLevel - k)), level+1), findMaxFun(n, k, l, fd, new Node(fd[level][0] + current.funLevel, fd[level][1] + current.dizzyLevel), level+1) );
			System.out.println(max);
			return max;
		}
		//return 0;
		
		
		
//		Node[] nodes = new Node[n];
//		nodes[0] = new Node(0, 0);
		
//		for(int i = 1; i < nodes.length; i++) {
//		//	int sectionI = (int) Math.log(i);
//			Node prev = nodes[i-1];
//			if(prev.funLevel < 0) {
//				nodes[i] = new Node(-1, -1);
//			}
//			if(i%2 == 0) {
//				nodes[i] = new Node(prev.funLevel + fd[i][0], prev.dizzyLevel + fd[i][1]);
//			}else {
//				nodes[i] = new Node(prev.funLevel, Math.max(prev.dizzyLevel - k, 0));
//			}
//			if(nodes[i].dizzyLevel > l) {
//				nodes[i] = new Node(-1, -1);
//			}
//		}
//		
//		for(int i = 0; i < nodes.length; i++) {
//			System.out.println("f = " + nodes[i].funLevel + " d = " + nodes[i].dizzyLevel);
//		}
		
//		int maxFun = 0;
//	//	System.out.println(arrSize/2);
//		for(int i = arrSize/2; i < nodes.length; i++) {
//			if(nodes[i].funLevel > maxFun) {
//				maxFun = nodes[i].funLevel;
//			}
//		}
//		System.out.println(maxFun);
	}
	
//	public static void findMaxFun(int n, int k, int l, int[][]fd) {
//	//	System.out.println(Math.pow(2, n));
//		int arrSize = (int) Math.pow(2, n+1) - 1;
//	//	System.out.println(arrSize);
//		Node[] nodes = new Node[arrSize];
//		nodes[0] = new Node(0, 0);
//		
//		for(int i = 1; i < nodes.length; i++) {
//			int sectionI = (int) Math.log(i);
//			Node prev = nodes[(i-1)/2];
//			if(prev.funLevel < 0) {
//				nodes[i] = new Node(-1, -1);
//			}
//			if(i%2 == 0) {
//				nodes[i] = new Node(prev.funLevel + fd[sectionI][0], prev.dizzyLevel + fd[sectionI][1]);
//			}else {
//				nodes[i] = new Node(prev.funLevel, Math.max(prev.dizzyLevel - k, 0));
//			}
//			if(nodes[i].dizzyLevel > l) {
//				nodes[i] = new Node(-1, -1);
//			}
//		}
//		
////		for(int i = 0; i < nodes.length; i++) {
////			System.out.println("f = " + nodes[i].funLevel + " d = " + nodes[i].dizzyLevel);
////		}
//		
//		int maxFun = 0;
//	//	System.out.println(arrSize/2);
//		for(int i = arrSize/2; i < nodes.length; i++) {
//			if(nodes[i].funLevel > maxFun) {
//				maxFun = nodes[i].funLevel;
//			}
//		}
//		System.out.println(maxFun);
//	}
	
//	public static void main(String args[]) {
//		int[][]fd1 = {
//				{2, 1},
//				{3, 1},
//				{5, 2}
//		};
//		findMaxFun(3, 1, 2, fd1);
//		
//		int[][]fd2 = {
//				{20, 2},
//				{12, 4},
//				{3, 3},
//				{10, 6},
//				{20, 3},
//				{19, 9},
//				{19, 7},
//				{1, 500},
//				{15, 5},
//				{4, 2}
//		};
//		findMaxFun(10, 5, 1, fd2
//				);
// 		 }
	
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
			 int n = Integer.parseInt(idata.nextToken());
			 int k = Integer.parseInt(idata.nextToken());
			 int l = Integer.parseInt(idata.nextToken());
			
//			 if(n == 0 && k == 0 && l == 0) {
//				 break;
//			 }
			 
			 int[][] fd = new int[n][2];
			 
			 for(int i = 0; i < n; i++) {
				 //get next line
				 input =  reader.readLine();
				 idata = new StringTokenizer(input);

				 fd[i][0] = Integer.parseInt(idata.nextToken());
				 fd[i][1] = Integer.parseInt(idata.nextToken());

			 }
			// System.out.println("hello!");
			 
			 System.out.println(findMaxFun(n, k, l, fd, new Node(0,0), 0));
		}
			 
	 }
}
