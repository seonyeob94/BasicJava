package kr.or.ddit.homework09;

import java.util.Scanner;

public class HomeWork09 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork09 obj = new HomeWork09();
		obj.process();

	}

	public void process() {
		//8번 과제를 클래스로 변경해서 수행할것
//	        { {90, 80, 70, 0, 0, 2}, 
//			  {84, 72, 65, 0, 0, 4},	
//			  {87, 99, 42, 0, 0, 3},	
//			  {77, 61, 81, 0, 0, 5},	
//			  {80, 77, 92, 0, 0, 1}};
		Student[] stuList= new Student[5];
		
		Student s1= new Student();
		s1.name="갑";
		s1.kor=90;
		s1.eng=80;
		s1.math=70;
		s1.rank=1;


		
		Student s2= new Student();
		s2.name="을";
		s2.kor=84;
		s2.eng=72;
		s2.math=65;
		s2.rank=1;
	
		Student s3= new Student();
		s3.name="병";
		s3.kor=87;
		s3.eng=99;
		s3.math=42;
		s3.rank=1;
		
		Student s4= new Student();
		s4.name="정";
		s4.kor=77;
		s4.eng=61;
		s4.math=81;
//		s4.sum=0;
//		s4.avg=0;
		s4.rank=1;
		
		Student s5= new Student();
		s5.name="무";
		s5.kor=80;
		s5.eng=77;
		s5.math=92;
//		s5.sum=0;
//		s5.avg=0;
		s5.rank=1;
		
		stuList[0] = s1;
		stuList[1] = s2;
		stuList[2] = s3;
		stuList[3] = s4;
		stuList[4] = s5;


		
		
		
		//총합, 평균 구하기
		
//		for(int i=0; i<stuList.length;i++) {
//		    student stu = stuList[i];
//			stuList[i].sum =stuList[i].kor+stuList[i].eng+stuList[i].math;
//			stuList[i].avg =(stuList[i].sum)/3;
//		}
		
		for(Student stu : stuList) {
			stu.sum = stu.kor+stu.eng+stu.math;
			stu.avg = stu.sum/3;
		}
		
		// 등수 구하기
		
		for(int i=0;i<stuList.length;i++) {
			for(int j=0;j<stuList.length;j++) {
				if(stuList[i].sum<stuList[j].sum) {
					stuList[i].rank++;
				}
			}
		}
		
		// 등수 정렬
		
		for(int i=0;i<stuList.length-1;i++) {
			
			for(int j=0;j<stuList.length-1;j++) {
				if(stuList[j].rank>stuList[j+1].rank) {
					Student[] temp= new Student[5];
					temp[j]=stuList[j];
					stuList[j]=stuList[j+1];
					stuList[j+1]=temp[j];
					
					
				}
			}
			
		}
		
		// 호출하기
		for(int i=0;i<stuList.length;i++) {
			System.out.println(stuList[i]);
		}

		
	}
}

class Student{
	// 국영수 총점 평균 등수 이름
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	int avg;
	int rank;
	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", avg="
				+ avg + ", rank=" + rank + "]";
	}
	
}
