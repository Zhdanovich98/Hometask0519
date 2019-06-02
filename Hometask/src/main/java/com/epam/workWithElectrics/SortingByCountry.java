package com.epam.workWithElectrics;

import java.io.FileWriter;
import java.io.IOException;

import com.epam.electrics.NameElectrics;
import com.epam.electrics.ProducingCountry;

 public class SortingByCountry extends ProducingCountry{

	NameElectrics NameElectrics = new NameElectrics();
	
	//sorting electrical equipment according to the country of manufacturer (Germany)
	
	public void sorting() {
		write();
		test();
		sereliz();
		desareliz();
	}
	
public String resultSorting() {
		ProducingCountry ProducingCountry = new ProducingCountry();
	 
	int index = -1;
	  for (int i = 0; i < mass.length; i++) {
		      if ("Germany".equals(mass[i])) {
	          index = i;
	          System.out.println("Result search:" + NameElectrics.mass[i]);
	          String result = NameElectrics.mass[i];
	         name =  NameElectrics.mass[i];
		  		} 
	  }
	return name;
	 }
		     
private void write() {
	Writer Writer = new Writer();
	Writer.writeSearch();
}

private void test() {
	TxtResult TxtResult = new TxtResult();
	TxtResult.resultSearch();
}

private void sereliz() {
	Seraliz Seraliz = new Seraliz();
	Seraliz.seralizResult();
}

private void desareliz() {
	Deseraliz Deseraliz = new Deseraliz();
	Deseraliz.desarailz();
} 
}


