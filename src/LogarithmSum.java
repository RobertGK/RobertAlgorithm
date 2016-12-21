import java.util.*;
public class LogarithmSum {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println(getLog(number));
		
	}
	public static double getLog(int number){
		if(number == 1){
			return 0;
		}
		else{
			return getLog(number -1) + Math.log(number);
		}
	}

}
