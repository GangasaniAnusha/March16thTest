package com.cg.vf.beans;

public class VehicleDetails {
private String vehicleType;
private int vehicleNo,insurancePeriod;
private long aadharNo,mobileNo;
public VehicleDetails(String vehicleType, int insurancePeriod, long aadharNo, long mobileNo) {
	this.vehicleType = vehicleType;
	this.insurancePeriod = insurancePeriod;
	this.aadharNo = aadharNo;
	this.mobileNo = mobileNo;
}
public VehicleDetails() {
	// TODO Auto-generated constructor stub
}
public String getVehicleType() {
	return vehicleType;
}
public void setVehicleType(String vehicleType) {
	this.vehicleType = vehicleType;
}
public int getInsurancePeriod() {
	return insurancePeriod;
}
public void setInsurancePeriod(int insurancePeriod) {
	this.insurancePeriod = insurancePeriod;
}
public long getAadharNo() {
	return aadharNo;
}
public void setAadharNo(long aadharNo) {
	this.aadharNo = aadharNo;
}
public long getMobileNo() {
	return mobileNo;
}
public void setMobileNo(long mobileNo) {
	this.mobileNo = mobileNo;
}
public int getVehicleNo() {
	return vehicleNo;
}
public void setVehicleNo(int vehicleNo) {
	this.vehicleNo = vehicleNo;
}
public void setLastDate(String string) {
	
}


}
