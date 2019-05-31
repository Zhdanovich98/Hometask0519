package com.epam.electrics;

import java.util.ArrayList;

import com.epam.electrics.BehaviorElectrics;

public class NameElectrics extends StateElectrics implements BehaviorElectrics{

	//Input of five electrical appliances
	
	protected void text() {
		System.out.println("Введите 5 приборов: ");
	}
	
	public String[] mass = new String[5];
	{
		text();
		mass[0] = new String(name=scan.next());
		mass[1] = new String(name=scan.next());
		mass[2] = new String(name=scan.next());
		mass[3] = new String(name=scan.next());
		mass[4] = new String(name=scan.next());
	}
	
		
		

}


