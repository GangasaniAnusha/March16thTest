package com.cg.vf.service;

import java.util.Calendar;
import java.util.Date;

import com.cg.vf.beans.VehicleDetails;

public interface IVehicleService {

	public int register(VehicleDetails info);

	public int insuranceValidity(Date d, int insurancePeriod);

}
