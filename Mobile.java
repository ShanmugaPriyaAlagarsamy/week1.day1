package week1.day1;

public class Mobile {

	String mobileBrand = "Samsung";
	int mobileCost = 25000;
	float mobileWeight = 2.5f;
	boolean isFullyCharged = true;
	String mobileColor = "Black";

	public void makeCall()
	{
		mobileColor = "Red";
		System.out.println("Call is Made to the dialed number");
		System.out.println(mobileColor);

	}

	public void sendMessage()
	{
		System.out.println("Message Sent!!");
		System.out.println(mobileColor);

	}


	public static void main(String args[])

	{

		System.out.println("Mobile is Activated");

		Mobile myMobile = new Mobile();

		System.out.println("My mobile Brand is " + myMobile.mobileBrand);
		System.out.println("My mobile cost is " + myMobile.mobileCost);
		System.out.println("My mobile weight is " + myMobile.mobileBrand);
		System.out.println("My mobile is charged? " + myMobile.mobileBrand);
		System.out.println("My mobile color is " + myMobile.mobileColor);

		myMobile.makeCall();
		myMobile.sendMessage();
		
		System.out.println("My mobile Brand is " + myMobile.mobileBrand);
		System.out.println("My mobile cost is " + myMobile.mobileCost);
		System.out.println("My mobile weight is " + myMobile.mobileBrand);
		System.out.println("My mobile is charged? " + myMobile.mobileBrand);
		System.out.println("My mobile color is " + myMobile.mobileColor);

	}

}
