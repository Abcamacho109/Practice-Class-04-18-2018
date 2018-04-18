import java.util.Random;

public class Green {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Random Random = new Random ();
		int[]numlist = new int [50];
		
		for(int i = 0; i<numlist.length; i ++){
			int numGenerated = Random.nextInt(62-25+1)+25;
			numlist[i] = numGenerated;
			System.out.println(numlist[i]);
			
		}
	
		
		
	}

}
