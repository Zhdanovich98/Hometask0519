package com.epam.electrics;
import com.epam.electrics.BehaviorElectrics;
import com.epam.electrics.NameElectrics;

public class State extends StateElectrics implements BehaviorElectrics{

//Specifying the connection values of electrical devices in the circuit ("on" / "off")
	
		public String[] mass = new String[5]; {
	/*		if (powerSupply !="on" || powerSupply !="off") {
				System.out.println("Error");
 			} else { */
		mass[0] = new String(powerSupply="on");
		mass[1] = new String(powerSupply="off");
		mass[2] = new String(powerSupply="off");
		mass[3] = new String(powerSupply="on");
		mass[4] = new String(powerSupply="off");

		}
		}

