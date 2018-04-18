import java.util.Scanner;
import java.util.Random;
public class Twix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
Scanner scan = new Scanner (System.in);

int score = 0;

boolean isGameRunning = true;
while(isGameRunning==true){
System.out.println("Do you want to roll?  1 = yes 2 = No");
if(scan.nextInt()==1){
	int numberGenerated = random.nextInt(6-1+1)+1;
	if(numberGenerated!=1){
	score = score + numberGenerated;
	System.out.println("New score is" + score);
}else{
	System.out.println("You lose");
}
	}else{
System.out.println(score);

}
}
}
}