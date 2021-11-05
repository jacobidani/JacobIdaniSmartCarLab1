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

	public void setLaneDeparture(String laneDeparture) {
		this.laneDeparture = laneDeparture;
	}

	public String getCollisionnDetection() {
		return collisionnDetection;
	}

	public String getPedestrianDetection() {
		return pedestrianDetection;
	}

	public void setPedestrianDetection(String pedestrianDetection) {
		this.pedestrianDetection = pedestrianDetection;
	}

	public void setCollisionnDetection(String collisionnDetection) {
		this.collisionnDetection = collisionnDetection;
	}

	public String getAutoPilot() {
		return autoPilot;
	}

	public String getSelfParkingMode() {
		return selfParkingMode;
	}

	public void setSelfParkingMode(String selfParkingMode) {
		this.selfParkingMode = selfParkingMode;
	}

	public void setAutoPilot(String autoPilot) {
		this.autoPilot = autoPilot;
	}
	
    

 
}
