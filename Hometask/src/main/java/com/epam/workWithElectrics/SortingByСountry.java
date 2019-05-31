package com.epam.workWithElectrics;


import com.epam.electrics.NameElectrics;
import com.epam.electrics.ProducingCountry;

public class SortingByCountry extends ProducingCountry{
	
	NameElectrics NameElectrics = new NameElectrics();
	
	//sorting electrical equipment according to the country of manufacturer (Germany)
	
public void sorting() {
	
	ProducingCountry ProducingCountry = new ProducingCountry();
	
	int index = -1;
	  for (int i = 0; i < mass.length; i++) {
	      if ("Германия".equals(mass[i])) {
	          index = i;
	          System.out.println(NameElectrics.mass[i] );
	          
	      } 
}
}
}
