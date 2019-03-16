package com.cg.vf.dao;

import java.util.Calendar;
import java.util.Date;

import com.cg.vf.beans.VehicleDetails;

public interface IVehicleDao {

	public int register(VehicleDetails vd);

	public int insuranceValidity(Date d, int insurancePeriod);

}
