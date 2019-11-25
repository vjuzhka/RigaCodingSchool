package com.accenture.lecture16;

public class WarriorApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Warrior warrior = new Warrior("God", 100);
		warrior.toString();
		warrior.damage(10);
		warrior.restoreHealth(80);
		System.out.println(warrior.toString() + " God is alive! ");

	}

}
