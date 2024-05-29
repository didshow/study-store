package Run;

public class Qangle {
	int a,h;
	Qangle(){
		a = 10;
		h = 20;
	}
	Qangle(int x,int y){
		a = x;
		h = y;
	}
	Qangle(Qangle r){
		a = r.width();
		h = r.height();
	}
	int width() {
		return a;
	}
	int height() {
		return h;
	}
}
