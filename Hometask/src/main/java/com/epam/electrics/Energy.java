package com.epam.electrics;

import com.epam.electrics.BehaviorElectrics;

public class Energy extends StateElectrics implements BehaviorElectrics{

//Input of power values of electrical appliances	
	
	public Integer[] mass = new Integer[5];
	{
		
		mass[0] = new Integer(valueEnergy=45);
		mass[1] = new Integer(valueEnergy=65);
		mass[2] = new Integer(valueEnergy=12);
		mass[3] = new Integer(valueEnergy=67);
		mass[4] = new Integer(valueEnergy=23);

}
}