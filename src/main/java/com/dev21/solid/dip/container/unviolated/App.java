package com.dev21.solid.dip.container.unviolated;

public class App {

	public static void main(String[] args) {
		CustomerRelationOffice customerRelationOffice = (CustomerRelationOffice) Container.getComponent("customerRelationOffice");
		
		customerRelationOffice.sendUrgent("to:all#msg:all credit canceled");
		
		customerRelationOffice.sendNormal("to:all#Especial offers Android Phones");
		customerRelationOffice.sendNormal("to:all#Especial offers Java Course");
		
		customerRelationOffice.sendAll();
	}
}
