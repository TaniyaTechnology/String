
public class UniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="husky";
		boolean flag=false;
		for(int i=0; i<s1.length()-1; i++)
		{
			for(int j=i+1; j<s1.length(); j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					System.out.println("All Characters are not unique");
					flag=true;
				}
				
			}
		}
			if(flag==false)
			{
				System.out.println("All characters are unique");
			}
	}

}
