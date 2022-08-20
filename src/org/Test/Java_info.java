package org.Test;

public class Java_info {
	
	public void empName() {
		System.out.println("EmpName: Rekha Naidu");
	}

	private void empAge() {
		System.out.println("EmpAge:25");
	}
	public void empLocation() {
		System.out.println("EmpLocation: Mumbai");
	}
	public void empregNo() {
		System.out.println("EmpregNo: 45612");
	}
	
	public static void main(String[] args) {
		
		Java_info j = new Java_info();
		j.empName();
		j.empAge();
		j.empLocation();
		j.empregNo();
		
	}
}
