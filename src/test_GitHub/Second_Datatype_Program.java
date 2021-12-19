package test_GitHub;

public class Second_Datatype_Program {

	public static void main(String[] args) {
	
		String CarName1="Maruti Suzuki Swift";         //(1)Maruti Suzuki Swift Car
        short Engine1=1197;               //1197 cc
		int Length1=3845;                 //3845 mm
		int Width1=1735;                  //1735 mm
		int Height1=1530;                 //1530 mm
		byte Warranty_years1=2;           //2 years
		long Warranty_km1=40000;          //40000 km
		float Mileage1=23.2f;             //23.2 kmpl
		char Star1='2';                   //2 Star
		
		System.out.println("My First Car Name is "+CarName1);
		System.out.println("                                                                              ");		
		System.out.println("(1)Engine of Swift is "+Engine1);
		System.out.println("(2)Lengh of Swift is "+Length1);
		System.out.println("(3)Width of Swift is "+Width1);
		System.out.println("(4)Height of Swift is "+Height1);
		System.out.println("(5)Warranty year of Swift is "+Warranty_years1);
		System.out.println("(6)Warranth in kilometers of Swift is "+Warranty_km1);
		System.out.println("(7)Mileage of Swift is "+Mileage1);
		System.out.println("(8)Star Ratting in Market of Swift is "+Star1);
		
		        boolean ABS_Car1=true;          //ABS System...boolean.. Present or Not
				System.out.println(ABS_Car1);
				if(ABS_Car1)
				{
					System.out.println("(9)ABS System is present in Maruti Suzuki Swift car.");
				}
		System.out.println("_____________________________________________________________________________");		
		System.out.println("_____________________________________________________________________________");		
		String CarName2="Tata Tiago";          //(2)Tata Tiago Car
		System.out.println("                                                                             ");		
		short Engine2=1199;              //1199 cc
		int Length2=3765;                //3765 mm
		int Width2=1677;                 //1677 mm
		int Height2=1535;                //1535 mm
		byte Warranty_years2=2;          //2 years
		long Warranty_km2=75000;         //75000 km
		float Mileage2=19.8f;            //19.8 kmpl
		char Star2='4';                  //4 Star
		
		System.out.println("My Second Car Name is "+CarName2);
		System.out.println("(1)Engine of Tiago is "+Engine2);
		System.out.println("(2)Lengh of Tiago is "+Length2);
		System.out.println("(3)Width of Tiago is "+Width2);
		System.out.println("(4)Height of Tiago is "+Height2);
		System.out.println("(5)Warranty year of Tiago is "+Warranty_years2);
		System.out.println("(6)Warranth in kilometers of Tiago is "+Warranty_km2);
		System.out.println("(7)Mileage of Tiago is "+Mileage2);
		System.out.println("(8)Star Ratting in Market of Tiago is "+Star2);
		        boolean ABS_Car2=true;
		        System.out.println(ABS_Car2);
		        if(ABS_Car2)
		        {
			        System.out.println("(9)ABS System is present in Tata Tiago car.");
		        }
	}
}
