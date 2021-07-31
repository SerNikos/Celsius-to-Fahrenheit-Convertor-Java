/* This java program converts temperature from Celsius to Fahrenheit.
 */

import static java.lang.System.exit;

class CelsiusFahrenheit {

    public static void main(String[] args) {
        float F, C;

        
		if (args.length>0) //
	{
        switch (args[0]) {
            case ("1"):
                // Input temperature in Celsius from user
                C = Float.parseFloat(args[1]);

                // Convert Celsius to Fahrenheit
                F = C * (9f / 5) + 32;

                // Print results
                System.out.println(C + " degree Celsius is equal to " + F + " degree Fahrenheit.");
                break;
            case ("2"):
                // Input temperature in Fahrenheit from user
                F = Float.parseFloat(args[1]);

                // Convert Celsius to Fahrenheit
                C = (F - 32) * (5 / 9f);

                // Print results
                System.out.println(F + " degree Fahrenheit is equal to " + C + " degree Celsius.");
                break;
				
				default:
					System.out.println("INVALID ARGUMENT! ENTER VALID INPUT TO CONTINUE\n");
					print_menu();
     
			}
	}
	else
	{
					System.out.println("PLEASE SELECT A NUMBER\n");
					print_menu();
					
    }
	
	
	
	
}

//this method prints the use's menu
public static void print_menu()
	{
		System.out.println("******************************************************************");
		System.out.println("1. Convert from Celsius to Fahrenheit");
		System.out.println("2. Convert from Fahrenheit to Celsius");
		System.out.println("******************************************************************");
	}
	
}