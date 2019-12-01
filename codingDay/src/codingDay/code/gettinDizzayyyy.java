package codingDay.code;

public class gettinDizzayyyy {
	
	
	public static void main(String args[]) {
		int[][]fd1 = {
				{2, 1},
				{3, 1},
				{5, 2}
		};
		findMax(3, 1, 2, fd1);
	}
	
	public static void findMax(int n, int k, int l, int[][] fd) {
		Node[] nodes = new Node[2^n];
		nodes[0] = new Node(0, 0, 0, 'x');
		
		for(int i = 1; i < nodes.length; i ++) {
			
			if(nodes[(i-1)/2].getUpDizzyFactor)
			
			
//			nodes[i] = new Node(i, nodes[(i-1)/2].getFunFactor() + fd[i][0], nodes[(i-1)/2].getUpDizzyFactor() + fd[1][i], 'c');
//			nodes[i+1] = new Node(i, nodes[(i)/2].getFunFactor() + fd[i+1][0], nodes[(i+1)/2].getUpDizzyFactor() + fd[1][i+1], '0');
//			if(nodes[i].getUpDizzyFactor() > l) {
//				nodes[i].funFactor = Integer.MIN_VALUE;
//			}
//			if(nodes[i+1].getUpDizzyFactor() > l) {
//				nodes[i+1].funFactor = Integer.MIN_VALUE;
//			}
		}
		
		for(int i = 0; i< nodes.length; i++) {
			System.out.println(nodes[i].getSection());
		}
		
		int maxFun = 0;
		for(int i = nodes.length / 2; i < nodes.length; i++) {
			if(nodes[i].getFunFactor() > maxFun) {
				maxFun = nodes[i].getFunFactor();
			}
		}
		
		System.out.println(maxFun);
	}
	
	
	public static class Node{
		private int section;
		private int funFactor;
		private int upDizzyFactor;
		private char eyes;
		
		public int getSection() {
			return section;
		}

		public int getFunFactor() {
			return funFactor;
		}

		public int getUpDizzyFactor() {
			return upDizzyFactor;
		}
		
		private Node(int arrLocation, int fi, int udi, char eyes){
			section = (arrLocation - 1) / 2;
			funFactor = fi;
			upDizzyFactor = udi;
			this.eyes = eyes;
			
		}
	
	}
	
	private class Section {
		
		private int number;
		private int funFactor;
		private int upDizzyFactor;
		private int downDizzyFactor;
		public int getDownDizzyFactor() {
			return downDizzyFactor;
		}

		public int getTolerance() {
			return tolerance;
		}
		
		public int getNumber() {
			return number;
		}

		private int tolerance;

		public int getFunFactor() {
			return funFactor;
		}

		public int getUpDizzyFactor() {
			return upDizzyFactor;
		}
		
		private Section(int n, int f, int d, int k, int l) {
			this.number = n;
			this.funFactor = f;
			this.upDizzyFactor = d;
			this.downDizzyFactor = k;
			this.tolerance = l;
		}
	}
	
	
	public static void findFun(int n, int[][]fd) {
		Node[][] results = new Node[n+1][n+1];
		for(int i = 0; i < n1; i++) {
			results[i][0] = new Node() 
			results[0][i] =
		}
	}

}
