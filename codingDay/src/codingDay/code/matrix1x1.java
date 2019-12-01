package codingDay.code;

import java.util.ArrayList;
import java.util.Scanner;

public class matrix1x1 {
	
	public static void main(String args[]) {
		
//		Integer[][] matrix1 = { 
//				{0, 1, 0, 1, 1},
//				{1, 1, 1, 1, 1},
//				{0, 1, 1, 1, 0},
//				{1, 1, 1, 1, 1}
//		};
//		
//		findMatrix2(4, 5, matrix1);
		
		ArrayList<Integer[][]> matrices = new ArrayList<Integer[][]>();
		
		Scanner s = new Scanner(System.in);
		while(s.hasNext()) {
			int height = s.nextInt();
			int width = s.nextInt();
			if(height == 0 && width == 0) {
				break;
			}
	//		System.out.println(" height: " + height + " width: "+ width);
			Integer[][] matrix = new Integer[height][width];
			for(int i = 0; i < height; i++) {
				for(int j = 0; j < width; j++) {
					matrix[i][j] = s.nextInt();
				}
			}
		//	findMatrix(height, width, matrix);
			matrices.add(matrix);
		}
		
		for(int i = 0; i< matrices.size(); i++) {
	//		System.out.println(matrices.get(i)[0].length + " " + matrices.get(i).length);
			findMatrix(matrices.get(i).length, matrices.get(i)[0].length, matrices.get(i));
		}
		s.close();
	}

	
	public static void findMatrix(int height, int width, Integer[][] matrix) {
		
		int maxCount = 0;
		boolean shouldBreak = false;

		for(int i = 0; i< height; i++) {
			for(int j = 0; j< width; j++) {
				shouldBreak = false;
				int count = 0;
				int x = i;
				int y = j;

				if(matrix[i][j] == 1) {
					count = 1;

					while(x < height-1 && y < width-1) {
						for(int n = j; n < y+1; n++) {
							if(matrix[x+1][n] == 0) {
								shouldBreak = true;
							}
						}
						for(int m = i; m < x+1; m++) {
							if(matrix[m][y+1] == 0) {
								shouldBreak = true;
							}
						}
						if(!shouldBreak) {
							count++;
							x++;
							y++;
						}else {
							break;
						}
					}
					if(count > maxCount) {
						maxCount = count;
					}
				}
				
//				if(shouldBreak) {
//					break;
//				}
			}
//			if(shouldBreak) {
//				break;
//			}
		}
		System.out.println(maxCount);
	}
	
//	public static void findMatrix2(int height, int width, Integer[][] matrix) {
//	
//		int heightStartCount = 0;
//		int widthStartCount = 0;
//		int heightEndCount = width-1;
//		int widthEndCount = height-1;
//		boolean onesTracker = true;
//		while(heightStartCount < height && widthStartCount < width) {
//			for(int i = 0; i < heightStartCount; i++) {
//				if(matrix[0][i] == 0) {
//					onesTracker = false;
//					heightStartCount++;
//					break;
//				}
//			}
//			for(int i = 0; i < widthStartCount; i++) {
//				if(matrix[i][0] == 0) {
//					onesTracker = false;
//					widthStartCount++;
//					break;
//				}
//			}
//			
//			for(int i = width-1; i > widthEndCount; i--) {
//				if(matrix[widthEndCount][i] == 0) {
//					onesTracker = false;
//					widthEndCount--;
//					break;
//				}
//			}
//			for(int i = height-1; i > heightStartCount; i--) {
//				if(matrix[i][heightEndCount] == 0) {
//					onesTracker = false;
//					heightEndCount--;
//					break;
//				}
//			}
//			
//			System.out.println(heightStartCount);
//			System.out.println(heightEndCount);
//			System.out.println(widthStartCount);
//			System.out.println(widthEndCount);
//
//			
//			for(int i = widthStartCount; i<widthEndCount; i++) {
//				for(int j = heightStartCount; j <heightEndCount; j++) {
//					if(matrix[i][j] == 0) {
//						findMatrix2(widthEndCount-widthStartCount, heightEndCount-heightStartCount, matrix);
//					}else {
//						System.out.println(Math.min(widthEndCount-widthStartCount, heightEndCount-heightStartCount));
//					}
//				}
//			}
//		}
//		
//	}
	
}


