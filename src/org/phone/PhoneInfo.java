package org.phone;

public class PhoneInfo {

	private void PhoneName()
	{
		System.out.println("Phonename:OneplusNord2");

	}
	
	private void PhoneMieiNum()
	{
		System.out.println("PhoneMieiNum:1X21456YZ");
	}
	
	private void Camera()
	{
		System.out.println("Camera:50MB &150 MB");
	}
	
	private void strorage()
	{
		System.out.println("600GB");
	}
	
	private void OS()
	{
		System.out.println("Andriod");
	}
	
	public static void main(String[] args) {
		PhoneInfo P = new PhoneInfo();
		P.PhoneName();
		P.PhoneMieiNum();
		P.strorage();
		P.Camera();
		P.OS();
		
				
	
		
	}
}

