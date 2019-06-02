package com.epam.workWithElectrics;

import java.io.*;
import com.epam.electrics.NameElectrics;
import com.epam.electrics.ProducingCountry;
import com.epam.workWithElectrics.SortingByCountry;


public class Writer {

	public void  writeSearch() {
		SortingByCountry SortingByCountry = new SortingByCountry();
		 try {
				FileWriter wr = new FileWriter("D:/Epam/Hometask/src/Files/Name.txt");
		  		wr.write(SortingByCountry.resultSorting());
		  		wr.close();
				
		} catch(IOException ex) {
			ex.printStackTrace();
	}
				  
}
	
}
