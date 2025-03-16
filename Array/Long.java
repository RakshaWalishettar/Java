class Long {
	public static void main(String[] args){
		long userId = 987654321012345678L;
			System.out.println(userId);
		long accountBalance = 50000000000L;
			System.out.println(accountBalance);
		long worldPopulation = 8000000000L;
			System.out.println(worldPopulation);
		long distanceToMars = 225000000000L;
			System.out.println(distanceToMars);
		long totalUsers = 3000000000L;
			System.out.println(totalUsers);
		
			
		System.out.println("after re-assign");
		userId = 98765432101234L;
			System.out.println(userId );
		accountBalance = 50000000000L;
			System.out.println(accountBalance);
		worldPopulation = 80000000L;
			System.out.println(worldPopulation);
		totalUsers = 8000000000L;
			System.out.println(totalUsers);
		distanceToMars = 285000000000L;
			System.out.println(distanceToMars);
	}
}