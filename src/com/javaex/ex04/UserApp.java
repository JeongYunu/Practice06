package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		User customer01 = new Customer("jws", "j1234", "정우성", 1000);
		User customer02 = new Customer("yjs", "y2345", "이효리", 2000);
		User employee = new Employee("master", "m7788", "운영자", 5000000);
		
		User[] userArray = new User[3];
		userArray[0] = customer01;
		userArray[1] = customer02;
		userArray[2] = employee;
		
		for(int i=0; i<userArray.length; i++) {
			userArray[i].showInfo();
		}
		
		//다운캐스팅
		System.out.println("운영자의 월급은 " + ((Employee) employee).getSalary() + "원 입니다.");
	}

}
