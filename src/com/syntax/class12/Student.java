package com.syntax.class12;

public class Student {

	String name;
	String id;
	int age;
	double weight;
	char gender;
	
	void study() {
		System.out.println("Student is studying");
	}
	void deleteMessages() {
		System.out.println("Deleting message from Discord");
	}
	void eat() {
		System.out.println("Eating pizzaaaaaaa");
	}
	public static void main(String[] args) {
		//new Student()-> Creates the object of student class
		Student SufyanObject=new Student();
		SufyanObject.name="Friadoon";
		SufyanObject.id="123";
		SufyanObject.age=22;
		
		System.out.println(SufyanObject.name);
		System.out.println(SufyanObject.age);
		SufyanObject.deleteMessages();
		SufyanObject.deleteMessages();
		
		Student student2=new Student();
		student2.name="Asma";
		student2.age=16;
		student2.weight=30;
		student2.gender='F';
		System.out.println(student2.name);
		student2.eat();
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			
	}
}
