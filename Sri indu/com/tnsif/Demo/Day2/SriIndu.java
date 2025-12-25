package com.tnsif.Demo.Day2;

public class SriIndu {

	public static void main(String[] args) {
		 CSE cse = new CSE();
	        cse.name = "Chandu";
	        cse.id = 101;
        cse.display();
        cse.DBMS();
        cse.Java();
        cse.Python();

        System.out.println();
        EEE eee = new EEE();
        eee.name = "Navya";
        eee.id = 105;

        eee.display();
        eee.EC();
        eee.PowerSystems();
        eee.ControlSystems();

        System.out.println();
        ECE ece = new ECE();
        ece.name = "Shiva";
        ece.id = 101;

        ece.display();
        ece.VLSI();
        ece.ES();
        ece.DSP();
		

	}

}
