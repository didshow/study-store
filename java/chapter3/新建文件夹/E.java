enum Season{
	����,�ļ�,�＾,����
	}
	public class E{
		public static void main(String args[]){
			int x= 96,y=1;
			Season season=Season.����;
			String str =new String("Java����");
			switch(x+y){
				case 1:
					System.out.println("x+y");
					break;
				case 'a':
					System.out.println("x+y");
				case10:
					System.out.println("x+y");
					break;
				default:System.out.println("û�а����"+(x+y));
			}
			switch(season){
				case ����:	
					System.out.println("¡������");
				case ����:
					System.out.println("������������");
				case �＾:
					System.out.println("�����ջ��ʵ");
				break;
				case �ļ�:
					System.out.println("������");
			}
			switch(str){
				case "Java����":
					System.out.println("ѧϰJavaԤ��");
				case "CԤ��":
					System.out.println("���ѧϰ��c����");
					break;
			}
	}
}