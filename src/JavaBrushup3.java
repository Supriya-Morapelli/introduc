
public class JavaBrushup3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String is a Object
		//string literal
		//String s="hi";
		
		
		//new
		String s2=new String("hlo");
		String s3=new String("welcome");
		
		//Split method
		String s1="Supriya Reddy Morapelli";
		String[] spilltedString=s1.split("Reddy");
		System.out.println(spilltedString[0]);
		System.out.println(spilltedString[1]);
		System.out.println(spilltedString[1].trim());
		
		//iterate through string
		for(int i=0;i<s1.length();i++)
		{
			System.out.println(s1.charAt(i));
		}
		
		for(int i=s1.length()-1;i>=0	;i--)
		{
			System.out.println(s1.charAt(i));
		}
		
}

}
