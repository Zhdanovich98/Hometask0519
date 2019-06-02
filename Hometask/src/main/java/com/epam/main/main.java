package com.epam.main;

//import com.epam.workWithElectrics.SortingByCountry;
import com.epam.workWithElectrics.SummEnergy;
import com.epam.workWithElectrics.TxtResult;
import com.epam.workWithElectrics.SortingByCountry;
import com.epam.electrics.NameElectrics;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Sorting by country(Germany) with save txt result and serialization : ");	
	SortingByCountry SortingByCountry = new SortingByCountry();
	SortingByCountry.sorting();
	 System.out.println("Work now  : ");
		SummEnergy SummEnergy = new SummEnergy();
		SummEnergy.workingNow();
	}

}
