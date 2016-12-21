
public class Point {
	public static void main(String[]args){
		Point p = new Point();
		System.out.println("该点的坐标为:x:"+ p.x +" y:"+ p.y );
	}
	double x;
	double y;
	public Point(){
		x = Math.random();
		y = Math.random();
	}
}
