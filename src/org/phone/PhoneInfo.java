package org.phone;

import javax.print.DocFlavor.STRING;

public class PhoneInfo {

	private void phoneName() {
				System.out.println("Honor 9 Lite");
	}
	private void phoneMieiNum() {
			System.out.println("hono002563857");

	}
	
	private void camera() {
		  System.out.println("Front camera 10 MP;  Back Camerqa: 25 MP ");
	}
private void storage() {	
System.out.println("Internal memory=16 GB; External memory: upto 64 GB");

}
private void osName() {	
System.out.println("OS: Android");
}

	public static void main(String[]args) {
   PhoneInfo cd = new PhoneInfo();
   cd.phoneName(); cd.phoneMieiNum(); cd.camera();cd.osName();cd.storage(); 
	}
}