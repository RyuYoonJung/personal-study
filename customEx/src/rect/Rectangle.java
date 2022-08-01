package rect;

public class Rectangle {

	Point p1;
	Point p2;
	
	int width() {
		return abs(p1.x - p2.x); 
	}
	
	int abs(int x) {
		if(x < 0) {
			x = -x; 
		}else if(x > 0){
			x = x;
		}
		return x;
	}
	
	
	int abss(int x) {
		return x < 0 ? -x : x;
	}
	
	
}