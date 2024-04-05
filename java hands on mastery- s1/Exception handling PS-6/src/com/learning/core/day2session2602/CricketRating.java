package com.learning.core.day2session2602;


	public class CricketRating {

		private String playerName;

	    private float critic1;

	    private float critic2;

	    private float critic3;

	    private float avgRating;

	    private String coins;

	    public CricketRating(String playerName, float critic1, float critic2) {

	        this.playerName = playerName;

	        this.critic1 = critic1;

	        this.critic2 = critic2;

	        calculateAverageRating(critic1, critic2);

	        this.coins = calculateCoins();

	    }

	    public CricketRating(String playerName, float critic1, float critic2, float critic3) {

	        this.playerName = playerName;

	        this.critic1 = critic1;

	        this.critic2 = critic2;

	        this.critic3 = critic3;

	        calculateAverageRating(critic1, critic2, critic3);

	        this.coins = calculateCoins();

	    }

	    public void calculateAverageRating(float critic1, float critic2) {

	        this.avgRating = (critic1 + critic2) / 2;

	    }

	    public void calculateAverageRating(float critic1, float critic2, float critic3) {

	        this.avgRating = (critic1 + critic2 + critic3) / 3;

	    }

	    public String calculateCoins() {

	        if (avgRating >= 7) {

	            return "Gold";

	        } else if (avgRating >= 5) {

	            return "Silver";

	        } else if (avgRating >= 2) {

	            return "Copper";

	        } else {

	            throw new NotEligibleException();

	        }

	    }

	    public void display() {

	        System.out.println(playerName + " " + String.format("%.2f", avgRating) + " " + coins);

	    }

	}
	 
	 

