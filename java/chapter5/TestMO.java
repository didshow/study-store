class SuperShow{
	public String str = "SuperStr";
	public void show(){
		System.out.println("Super.show:"+str);
	}
}
class ExtendShow extends SuperShow{
	public String str = "ExtendStr";
	public void show(){
		System.out.println("Extend.show:"+str);
	}
}
public class TestMO{
	public static void main(String[] args){
		ExtendShow ext=new ExtendShow();
		SuperShow sup=ext;
		sup.show();
		ext.show();
		System.out.println("sup.str = "+sup.str);
		System.out.println("ext.str ="+ext.str);
	}
}