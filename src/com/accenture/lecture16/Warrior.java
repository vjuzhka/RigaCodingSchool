package com.accenture.lecture16;

public class Warrior {
	private String name;
	private int health;

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
		if (damage > 0) {

			System.out.println("Your damage is  " + damage + " Warrior: " + name);
					

		} else {
			health = health - damage;

			System.out.println("You are dead.");

		}
	}

	public void restoreHealth(int health1) {
		
		if (health1 > 0) {
			health1 = this.health + health;

			System.out.println("Take some pills, it helps." );
					

		} else {
						
			System.out.println("Sorry, we can't help you :(");

		}
		

	}

	public String toString() {
				return "Warrior alive:"+isAlive();
	}

}
