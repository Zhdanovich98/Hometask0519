package com.epam.electrics;

import com.epam.electrics.BehaviorElectrics;

public class ProducingCountry extends StateElectrics implements BehaviorElectrics{
	
	//Specifying manufacturer country values
	
	public String[] mass = new String[5];
	{
		mass[0] = new String("Беларусь");
		mass[1] = new String("Китай");
		mass[2] = new String("Китай");
		mass[3] = new String("Германия");
		mass[4] = new String("Германия");
	}
}
