/**
 * 
 */
package com.jack.smartcar.companymodel;

/**
 * @author jacob
 *
 */
public class Sensors extends SmartCar{
	private String autoPilot;
	private String collisionnDetection;
	private String laneDeparture;
	private String pedestrianDetection;
	private String selfParkingMode;

    public String SelfDriving() {
		return autoPilot;
    }

	public String getLaneDeparture() {
		return laneDeparture;
	}


	

	public String getCollisionnDetection() {
		return collisionnDetection;
	}

	public String getPedestrianDetection() {
		return pedestrianDetection;
	}

	


	public String getAutoPilot() {
		return autoPilot;
	}

	public String getSelfParkingMode() {
		return selfParkingMode;
	}



	
	
    

 
}
