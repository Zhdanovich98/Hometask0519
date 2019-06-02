package com.epam.electrics;

import com.epam.electrics.BehaviorElectrics;

public class ProducingCountry extends StateElectrics implements BehaviorElectrics{
	
	//Specifying manufacturer country values
	
	public String[] mass = new String[5];
	{
		mass[0] = new String(producingCountry = "Japan");
		mass[1] = new String(producingCountry = "China");
		mass[2] = new String(producingCountry = "China");
		mass[3] = new String(producingCountry = "Germany");
		mass[4] = new String(producingCountry = "Japan");
	}
}
