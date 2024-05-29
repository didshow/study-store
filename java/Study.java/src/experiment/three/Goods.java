package experiment.three;

public class Goods {
	public static String GTYPE_PHONE="Phone";
	public static String GTYPE_COMPUTER="Computer";
	public static String GTYPE_CLOTHES="Clothes";
	public static String GTYPE_SHOE="Shoe";

	
	private int goodsNo;
	private String name;
	private String goodsType;
	private float price;
	private int num;
	private String brand;

	//给变量初始化，source-->Generrate a constructor using field
	public Goods(int goodsNo, String name, String goodsType, float price, int num, String brand) {
		super();
		this.goodsNo = goodsNo;
		this.name = name;
		this.goodsType = goodsType;
		this.price = price;
		this.num = num;
		this.brand = brand;
	}
	public String toString(){
	    return "商品["+goodsType+"] "+" "+brand+" "+name+"编号("+goodsNo+") "+"价格("+price+"元) "+"数量("+num+") ";
	}
	public static void main(String[] args)
	    {
	        String[] gnames={"MIX4","荣耀60","Thinkpad X1","卫衣","运动鞋"};
	String GTYPE_CLOTHES = null;
	String[] gtypes={GTYPE_PHONE,GTYPE_PHONE,GTYPE_COMPUTER,GTYPE_CLOTHES,GTYPE_SHOE};
	        float[] gprices={2699.0f, 2580.0f, 10420.0f, 168.0f, 248.0f};
	        int[] gnums={120, 1000, 50, 500, 300};
	String[] gbrands={"小米","荣耀","联想","李宁","鸿星尔克"};

	Goods[] goods=new Goods[gnames.length];
	for(int i=0; i<goods.length;i++){
	   goods[i]=new Goods(i, gnames[i], gtypes[i], gprices[i], gnums[i], gbrands[i]);
	}
	for(Goods g: goods){
	   System.out.println(g);
	}
	    }

}
