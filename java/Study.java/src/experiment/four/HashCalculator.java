package experiment.four;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class HashCalculator {
		private String inputMsg;
		public HashCalculator(String s) {
			inputMsg=s;
		}
		public String caculateHash() {
	        try {
	            byte[] bytes = inputMsg.getBytes();
	            MessageDigest md = MessageDigest.getInstance("SHA-256"); 
	            md.reset();
	            byte[] hash = md.digest(bytes);
	            if (hash.length != 32) {
	                System.out.println("����hashֵʧ��");
	                return null;
	            }
	            BigInteger bInt=new BigInteger(hash);
	            return bInt.toString(16);
	        } catch (NoSuchAlgorithmException e) {
	        	e.printStackTrace();
	        }
	        return null;
		}
		public static void main(String[] args) {
			Scanner cmd=new Scanner(System.in);
			System.out.println("����������ַ�����");
			String msg=cmd.nextLine();
			HashCalculator hashC=new HashCalculator(msg);
			System.out.println("SHA-256��ϣ��������");
			System.out.println(hashC.caculateHash());
	}
}
