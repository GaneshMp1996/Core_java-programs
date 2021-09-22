package MultilevelInheritence;

public class MultilevelInheritence {
	public static void main(String args[]) {
		Mathematics maths=new Mathematics();
		maths.length(20);
		
		Geometry geometry= new Geometry();
		geometry.length(30);
		geometry.perimeter(10,20);
		
		Square square=new Square();
		square.equalSides();
		square.length(40);
		square.perimeter(40, 30);
		
}
}
