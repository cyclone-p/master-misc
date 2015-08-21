class Life {
	
	boolean [][] grid;
	int rows;
	int cols;
	
	public static void main (String args[]) {
	
		int rowsIn = Integer.parseInt(args[0]);
		int colsIn = Integer.parseInt(args[1]);
		Life life = new Life (rowsIn, colsIn);
		
		for (int g = 0; g < 100; g++)
			life.nextGen();
	
	}
	
	public Life (int r, int c) {
	
		rows = r;
		cols = c;
		grid = new boolean[rows][cols];
	
	}
	
	private void netGen () {
		
		boolean [][] newgrid = new boolean [rows][cols];
		
		for (int i = 0; i < grid.length; i++) {
			
			for (int j = 0; j < grid[i].length ; j++) {
			
				int count = this.countNeighborsAlive(i, j);
				
				if ((count < 2) || (count > 3))
					newgrid [i][j] = false;
				if (count == 2)
					newgrid [i][j] = grid[i][j];
				if (count == 3)
					newgrid[i][j] = true;
					
			
			}
		}
		
		grid = newgrid;
		
	}
	
	private int countNeighborsAlive (int x, int y) {
		
		int count = 0;
		
		for (int k = x - 1; k <= x + 1; k++) {
			
			for (int m = y - 1; m <= y + 1; m++) {
				if (!((k < 0) || (m < 0)) && !((k > rows) || (m > cols)) && !((k == x)&&(m == y)) && (grid[k][m] == true))
					count++;
			}
		}
		
		return count;
	
	}
	
}