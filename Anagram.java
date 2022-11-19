import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Heart";
		String s2 = "";
		String s3 = "Earth";
		String s4 = "";
		
		for(int i=0; i<s1.length(); i++)
		{
			if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
			{
			s2=s2+(char)(s1.charAt(i)-32);
			}
			else
			{
				s2=s2+s1.charAt(i);
			}
		}
		for(int i=0; i<s3.length(); i++)
		{
			if(s3.charAt(i)>='a' && s3.charAt(i)<='z')
			{
			s4=s4+(char)(s3.charAt(i)-32);
			}
			else
			{
				s4=s4+s3.charAt(i);
			}
		}
		System.out.println(s2);
		System.out.println(s4);
		
		char[] ch1 = s2.toCharArray();
		char[] ch2 = s4.toCharArray();
		
		for(int i=0; i<ch1.length; i++)
		{
			for(int j=1; j<ch1.length; j++)
			{
				if(ch1[j-1]>ch1[j])
				{
					char temp=ch1[j];
					ch1[j]=ch1[j-1];
					ch1[j-1]=temp;
				}
			}
		}
		

		for(int i=0; i<ch2.length; i++)
		{
			for(int j=1; j<ch2.length; j++)
			{
				if(ch2[j]<ch2[j-1])
				{
					char temp=ch2[j];
					ch2[j]=ch2[j-1];
					ch2[j-1]=temp;
				}
			}
		}
		
		if(Arrays.equals(ch1,ch2))
		{
			System.out.println("It is a Anagram");
		}
		else
		{
			System.out.println("It is not a Anagram");
		}
		
		
	}

}
