package kr.or.ddit.study06.sec02;

public class FieldType {
	
	byte a;
	short b;
	int c;
	long d;
	float e;
	double f;
	char g;
	boolean h;
	String i;
	int[] arr;
	
	public static void main(String[] args) {
		FieldType f1= new FieldType();
		
		System.out.println(f1.a);
		System.out.println(f1.b);
		System.out.println(f1.c);
		System.out.println(f1.d);
		System.out.println(f1.e);
		System.out.println(f1.f);
		System.out.println(f1.g); //' '
		System.out.println(f1.h);
		System.out.println(f1.i);
		System.out.println(f1.arr);
	}
}
