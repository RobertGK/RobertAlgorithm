import java.util.*;
public class ArrayExecise {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		printArray(number);
	}
	public static void printArray(int number){
		boolean [][] booArr= new boolean [number][number];
		for (int i =0;i < number;i++){
			for(int k = 0;k< number;k++){
				if(CommonDivisor.getCommonDivisor(i+1, k+1) == 1){
					booArr [i][k] = true;
				}
				else
					booArr [i][k] = false;
			}
		}
		for (int i = 0;i< number; i++){
			for(int k = 0;k<number;k++){
				System.out.print(booArr[i][k] + " ");
			}
			System.out.println(" ");
		}
	}

}
