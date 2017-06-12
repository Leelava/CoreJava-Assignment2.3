package Session2Assignment3;

public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//To print pyramid 
		int rows,columns,k,space;
		for (rows=1; rows<=3; rows++)
		{

			for(space=1; space<=3-rows; ++space)
			{
				System.out.print(" ");
			}
			k=0;
			char s = 'a';
			while(k != 2*rows-1)
			{
				System.out.print(s);
				k++;
				if(k<=rows-1){
					s= (char) (s +1);
					//System.out.println("while-if");
				}
				else s=(char)(s-1);

				//System.out.println("while-else");
				// System.out.print(s);

			}
			System.out.print(s);
			System.out.println();

		}
//To print the mirror image of the pyramid
		for (rows=2; rows>=1; rows--)
		{
			for (space=1; space<=3-rows; space++)
			{
				System.out.print(" ");
			}
			char s = 'a'; k=0;
	
			while(k != 2*rows-1)
			{
				System.out.print(s);
				k++;
				if(k<=rows-1){
					s= (char) (s+1);

				}
				else s=(char)(s-1);

			}
			System.out.print(s);
			System.out.println(" ");

		}


	}
}


