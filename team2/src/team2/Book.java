package team2;

import java.util.Date;
	
	public class Book implements order, Cart {

	String title;
	String author;
	int price;
	String publisher;
	Date BookDate;
	String[] category = {"C1", "C2", "C3", "C4", "C5", "C6"};
}