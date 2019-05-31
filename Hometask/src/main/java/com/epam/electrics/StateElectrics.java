package com.epam.electrics;

import java.util.Scanner;

public abstract class StateElectrics {
Scanner scan = new Scanner(System.in);
protected int valueEnergy; //power value of electrical equipment
protected String powerSupply; //the value of the inclusion in the circuit of the appliance
protected String name; //name of electrical equipment
protected String producingCountry; //producing country

//user exception handling (negative power cannot exist)

protected int getValueEnergy() throws ValueEnergyException {
	 if(valueEnergy<0) throw new ValueEnergyException("The number is less than 0", valueEnergy);
	 
	 return 0;
}

//user exception 

class ValueEnergyException extends Exception{
	 
    private int valueEnergy1;
    public int getvalueEnergy1(){return valueEnergy1;}
    public ValueEnergyException(String message,int valueEnergy){
     
        super(message);
        valueEnergy=valueEnergy1;
    }
}
}
