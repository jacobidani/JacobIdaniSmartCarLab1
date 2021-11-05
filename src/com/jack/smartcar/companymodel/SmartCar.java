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
	public int year;
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

		  public int matchSpeedFrontCar() {
				return 0;
		  }
		  public int rearviewDectection() {
				return 0;
		  }
		  
		  
		  
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  System.out.print(make);;
	}

}
