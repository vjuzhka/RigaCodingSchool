package com.accenture.lecture16;

public class WarriorApp {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Warrior warrior = new Warrior("God", 100);
		warrior.damage(10);
		warrior.restoreHealth(80);
		System.out.println(warrior);

		Warrior warrior2 = new Warrior("Fedor", 80);
		warrior2.damage(70);
		warrior2.restoreHealth(10);
		System.out.println(warrior2);

		Warrior warrior3 = new Warrior("Sigizmund", 80);
		warrior3.damage(80);
		warrior3.restoreHealth(0);
		System.out.println(warrior3);

		Warrior warrior4 = new Warrior("Petrov", 80);
		warrior4.damage(-100);
		warrior4.restoreHealth(0);
		warrior4.damage(-100);
		System.out.println(warrior4);
		
	}
}