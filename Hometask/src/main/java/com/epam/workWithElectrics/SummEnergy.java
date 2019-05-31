package com.epam.workWithElectrics;

import com.epam.electrics.Energy;
import com.epam.electrics.NameElectrics;
import com.epam.electrics.State;
import java.util.ArrayList;

public class SummEnergy extends State {
	NameElectrics NameElectrics = new NameElectrics();
	ArrayList<Integer> ArrayList = new ArrayList<Integer>();
	
	//display of electrical equipment connected to the circuit and display of their power
	
	public void workingNow() {
		State State = new State();
		Energy Energy = new Energy();
		int index = -1;
		  for (int i = 0; i < mass.length; i++) {
		      if ("Германия".equals(mass[i])) {
		          index = i;
		          System.out.println("Подключен: "+NameElectrics.mass[i] );
		          ArrayList.add(Energy.mass[i]);
		          System.out.println("Мощность: "+ Energy.mass[i]);
		          System.out.println("Всего: " + summ());
		          
		 } 	
	}
}
	protected int summ() {
		 int sum = 0; 

 	     for (int i : ArrayList)
 	         sum = sum + i;

 	     return sum;
}
}