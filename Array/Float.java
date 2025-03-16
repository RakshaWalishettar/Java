class Float{
	public static void main(String[] args){
		float temperature=1.25f;
			System.out.println(temperature);
		float playerSpeed = 5.7f;
			System.out.println(playerSpeed);
		float exchangeRate = 1.23f;
			System.out.println(exchangeRate);
		float acceleration = 9.8f;
			System.out.println(acceleration);
			
		System.out.println("after re-assign");
		temperature=-1.25f;
			System.out.println(temperature);
		playerSpeed = 5.0f;
			System.out.println(playerSpeed);
		exchangeRate = 2.3f;
			System.out.println(exchangeRate);
		acceleration = 8.9f;
			System.out.println(acceleration);
	}
}