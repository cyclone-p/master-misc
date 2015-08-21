class MyIndexOf {
	
	public static void main (String args[]) {
		
		int [] ioArray = {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
		
		MyIndexOf myio = new MyIndexOf();
		
		System.out.println("Index Of " + args[0] + " : " + myio.indexOf(ioArray, Integer.parseInt(args[0])));
	}

	public int indexOf (int [] a, int b) {
		
		int start = 0;
		int end = a.length - 1;
		
		int foundIndex = this.binSearch(a, start, end, b);
		
		if (foundIndex != -1) {
			int runIndex = foundIndex - 1;
			while (!(runIndex < start) && (a[runIndex] == b)) {
				foundIndex = runIndex;
				runIndex--;
			}
		}
		
		return foundIndex;
	}

	public int binSearch(int [] a, int s, int e, int b) {
		
		int start = s;
		int end = e;

		if (!(start < 0) && !(end > a.length - 1) && !(start > end)) {

			int mid = (start + end) / 2;
			
			if (a[mid] == b)
				return mid;
			else if (a[mid] > b)
				return binSearch (a, s, mid - 1, b);
			else
				return binSearch (a, mid + 1, e, b);

		}

		return -1;

	}

}