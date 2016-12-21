import java.util.*;
public class CommonDivisor {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数字：");
		int number1 = sc.nextInt();
		System.out.println("请输入第二个数字：");
		int number2 = sc.nextInt();
		System.out.println(getCommonDivisor(number1,number2));
	}
	public static int getCommonDivisor(int number1,int number2){
		if(number1 < number2){
			int temp = number2;
			number2 = number1;
			number1 = temp;
		}
		while(number1 % number2 != 0){
			int temp = number1 % number2;
			number1 = number2;
			number2 = temp;
		}
		return number2;
	}

}
