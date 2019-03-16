package com.cg.vf.dao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.cg.vf.beans.VehicleDetails;

public class VehicleDaoImpl implements IVehicleDao {
	VehicleDetails vd1=new VehicleDetails(null,0,0,0);
	HashMap<Integer,VehicleDetails> hash;
public VehicleDaoImpl() {
	hash=new HashMap<Integer, VehicleDetails>();
	hash.put(1000, new VehicleDetails("2wheeler",1,98765,98765));
	hash.put(1001, new VehicleDetails("3wheeler",2,87654,87654));
	hash.put(1002, new VehicleDetails("4wheeler",1,76543,76543));
}
	public int register(VehicleDetails vd) {
		int i=0;
	for(Entry<Integer, VehicleDetails> me:hash.entrySet()) {
		if(hash.containsKey(vd.getVehicleNo())) {
			System.out.println("ERROR");
			break;
		}
		else {
			hash.put(vd.getVehicleNo(),new VehicleDetails(vd.getVehicleType(),vd.getInsurancePeriod(),vd.getAadharNo(),vd.getMobileNo()));
			i++;
			break;
		}
	}
	
	
	
	
		return i;
	}
	public int insuranceValidity(Date d, int insurancePeriod) {
		String date = d.toString();
		String[] date1 = date.split("-");
		date1[2] = Integer.toString((Integer.parseInt(date1[2])-1));
		date1[0] = Integer.toString((Integer.parseInt(date1[0])+vd1.getInsurancePeriod()));
		vd1.setLastDate(date1[2]+"/"+date1[1]+"/"+date1[0]);
		return 0;
	}

}
