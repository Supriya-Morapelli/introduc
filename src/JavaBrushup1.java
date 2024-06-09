
public class JavaBrushup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//DATATYPES
		int MyNum=52118399;
		String Name="Supriya Reddy";
		char letter='M';
		double Dec=	78.9;
		System.out.println(Name+" "+letter+" "+MyNum+" "+Dec);
		
	//ARRAYS
		
		int[] arr=new int[5];    //new is operator create memory for values that going to store in this variable
       arr[1]=5;
        arr[3]=10;
        System.out.println(arr[3]);
        
      int[] arry= {1,2,3,5,5,87,45,765,};
       System.out.println(arry[2]);
       
     //for loop
		
       for(int i=0;i<arr.length;i++)
       {
    	   System.out.println(arr[i]);
       }
       
       for(int i=0;i<arry.length;i++) 
       {
    	   System.out.println(arry[i]);
       }
       
      //String ARRAY
       
       String[] array= {"Suppu","reddy"};
       for(int i=0;i<array.length;i++) {
    	   System.out.println(array[i]);
       }
       
       //Enhanced For Loop
       
       String[] animals= {"Lion","Tiger","Elephant"};
       
       for(String n:animals) {
    	   System.out.println(n);
       }
       
	}

}
