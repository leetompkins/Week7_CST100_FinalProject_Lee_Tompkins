/**Program: OffensivePlayer Class
 * File: OffensivePlayer.java
 * Summary:  A class for the creation of Offensive NFL players, this class is a subclass of NFLPlayer
 * Milestone 6 Assignment 
 * Week5 CST100
 * Author: Lee Tompkins
 * Date: July 24 2016
 **/



class OffensivePlayer extends NFLPlayer {
	private int careerReceptions;
	private int careerYards;
	private int careerTouchdowns;
	private int careerInterceptionsThrown;
	private int careerCarries;
	//General No Args Constructor
	public OffensivePlayer(){
		
	}
	// Constructor with specified parameters 
	public OffensivePlayer(String name, String position, int height, int weight, int age, int yearsPro, int careerReceptions, int careerYards, int careerTouchdowns ){
		this.name = name;
		this.position = position;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.yearsPro = yearsPro;
		this.careerReceptions = careerReceptions;
		this.careerYards = careerYards;
		this.careerTouchdowns = careerTouchdowns;
	}
	public OffensivePlayer(String position, String name, int careerTouchdowns, int careerInterceptionsThrown, int careerYards){
		this.position = position;
		this.name = name;
		this.careerTouchdowns = careerTouchdowns;
		this.careerInterceptionsThrown = careerInterceptionsThrown;
		this.careerYards = careerYards;
	}
	public OffensivePlayer(String position, String name) {
		this.position = position;
		this.name = name;
	}
	 public int getCareerReceptions() {
		 // get receptions
		return careerReceptions;
	}
	public void setCareerReceptions(int careerReceptions) {
		// set receptions
		this.careerReceptions = careerReceptions;
	}
	public int getCareerYards() {
		// get yards
		return careerYards;
	}
	public void setCareerYards(int careerYards) {
		// set yards
		this.careerYards = careerYards;
	}
	public int getCareerTouchdowns() {
		// get touchdowns
		return careerTouchdowns;
	}
	public void setCareerTouchdowns(int careerTouchdowns) {
		// set touchdowns
		this.careerTouchdowns = careerTouchdowns;
	}
	public double getAverageTouchdowns(){
	        // Get Average touchdowns per year
	        return (careerTouchdowns / yearsPro);
	 }
	 public double getAverageYards(){
	        // Returns average yards per year 
	        return (careerYards / yearsPro);
	 }
	 public double getAverageReceptions(){
		 //get average receptions per year
		return (careerReceptions / yearsPro);
	 }
	 public void setCareerCarries(int carries){
		 this.careerCarries = carries;
	 }
	 public int getCareerCarries() {
		 return careerCarries;
	 }
	 public int getCareerInterceptionsThrown(){
		 return careerInterceptionsThrown;
	 }
	 public void setCareerInterceptionsThrown(int careerInterceptionsThrown){
		 this.careerInterceptionsThrown = careerInterceptionsThrown;
	 }
	// Celebrate for player celebration upon being drafted
	 @Override
		void celebrate() {
			int randomNum = 0; 
			randomNum = (int) (Math.random() * 4);
			switch (randomNum) {
				case 0: {
					System.out.println(name + " celebrates his draft and shouts with joy!");
					break;
				}
				case 1: {
					System.out.println(name + " celebrates his draft and does a happy backflip!");
					break;
			}
				case 2: {
					System.out.println(name + " celebrates his draft and dances with joy!");
					break;
				}
				case 3: {
					System.out.println(name + " celebrates his draft and cries tears of joy!");
					break;
				}
				case 4: {
					System.out.println(name + " celebrates his draft and does his famous touchdown dance!");
					break;
				}
			}
			return;
		}
}