class Nurse{
	public  static void assist(String patientname)
	{
		System.out.println("helps to the doctor");
	}	
}
class Doctor{
	public static void treatment(String patientname,int age)
	{
		System.out.println("helps in treating the patient");
		Nurse.assist(patientname);
	}
}
class Hospital{
	public static void checkup(String patientname,int age,double mobile,String sickness,String email)
	{
		System.out.println("Hospital keeps treating patient");
		System.out.println("patientname :"+patientname);
		System.out.println("age :"+age);
		System.out.println("mobile :"+mobile);
		System.out.println("sickness :"+sickness);
		System.out.println("email :"+email);
		Doctor.treatment(patientname,age);
	}
}
class HospitalRunner{
	public static void main (String[] args)
	{
		System.out.println("unhealthy patient");
		String patientname="poorvi";
		int age=21;
		double mobile=87622;
		String sickness="fever";
		String email="Poorvivh23gmail.com";
		Hospital.checkup(patientname,age,mobile,sickness,email);
	}
}