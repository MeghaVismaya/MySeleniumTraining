package training.selenium.javasamples;

public class StringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String str="1234";
 char[] ch=str.toCharArray();
 int num=0;
 for(int i=0;i<ch.length;i++)
 {
	 num=num*10+(ch[i]-'0');
 }
 System.out.println(num);
	}

}
