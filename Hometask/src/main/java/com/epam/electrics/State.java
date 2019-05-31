package com.epam.electrics;
import com.epam.electrics.BehaviorElectrics;
import com.epam.electrics.NameElectrics;

public class State extends StateElectrics implements BehaviorElectrics{

//Specifying the connection values of electrical devices in the circuit ("on" / "off")
	
		public String[] mass = new String[5]; {
		mass[0] = new String("вкл");
		mass[1] = new String("выкл");
		mass[2] = new String("выкл");
		mass[3] = new String("вкл");
		mass[4] = new String("выкл");

		}
}
