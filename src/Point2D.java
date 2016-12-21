import java.util.*;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class Point2D {
	public static void main(String[] args){
		int number = getNumber();
		Point [] PArr = new Point[number];
		for(int i = 0;i<number;i++){
			PArr[i] = new Point();
		}
		double [] dArr = new double[number*(number-1)/2];
		ArrayList<Double> dList = new ArrayList<Double>();
		for(int i = 0;i< number-1;i++){
			for(int k = i+1;k<number;k++)
			dList.add(getDistance(PArr[i],PArr[k]));
		}
		for(int i = 0;i< dArr.length;i++){
			dArr[i] = dList.get(i);
		}
		System.out.println(getMin(dArr));
		for(int i = 0;i< dArr.length;i++){
			System.out.println(dArr[i]); 
		}
	}
	public static int getNumber(){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入需要生成的点的数量：");
		int number = sc.nextInt();
		return number;
	}
	public static double getDistance(Point a,Point b){
		return Math.sqrt((a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y));
	}
	public static double getMin(double[] d){
		double i = 2;
		for(int k = 0;k <d.length;k++){
			if( i> d[k]){
				i = d[k];
			}
		}
		return i;
	}

}
