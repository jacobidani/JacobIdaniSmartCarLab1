/**
 * 
 */
package com.jack.smartcar.companymodel;

/**
 * @author jacob
 *
 */
public abstract class SmartCar {

	private static String make="Jack";
	public String model;
	public double year;
	public String color;
	public String VIN;
	
	  public  int moveForward() {
			return 0;
		}
		  public  int moveBackward() {
			return 0;
		}
		  
		  public int emergencyStop() {
			return 0;
		}

		  public double matchSpeedFrontCar() {
				return 0;
		  }
		  public int rearviewDectection() {
				return 0;
		  }
		  
		 
		  
		  {

		  System.out.print(make);;
	}

}
