
public class ConsonantsVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Taniya@#Garg";
		String s2="";
		int vcount=0;
		int ccount=0;
		int scount=0;
	
		for(int i=0; i<s1.length(); i++)
		{
			if(s1.charAt(i)>='A' && s1.charAt(i)<='Z')
			{
			s2=s2+(char)(s1.charAt(i)+32);
			}
			else
			{
				s2=s2+s1.charAt(i);
			}

		}
		for(int i=0; i<s2.length(); i++)
		{
			if(s2.charAt(i)=='a'|| s2.charAt(i)=='e'||s2.charAt(i)=='i'|| s2.charAt(i)=='o'|| s2.charAt(i)=='u')
			{
				vcount++;
			}
			else if(s2.charAt(i)>='a' && s2.charAt(i)<='z')
			{
				ccount++;
			}
			else 
			{
				scount++;
			}
		}
			System.out.println("Number of vowels are:" +vcount );
			System.out.println("Number of consonants are:" +ccount );
			System.out.println("Number of Special characters are:" +scount );
	
		
	}

}
