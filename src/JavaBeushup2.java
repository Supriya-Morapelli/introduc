import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaBeushup2 {

	public static void main(String[] args) {
	//For loop along with if else
	//Multiple of 2
		int[] array= {1,5,7,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<array.length;i++)
		//for(int a:array)
		{
			if(array[i]%2==0)
			{
				System.out.println(array[i]);
				break;
			}
			else
			{
				System.out.println(array[i]+"is not multiple of 2");
			}
		}
	//ARRAY LISTS
		ArrayList<String> a=new ArrayList<String>();
		a.add("SUPPU");
		a.add("SUPRIYA");
		a.add("REDDY");
		
		System.out.println(a.get(2));
	//ITERATING OVER ARRAYLIST
		//for(int i=0;i<a.size();i++) 
		for(String s:a)
		{
			//System.out.println(a.get(i));
			System.out.println(s);
		}
		
	//items present in ArrayList
		System.out.println(a.contains("SUPPU"));
	//Converting Traditional Array into ARRAYLIST
		String[] names= {"Nani","Chinni"};
		List<String> ArrayListnames=Arrays.asList(names);
		System.out.println(ArrayListnames.contains("Chinni"));

	}

}
