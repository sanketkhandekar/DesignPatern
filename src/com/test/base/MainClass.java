package com.test.base;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainClass implements Test {
	
	private String name;
	private boolean pass;

	public static void main(String[] args) {

		MainClass ma = new MainClass();
	System.out.println(ma.name);
	System.out.println(ma.pass);
	List<Integer> list = new ArrayList<>();
	
	list.add(21);
	list.add(13);
	list.add(30);
	list.add(11);
	
	list.removeIf(e->e%2==0);
	
	System.out.println(list);
	
	
	char c ='A';
	
	System.out.println(" value" +calc(c));
	
	

		try {
			ma.test(10, 0);
		} catch (IndexOutOfBoundsException ae) {

			System.out.println("Inside Main ae " + ae.getStackTrace());
		}

		catch (NullPointerException re) {

			System.out.println("Inside Main re " + re.getStackTrace());
		}

		 catch (IOException e) {

			System.out.println("Inside Main ");
		}
	}

	private static int calc(int c) {
		// TODO Auto-generated method stub
		return 1;
	}

	public void test(int a, int b) throws IOException {
		try {
			final int ans = a / b;

			System.out.println("ans is " + ans);
		}
		finally{
			System.out.println("here ");
		}
		/*catch (RuntimeException runtimeException) {

			throw new ArithmeticException(" No " + a + "b " + b + " has issue");
		}

		catch (Exception e) {
			System.out.println("Exception ");
			throw new IOException("Some issue");
		}*/

	}

	@Override
	public void demoRunTimeException() throws RuntimeException {
		// TODO Auto-generated method stub

	}

	@Override
	public void demoCheckedException() throws IOException {
		// TODO Auto-generated method stub

	}

}
