package com.cg.vf.service;

import java.util.Calendar;
import java.util.Date;

import com.cg.vf.beans.VehicleDetails;

public class VehicleServiceImpl implements IVehicleService {
	VehicleDetails vd=new VehicleDetails();
	public int register(VehicleDetails info) {
		// TODO Auto-generated method stub
		return register(vd);
	}

	public int insuranceValidity(Date d, int insurancePeriod) {
		// TODO Auto-generated method stub
		return  insuranceValidity(d,insurancePeriod);
	}

}
