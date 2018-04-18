import java.util.Scanner;

public class Glass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]nums = new int [3];
	Scanner scan = new Scanner (System.in);	
	
	for(int i = 0; i<nums.length; i ++){
	nums[i] = scan.nextInt();
	
	}
	for(int i = 0; i < nums.length; i ++){
		System.out.println(nums[i]*5);
	}
		
		
		
		
		
	}

}
