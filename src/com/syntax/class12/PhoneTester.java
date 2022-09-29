package com.syntax.class12;

public class PhoneTester {

	public static void main(String[] args) {
	/*
	 * if class who's object we are creating is present 
	 * inside the same package we do not need to import it
	 */
		
		
		Phone iphone=new Phone();//has to be same name as other class
        iphone.make="Apple";
        iphone.model="Iphone 14 Pro Max";
        iphone.year=2022;
        iphone.storage=128;
        iphone.makeCall();
        
        Phone samsungPhone=new Phone();
        samsungPhone.model="S22 Ultra";
        samsungPhone.make="Samsung";
        samsungPhone.year=2022;
        samsungPhone.makeCall();
        
        
        
	}

}
