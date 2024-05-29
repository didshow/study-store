package package01;

public class RecursionTest {
	public static void main(String[]args) {
		int sum = 0;
		for(int i = 0;i <= 60;i++) {
			sum += i;
		}
		System.out.println(sum);
		RecursionTest test = new RecursionTest();
		int sum1 = test.getSum(60);
		System.out.println(sum1);
		int result = test.getResult(30);
		System.out.println(result);
		}

public int getSum(int n) {
	if(n == 1) {
		return 1;
	}else{
		return n+getSum(n-1);
		}
	}
public int getResult(int m) {
	if(m == 0) {
		return 1;
	}else if(m == 1) {
		return 4;
	}else {
		return 2*getResult(m-1)-getResult(m-2);
	}
	}
}