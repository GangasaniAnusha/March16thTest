package com.cg.vf.ui;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import com.cg.vf.beans.VehicleDetails;
import com.cg.vf.dao.IVehicleDao;
import com.cg.vf.dao.VehicleDaoImpl;
import com.cg.vf.service.IVehicleService;
import com.cg.vf.service.VehicleServiceImpl;

public class MainClass {
static Scanner sc=new Scanner(System.in);
static VehicleDetails vd=new VehicleDetails();
static IVehicleService dao=new VehicleServiceImpl();
static Date d=new Date();
	public static void main(String[] args) {
		extractInfo();

	}

	private static void extractInfo() {
		System.out.println("Enter Your Choice :\nMENU \n1. Vehicle Insurance Registration\n2. Insurance Validity Check\n3. Exit");
		int n=sc.nextInt();
		switch(n) {
		case 1:System.out.println("Directing to Registration");
		int a=dao.register(getInfo());
		System.out.println(a);
		if(a==1) {
			System.out.println("Registration Successful");
			System.out.println("Your Registered date is"+d);
			extractInfo();
		}
		else {
			System.out.println("Error");
			extractInfo();
		}
		break;
		case 2:System.out.println("Directing to validity check");
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		int before=dao.insuranceValidity(d,vd.getInsurancePeriod());
		System.out.println(before);
			break;
		case 3:System.out.println("Thank you");
			break;
			default : System.out.println("Enter a valid choice");
			extractInfo();
		}
		
	}

	private static VehicleDetails getInfo() {
		System.out.println("Enter Vehicle No:");
		vd.setVehicleNo(sc.nextInt());
		System.out.println("Enter Vehicle Type:");
		vd.setVehicleType(sc.next());
		System.out.println("Enter Insurance Period:");
		vd.setInsurancePeriod(sc.nextInt());
		System.out.println("Enter aadhar No:");
		vd.setAadharNo(sc.nextLong());
		System.out.println("Enter Mobile No:");
		vd.setMobileNo(sc.nextLong());
		
		return vd;
	}

}
