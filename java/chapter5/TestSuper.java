class That{
	protected String nm(){
		return "That";
	}
}
class More extends That{
	protected String nm(){
		return "More";
	}
	protected void printNM(){
		That sref =(That)this;
		System.out.println("this.nm()="+this.nm());
		System.out.println("sref.nm()="+sref.nm());
		System.out.println("super.nm()="+super.nm());
	}
	public static void main(String[] args){
		More more = new More();
		more.printNM();
	}
}