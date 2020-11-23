package TextbasedGame;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		
		//Enemies
	
		String[] enemies = { "Goul", "Wolf", "Skeleton", "Dragon" };
		int maxEnemyHealth= 100;
		int enemyAttackDamage = 25;
		
		//Player
		int health = 100;
		int attackDamage = 50;
		int numHealthPots = 3;
		int healthPotionHealAmount = 30;
		int healthPotionDropChance = 10; //in percent
		
		boolean running = true;
		System.out.println("Welcome to the Dungeon!");
		
		GAME:
		while(running) {
			System.out.println("------------------------------------------------");
			int enemyHealth = rand.nextInt(maxEnemyHealth);
			String enemy = enemies[rand.nextInt(enemies.length)];
			System.out.println("\t*** " + enemy + " appeared! ***\n");
			
			while (enemyHealth > 0) {
				System.out.println("\tYour HP: " + health);
				System.out.println("\t" + enemy + "'s HP: " + enemyHealth);
				System.out.println("\n\tWhat would you like to do?");
				System.out.println("\t1. Attack");
				System.out.println("\t2. Drink Potion");
				System.out.println("\t3. Flee!");
					
				String input = in.nextLine();
				if(input.equals("1")) {
					int damageDealt = rand.nextInt(attackDamage);
					int damageTaken = rand.nextInt(enemyAttackDamage);
						
					enemyHealth -= damageDealt;
					health -= damageTaken;
						
					System.out.println("\t > You strike the enemy for " + damageDealt +  " damage");
					System.out.println("\t > You receive " + damageTaken + "  in retaliation");
						
					if(health < 1) {
						System.out.println("\t > You died!");
						break;
					}
				}
				
				else if(input.equals("2")) {
					if(numHealthPots > 0 ) {
						health += healthPotionHealAmount;
						numHealthPots--;
						System.out.println("\t>You drink a health potion and heal for " + healthPotionHealAmount + ".<\n\t>You now have " + health + "HP.< \n\t>You have " + numHealthPots + " health potions left.<" );
					}
					else {
						System.out.println("\t> You have no health potions left!<");
					}
				}
					
				else if(input.equals("3")) {
					System.out.println("\t>You ran away from the enemy!<");
					continue GAME;
				}
					
				else {
					System.out.println("\tinvalid command!");
				}
						
			}
					
			if(health < 1) {
				System.out.println("DEAD");
				break;
			}
					
			System.out.println("------------------------------------------------");
			System.out.println("*** Enemy was defeated! ***");
			System.out.println("\n>You now have " + health + "HP.<");
			if (rand.nextInt(100) < healthPotionDropChance) {
				numHealthPots++;
				System.out.println("\tThe enemy dropped a health Potion!\n You now have " + numHealthPots);
			}
			System.out.println("------------------------------------------------");
			System.out.println("What would you like to do?");
			System.out.println("1.Keep fighting");
			System.out.println("2.Exit dungeon");
					
			String input = in.nextLine();
					
			while(!input.equals("1") && !input.equals("2")) {
				System.out.println("invalid command!");
				input = in.nextLine();
			}
					
			if(input.equals("1")) {
				System.out.println("You continue your adventure.");
			}
			else if(input.equals("2")) {
				System.out.println("You exit the dungeon.");
				break;
			}
					
				
		}
		System.out.println("Thanks for playing!.");
        
	}

}

