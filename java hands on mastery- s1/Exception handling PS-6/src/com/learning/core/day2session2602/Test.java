package com.learning.core.day2session2602;

	import java.util.Scanner;
	 
	public class Test {

		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);

			        while (true) {

			            System.out.println("Enter player details (name and ratings separated by spaces, enter 'done' to finish):");

			            String input = scanner.nextLine();

			            if (input.equalsIgnoreCase("done")) {

			                break;

			            }

			            String[] parts = input.split(" ");

			            String playerName = parts[0];

			            float critic1 = Float.parseFloat(parts[1]);

			            float critic2 = -1; // Default value

			            float critic3 = -1; // Default value

			            // Checking if there are more than 2 parts (name and first rating)

			            if (parts.length > 2) {

			                critic2 = Float.parseFloat(parts[2]);

			            }

			            // Checking if there are more than 3 parts (name, first rating, and second rating)

			            if (parts.length > 3) {

			                critic3 = Float.parseFloat(parts[3]);

			            }

			            try {

			                CricketRating player;

			                if (critic3 != -1) {

			                    player = new CricketRating(playerName, critic1, critic2, critic3);

			                } else {

			                    player = new CricketRating(playerName, critic1, critic2);

			                }

			                player.display();

			            } catch (NotEligibleException e) {

			                System.out.println("NotEligible");

			            } catch (ArrayIndexOutOfBoundsException e) {

			                System.out.println("Please provide at least player name and one rating.");

			            } catch (NumberFormatException e) {

			                System.out.println("Invalid input format. Please enter a number for ratings.");

			            }

			        }

			        scanner.close();

			    }

			}

