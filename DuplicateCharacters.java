
public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="dabmagbsmt";
		String s2="";
		
		for(int i=0; i<s1.length()-1; i++)
		{
			for(int j=i+1; j<s1.length(); j++)
			{
				if(s1.charAt(i) == s1.charAt(j))
				{
				   s2=s2+s1.charAt(i);
				}
				
			}
		}
		System.out.println(s2);
	}

}
