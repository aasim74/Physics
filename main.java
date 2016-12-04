/*  
 * 
 * A PROGRAM TO SHOW THE CALCULATIONS FOR THE LAB 2 PRACTICALS EXPERIMENT
 * A10 - XRAY DIFFRACTION. I HAVE TRIED TO INCLUDE ALL THE CALULATIONS AND
 * HAVE PUT EACH TYPE IN SEPERATE CLASSES
 * 
 * WRITTEN BY AASIM PATEL
 * BSC PHYSICS WITH MEDICAL PHYSICS
 * UNIVERSITY COLLEGE LONDON
 */


//IMPORTING ALL NECESSARY LIBRARIES AND UTILITIES
import java.text.DecimalFormat;
import java.util.Scanner;

//CREATING THE MAIN CLASS FROM WHICH OTHER CLASSES WILL BE CALLED VIA OBJECTS
public class main {

	public static void main(String[] args) {
		
		theta_calculations Object2_ = new theta_calculations();
		Object2_.theta_loop();

		plancks_constant _Object_ = new plancks_constant();
		_Object_.calculations_2();
		
		boolean confirm = true;
		
		}
}

//NEW CLASS TO CALCULATE THE PLANCKS CONSTANT
class plancks_constant{
	public static void calculations_2(){
		System.out.println("This is the calculation for plancks constant ");
	}
}

//NEW CLASS TO CALCULATE THETA AT WHICH PRIMARY MAXIMA OCCUR
class theta_calculations{
	public static void theta_loop(){
		
		//DEFINE VALUES OF K AND OTHER CONSTANTS
				double k1 = 8.048*Math.pow(10, 3);
				double k2 = 8.905*Math.pow(10, 3);
				double h = 6.63*Math.pow(10, -34);
				double c = 3*Math.pow(10, 8);
				
				//CONVERT K FROM ELECTRON-VOLTS INTO JOULES
				double e1 = (k1)*(1.6*Math.pow(10, -19));	//Math.pow(base_number, index) used for raising powers
				String energy_1 = String.valueOf(e1);
				energy_1 = energy_1.substring(0, 4) + energy_1.substring(energy_1.indexOf('E'));
				System.out.println("The energy 1 is " + energy_1 + " Joules\n");
				e1 = Double.parseDouble(energy_1);
				
				double e2 = k2*(1.6*Math.pow(10, -19));
				String energy_2 = String.valueOf(e2);
				energy_2 = energy_2.substring(0, 4) + energy_2.substring(energy_2.indexOf('E'));
				System.out.println("The energy 2 is " + energy_2 + " Joules\n");
				
				//DEFINE WAVELENGTH
				double wavelength_1 = (h*c)/(e1);	//wavelength in metres
				
				
				//FORMAT WAVELENGTH SUCH THAT IT IS ROUDED TO 12 DP AND DISPLAY IN STANDARD FORM USING E
				DecimalFormat df = new DecimalFormat("0.############"); //Round up wavelength value
				String wavelength = String.valueOf(wavelength_1); //convert double into string
				wavelength = wavelength.substring(0,4) + wavelength.substring(wavelength.indexOf('E')); //substring takes part of the string (0 to 4 starting index to length)
				// substring.indexOf('E') takes everything behind 'E' and adds it to the string
				System.out.println( "the wavelength 1 is " + wavelength + " metres\n");
				
				wavelength_1 = Double.parseDouble(wavelength); //convert string into double and assign it to wavelength
				
				
				double wavelength_2 = h*c/e2;
				
				String wavelength2 = String.valueOf(wavelength_2);
				wavelength2 = wavelength2.substring(0, 4) + wavelength2.substring(wavelength2.indexOf('E'));
				wavelength_2 = Double.valueOf(wavelength2);
				
				System.out.println("The wavelength 2 is " + wavelength_2 + " metres\n");
				
				//CALCULATE THETA AT WHICH THERE IS A MAXIMA
				double d = 2.815E-10;
				DecimalFormat ndf = new DecimalFormat("##.##");
		
		
		//CALCULATES THE VALUES OF THETA AT WHICH THERE ARE A MAXIMA FOR BOTH K-1 and K-2 VALUES
				for (int n=1; n<=7; n++){
					double i = (n*wavelength_1)/(2*d);
					double theta_1 = Math.asin(i);
					theta_1 = Math.toDegrees(theta_1);
					
					if(!Double.isNaN(theta_1)){ //if theta_1 is a number then  do this
						boolean x = true;
						System.out.println("The theta-1 angle for n=" +n + " at which there is a maxima is " + ndf.format(theta_1)+ " degrees");
					} else break;
				}
				System.out.println();
				
				for (int n=1;n<=10;n++){ 
					double j = (n*wavelength_2)/(2*d);
					double theta_2 = Math.asin(j);
					theta_2 = Math.toDegrees(theta_2);
					
					if (!Double.isNaN(theta_2)){
						System.out.println("The theta-2 angle for n=" +n + " at which there is a maxima is " + ndf.format(theta_2) + " degrees");
						}else break;
					}
				
				System.out.println();
					}
	public static void braggs_law(){
		Scanner raw_input = new Scanner(System.in);
		System.out.println("Please input your values ");
		
	}
	
	public static void method(){
		
		}
	}


