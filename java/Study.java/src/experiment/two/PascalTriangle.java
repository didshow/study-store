package experiment.two;

public class PascalTriangle {
	
	public static void main(String[] args) {
	    //��ά����洢��������ε�����
	    int[][] arr = new int[8][8];
	    for (int x = 0; x < arr.length; x++) {
	        arr[x][0] = 1; //ÿһ�еĵ�һ������Ϊ1
	        arr[x][x] = 1;  //ÿһ�е����һ������Ϊ1
	    }
	    //��ֵ
	    for (int x = 2; x < arr.length; x++) {
	        for (int y = 1; y < x; y++) {
	            arr[x][y] = arr[x - 1][y - 1] + arr[x - 1][y];
	        }
	    }
	    //��ӡ
	    for (int x = 0; x < arr.length; x++) {
	        for (int y = 0; y < 2 * (arr.length - x) - 1; y++) {
	            System.out.print(" ");
	        }
	        for (int z = 0; z <= x; z++) {
	            System.out.print(arr[x][z] + "   ");
	        }
	        System.out.println();
	    }

	}
}
