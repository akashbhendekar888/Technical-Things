package Array;                        //Array - Collection of similar datatype elements.store a multiple values in a single variable

public class TestArray {                       

	public static void main(String[] args) {
		// TODO Auto-generated method stub //Single dimentional array
		System.out.println("Single dimentional array::");
	int empid[]= {323,324,325,326,327};    //declaration /instantiation/initialization
	for(int i:empid) {                       // print the array using for each loop
		System.out.println(i);
	}
	
	     System.out.println("Multidimentional array::");
		int matrix [][]= {{1,2,3},{4,5,6}};   // Multidimention array-is an arrays of array
		int x=matrix[1][2];
		System.out.println("elements of Array::"+x);
		
		for(int i=0;i<matrix.length;i++) {    // print the array using nested for loop
			 for(int j=0;j<3;j++) {
				 System.out.print(matrix[i][j]);
			 }
			 System.out.println(" ");
			 }
		System.out.println("Jagged Array::");          //jagged array
      int arr[][]= {{2,5,3,4},{2,3,5},{3,2},{5,5,8,6}};
      for(int i=0;i<arr.length;i++) {
    	  for(int j=0;j<arr[i].length;j++) {
    		  System.out.print(arr[i][j]);
    	  }
    	  System.out.println();
      }
	}

	}
