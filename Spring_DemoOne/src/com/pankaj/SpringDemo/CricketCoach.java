package com.pankaj.SpringDemo;

public class CricketCoach implements Coach {

	// Add new fields for EmailAddress and teams.
	private String EmailAddress;
	private String Team;

	// Define a Private field for Dependency
	private FortuneService fortuneService;

	/*
	 * Create a no-arg constructor(Spring gonna call this constructor when they make
	 * a reference to our bean).
	 */
	public CricketCoach() {
		System.out.println("CricketCoach: Inside no-arg constructor");
	}

	// Create a setter method in ur class for injection
	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: Inside setter method - setEmailAddress");
		this.EmailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: Inside setter method - setTeam");
		this.Team = team;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: Inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	public String getEmailAddress() {
		return EmailAddress;
	}

	public String getTeam() {
		return Team;
	}

	@Override
	public String getDailyWorkout() {

		return "Practice the balling on a net for atleast 30 min.";
	}

	@Override
	public String getDailyFortune() {
		// Use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}

}
