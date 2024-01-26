package btvn_day7;
import java.util.Scanner;

import java.util.ArrayList;

public class Employee1 {
	public int id;
	public String name;
	ArrayList<Employee1> ls = new ArrayList<>();
	
	public Employee1() {
	}
	
	public Employee1(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input employee ID: " );
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Please input employee name: " );
		name = sc.nextLine();
	} 
	
	public void addtoList() {
		
		int key;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap so luong nhan vien can nhap: ");
		key = sc.nextInt();
		sc.nextLine();
		
		do {
			input();
			ls.add(new Employee1(id, name));
		} while (ls.size() < key);
	}
	
	public void outputList() {
		for(Employee1 e : ls) {
			System.out.println("Employee #"+ (ls.indexOf(e)+1)+ " : ID "+e.id+" - Name: "+e.name);
		}
	}
}
