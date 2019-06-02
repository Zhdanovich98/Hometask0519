package com.epam.workWithElectrics;

import java.io.*;
import com.epam.electrics.NameElectrics;
import com.epam.electrics.ProducingCountry;

public class Seraliz {
	
	
void seralizResult() {
	try {
		FileOutputStream file= new FileOutputStream("D:/Epam/Hometask/src/Files/Result.ser");
		ObjectOutputStream stream = new ObjectOutputStream(file);
		SortingByCountry SortingByCountry = new SortingByCountry();
		stream.writeObject(SortingByCountry.resultSorting());	
		stream.close();
	} catch (IOException ex) {
		ex.printStackTrace();
	}
}
}
