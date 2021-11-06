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

	public String LaneDepartureAlarm() {
		return laneDeparture;
	}


	

	public String CollisionnDetectionAlarm() {
		return CollisionnDetectionAlarm();
	}

	public String PedestrianDetectionAlarm() {
		return PedestrianDetectionAlarm();
	}

	



	public String SelfParkingMode() {
		return selfParkingMode;
	}

	public String getCollisionnDetection() {
		return collisionnDetection;
	}

	public void setCollisionnDetection(String collisionnDetection) {
		this.collisionnDetection = collisionnDetection;
	}

	public String getPedestrianDetection() {
		return pedestrianDetection;
	}

	public void setPedestrianDetection(String pedestrianDetection) {
		this.pedestrianDetection = pedestrianDetection;
	}

	



	
	
    

 
}
