package com.practice.durgasoft.FunctionalInterface;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Date> supplier = () ->new Date();
//		System.out.println(supplier.get());
		Supplier<String> otpSupplier = () ->{
			String otp ="";
			for(int i=0;i<5;i++) {
				otp =otp+(int)(Math.random()*10);
			}
			return otp;
			};
			System.out.println(otpSupplier.get());
	}

}
