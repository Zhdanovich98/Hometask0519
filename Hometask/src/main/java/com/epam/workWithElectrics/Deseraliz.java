package com.epam.workWithElectrics;

import java.io.*;
import com.epam.electrics.NameElectrics;
import com.epam.electrics.ProducingCountry;


public class Deseraliz {
	SortingByCountry SortingByCountry;
	public void desarailz() {
		try {
		FileInputStream file = new FileInputStream("D:/Epam/Hometask/src/Files/Result.ser");
		ObjectInputStream stream = new ObjectInputStream(file);
Object one = stream.readObject();
String sort = (String) one;
stream.close();
	} catch(Exception ex) {
		ex.printStackTrace();
	 } 
		
	}
}
