package web.util;

public class MyException extends Exception {
	public MyException(String message) {
		super(message);
		System.out.println("에러 발생 : " + message);
	}
}
