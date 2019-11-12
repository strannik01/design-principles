package com.dev21.solid.dip.violated;

public class App {

	public static void main(String[] args) {
		CustomerRelationOffice customerRelationOffice = new CustomerRelationOffice();
		
		customerRelationOffice.sendUrgent("to:all#msg:all credit canceled");
		
		customerRelationOffice.sendNormal("to:all#Especial offers Android Phones");
		customerRelationOffice.sendNormal("to:all#Especial offers Java Course");
		
		customerRelationOffice.sendAll();
	}
}
