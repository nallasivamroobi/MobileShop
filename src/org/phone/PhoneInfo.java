package org.phone;

import javax.print.DocFlavor.STRING;

public class PhoneInfo {

	private void phoneName() {
		// TODO Auto-generated method stub

		System.out.println("Honor 9 Lite");
	}
	private void phoneMieiNum() {
		// TODO Auto-generated method stub
		System.out.println("hono002563857");

	}
	
	private void camera() {
		// TODO Auto-generated .od stub
  System.out.println("Front camera 10 MP;  Back Camerqa: 25 MP ");
	}
private void storage() {
	// TODO Auto-generated method stub
System.out.println("Internal memory=16 GB; External memory: upto 64 GB");

}
private void osName() {
	// TODO Auto-generated method stub
System.out.println("OS: Android");
}

	public static void main(String[]args) {
   PhoneInfo cd = new PhoneInfo();
   cd.phoneName(); cd.phoneMieiNum(); cd.camera();cd.osName();cd.storage(); 
	}
}