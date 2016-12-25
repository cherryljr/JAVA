public class BubbleSortandSelectSort {
	public static void main(String args[]) {
		int array[] = new int[args.length];
		
		for(int i = 0; i < args.length; i++) {
			array[i] = Integer.parseInt(args[i]);
		}
		
		Print(array);	
		SelectSort(array);
		Print(array);
	}
	
		private static void Print (int a[]) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	  }
	   
	  private static void BubbleSort (int a[]) {
	  	for(int i = 0; i < a.length-1; i++)
	  		for(int j = 0; j < a.length-i-1; j++) {
	  			int temp;
	  			if(a[j] > a[j+1]) {
	  				temp = a[j];
	  				a[j] = a[j+1];
	  				a[j+1] = temp;
	  			}
	  		}
	  }
	  
	  private static void SelectSort(int a[]) {
	  	int temp, k;
	  	
	  	for(int i = 0; i < a.length-1; i++) {
	  		k = i;
	  		for (int j = i+1; j < a.length; j++) {
	  			if (a[j] < a[k])
	  			k = j;
	  		}
	  		if (k != i) {
	  			temp = a[k];
	  			a[k] = a[i];
	  			a[i] = temp; 
	  		}
	  	}
	  }

	  	
}
	
