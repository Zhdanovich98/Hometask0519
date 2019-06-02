package com.epam.electrics;

import java.util.ArrayList;

import com.epam.electrics.BehaviorElectrics;

public class NameElectrics extends StateElectrics implements BehaviorElectrics{

	//Input of five electrical appliances
	
	
	
	public String[] mass = new String[5];
	{
		mass[0] = new String(name="Television");
		mass[1] = new String(name="Phone");
		mass[2] = new String(name="Iron");
		mass[3] = new String(name="Teapot");
		mass[4] = new String(name="Coffee machine");
	}
	
		
		

}


