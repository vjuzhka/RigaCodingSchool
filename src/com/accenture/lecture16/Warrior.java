package com.accenture.lecture16;

public class Warrior {
	private String name;
	private int health;
	private int damagePower;

	public Warrior(String name, int initialHealth) {
		this.name = name;
		this.health = initialHealth;
	}

	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	public boolean isAlive() {

		if (health > 0) {
			return true;

		} else {
			return false;
		}

	}

	public void damage(int damage) {
			
			if (isAlive()) {
									
			if ((health - damage) >= 0) {
				health = health - damage;
			 if (damage <0) {
				System.out.println("Zero");
												}
			} else {
				health = 0;
			}
			System.out.println("Your damage is  " + damage + " Warrior: "
					+ name);
		} else {
			System.out.println("Warrior alreay dead.");

		}

	}

	public void restoreHealth(int health1) {

		if (isAlive()) {
			health1 = this.health + health;

			System.out.println("Take some pills, it helps.");

		} else {

			System.out.println("Sorry, we can't help you :(");

		}

	}

	public String toString() {
		return "Dear " + name + "You have " + health + " points";
	}

}
