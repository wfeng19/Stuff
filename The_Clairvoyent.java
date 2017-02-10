package the_clairvoyent;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class The_Clairvoyent {

	//Yes or No
	static String[] choices = new String[]
			{"Yes", "No"};
	//Array with responses to understand question
	static String[] understand = new String[]
		{"Thank you, and let the questions begin!",
		"Allow me to repeat myself then."
		};
	//Array with possible inputted names
	static String[] names = new String[]
			{"Caitlin"};
	//Introduction dialogue
	static String[] dialogue = new String[]
			{"I am the Clairvoyent. I have the ability to see the future based on various circumstances, such as the time of day,",
			"weather, and more. Thus, I will be asking you a series of 10 questions, some of which will require a yes or no answer.",
			"These questions will help me get a better picture of the future, which I will then illustrate for you. However, my visions only",
			"come in bits and pieces, so that will be the best I can give you. Please answer only using lowercase letters and be truthful.",
			"If none of the answers are correct, please select the one that best fits.",
			"Is this understood? [Yes/No]"
			};
	//Arrays for feelings feelings
	static String[] feelings_a = new String[]
			{"FAN-FREAKING-TASTIC",
			"Pretty good",
			"Eh, I'm ok",
			"Pretty bad",
			"I want to kill myself"
			};
	static boolean[] feelings_b = new boolean[]
			{false,
			false,
			false,
			false,
			false					
			};
	//Arrays for weather		
	static String[] weather_a = new String[]
			{"Sunny",
			"Party cloudy",
			"Cloudy",
			"Rainy",
			"Snowy"		
			};
	static String[] weather_r = new String[]
			{"I wish I could feel the sunshine... Thanks for making me feel bad.",
			"Well at least it's not completely cloudy!",
			"Well at least it's not raining!",
			"Ew, I can't touch the rain, or I'm gonna get fried! I really hope you don't bring outside.",
			"Really? That's AWESOME!",
			"What is your answer?"
			};
	static boolean[] weather_b = new boolean[]
			{false, false, false, false, false};
	//Arrays for temperature
	static String[] temperature_a = new String[]
			{"Burning",
			"Warm",
			"Moderate",
			"Chilly",
			"Frigid"		
			};
	static String[] temperature_r = new String[]
			{"Ouch that sucks. I hope I don't overheat then!",
			"",
			"That's sounds nice! Too bad I'm a computer program... Anyways, next question.",
			"",
			"Thanks for telling me. It's temperatures like these that make me glad I'm just a computer program.",
			"Please enter a valid answer."
			};
	static boolean[] temperature_b = new boolean[]
		{false, false, false, false, false};
	
	public static void main(String[] args) {
		
		boolean validInput = false;
		boolean yes;
		boolean no;
		boolean Caitlin;
		String miscAnswers;
		String answer;
		//Introduction with name
		System.out.println("Good afternoon. May I inquire as to what your name is?");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		System.out.println("Hi " + name + ", it is pleasure to meet you!");
		//"How are you today?"- First real question
		System.out.println("How are you today? [ FAN-FREAKING-TASTIC / Pretty good / Eh, I'm ok / Pretty bad / I want to kill myself ]");
		String feeling = input.nextLine();
		validInput = false;
		while (!validInput){
			if (feelings_b[0] = (feeling).equalsIgnoreCase(feelings_a[0])){
				System.out.println("Well that is simply AMAZING to hear. I'm glad you're having such an awesome day!");
				validInput = true;
			}
			else if (feelings_b[1] = (feeling).equalsIgnoreCase(feelings_a[1])){
				System.out.println("That's good.");
				validInput = true;
			}
			else if (feelings_b[2] = (feeling).equalsIgnoreCase(feelings_a[2])){
				System.out.println("Ah, one of those days, huh? Nothing too good or too bad? I gotchu.");
				validInput = true;
			}
			else if (feelings_b[3] = (feeling).equalsIgnoreCase(feelings_a[3])){
				System.out.println("Aw, I'm sorry to hear that. I hope that I'll be able to brighten up your day very soon!");
				validInput = true;
			}
			else if (feelings_b[4] = (feeling).equalsIgnoreCase(feelings_a[4])){
				System.out.println("No, please don't say that! There are still so many things in life to care about, and there are");
				System.out.println("still so many things you haven't had the chance to do yet. Even if you don't care about your life,");
				System.out.println("just imagine how sad your friends and family would feel if you committed suicide. And if you honestly");
				System.out.println("think that no one would miss you if you suddenly disappeared, that's simply not true. Each life touches");
				System.out.println("the lives of thousands of others. I thus beg that you stay here until you at least finish running through");
				System.out.println("my program. If you still want to take your life after this, then so be it. But at least allow me to try");
				System.out.println("and brighten up your day.");
				validInput = true;
			}
			else{
				System.out.println("What did you just say?");
				validInput = false;
				feeling = input.nextLine();
			}
		}
		validInput = false;
		//Explanation of purpose
		System.out.println("I am unsure about how much my creator has told you about me, so please allow me to elaborate.");
		printArray(dialogue);
		while (!isCorrectAnswer(input.nextLine(), understand, dialogue));
		System.out.println("Let's start with some deeply personal and creepy questions.");
        validInput = false;
        //Personal Question 1- Age
        while (!validInput){
        	System.out.println("How old are you? [Enter an integer in years]");
        	try {
        		int age = input.nextInt();
        		input.nextLine();
        		System.out.println("Yeah, I am only about a week old, so you're definitely older than me.");
        		validInput = true;
        	}catch (InputMismatchException e){
        		System.out.println("What the heck does that mean?");
        		input.nextLine();
        	}
        }
        validInput = false;
        //Personal Question 2- Pets
        while (!validInput){
        	System.out.println("Do you have any pets? [Yes/No]");
        	answer = input.nextLine();
        	if (yes = (answer).equalsIgnoreCase(choices[0])){
        		System.out.println("How many? [Enter an integer]");
        		try {
            		int pets = input.nextInt();
            		input.nextLine();
            		System.out.println("Only? I have around 1729 cats, but I guess " + pets + " works, too.");
            		validInput = true;
            	}catch (InputMismatchException e){
            		System.out.println("What? I'll ask again.");
            		validInput = false;
            		input.nextLine();
            	}
        	}
        	else if (no = (answer.equalsIgnoreCase(choices[1]))){
        		System.out.println("How can you not have any pets? Pets are great! [Explain your answer]");
        		miscAnswers = input.nextLine();
        		System.out.println("Oh, ok. Whatever, your loss.");
        		validInput = true;
        	}
        	else {
        		System.out.println("I have no idea what you mean, so I will repeat the question.");
        	}
        }
        yes = false;
        no = false;
        validInput = false;
        //Personal Question 3- Make out
        System.out.println("Out of the people in your school, who do you want to make out with the most?");
        try {
        	Thread.sleep(5000);
        	System.out.println("");
        }
        catch (InterruptedException e) {
        	e.printStackTrace();
        }
        while (!validInput){
        	System.out.println("Haha, I'm just joking. You don't have to answer that!");
        	//Tests for names to output different stuff
        	if (Caitlin = (name).equalsIgnoreCase(names[0])){
        		System.out.println("I'm sure your answer would be Matt Kraft, though.");
                System.out.println("But ANYWAYS...");
        		validInput = true;
        	}
        	else{
        		validInput = true;
        	}
        }
        validInput = false;
        //Introduction to Actual Questions
        try {
        	Thread.sleep(3000);
        }
        catch (InterruptedException e) {
        	e.printStackTrace();
        }
        System.out.println("Can I be honest with you? You're kinda boring. You're boring me. I think I'm just going to move onto the actual");
        System.out.println("questions now. Yeah, you heard me correctly. I was just messing around before. But since you're so boring");
        System.out.println("I guess I have to actually do my thing now and read the future and blah blah blah. Ugh. Here we go.");
        try {
        	Thread.sleep(3000);
            System.out.println("");
        }
        catch (InterruptedException e) {
        	e.printStackTrace();
        }
        //Question 1 to 3 - Date
        System.out.println("Question 1:");
        System.out.println("What is the current month? [Enter the name of the month]");
        String month = input.nextLine();
        System.out.println("Question 2:");
        System.out.println("What is the current day? [Enter an integer for the day of the month]");
        int day = input.nextInt();
        System.out.println("Question 3:");
        System.out.println("What is the current year? [Enter an integer for the year]");
        int year = input.nextInt();
        System.out.println("So the date is " + month + " " + day + ", " + year + "?");
        System.out.println ("Awesome!");
        //Question 4- Weather
        System.out.println("Question 4:");
        System.out.println("What is the weather like today? [ Sunny / Partly Cloudy / Cloudy / Windy / Stormy ]");
        while (!mc_questions(input.nextLine(), weather_a, weather_r, weather_b));
        //Question 5- Temperature
        System.out.println("Question 5:");
        System.out.println("What is the temperature like today? [ Burning / Warm / Moderate / Chilly / Frigid]");
        while (!mc_questions(input.nextLine(), temperature_a, temperature_r, temperature_b));
	
        /*
        System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
        System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrryrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
        System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrgBBBBBgrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
        System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrryBBBBBBCrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
        System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrJBBBBBBPrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
        System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrjBBPrccrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
        System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrBBBBwrBBrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
        System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrjBBBBKjBrrrrrrrrrrjBBBBNrrrrrrrrrrrrrrrrrrrrrrrr");
        System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrBBBBBBBrrrrrrrrrjBBBBBBKrrrrrrrrrrrrrrrrrrrrrrr");
        System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrlBBBPCrrrrrrrrrrRBBBBBPrrrrrrrrrrrrrrrrrrrrrrrr");
        System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrgBBBBKrrJrrrrrrrrJBBBBrrrrrrrrrrrrrrrrrrrrrrrrrr");
        System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrjBBBBBPrJbBrrrrrrrgBBBBBrrrrrrrrrrrrrrrrrrrrrrrrr");
        System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrjBBBBBBrrrrjBBwrrrgBBBBBBPrrrrrrrrrrrrrrrrrrrrrrrr");
        System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrgBBBBBKrrrrrJNBBBBBBBBBBBKrrrrrrrrrrrrrrrrrrrrrrrr");
        System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrJBBBBBBPrrrrrrrrJPPTBBBBBBKrrrrrrrrrrrrrrrrrrrrrrrr");
        System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrrjBBBBBBBrrrrrrrrrrrrjBBBBBBBrrrrrrrrrrrrrrrrrrrrrrrr");
        System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrjBBBBBBBKrrrrrrrrrrrgBBBBBBBBrrrrrrrrrrrrrrrrrrrrrrrr");
        System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrryBBBBBBBBPrrrrrcggBBBBBBBBBBBBKrrrrrrrrrrrrrrrrrrrrrrr");
        System.out.println("rrrrrrrrrrrrrrrrrrrrrrrryBBBBBBBBBBrrrrrrJBBBBBBBBBBBBBBBrrrrrrrrrrrrrrrrrrrrrrr");
        System.out.println("rrrrrrrrrrrrrrrrrrrrrygBBBBBBBBBBBBrrrrrrrBBBBNfJTBBBBBRMFrrrrrrrrrrrrrrrrrrrrrr");
        System.out.println("rrrrrrrrrrrrrrrrrrrrrrJBBBBBBBBBBBBPrrrrrrJBBBBgrcBBBBKrrrrrrrrygrrrrrrrrrrrrrrr");
        System.out.println("rrrrrrrrrrrrrrrrrrrrrrrjBBBBBBBBBBBBrrrrrrrBBBBBrrBBBBPygggBBBBBBCrrrrrrrrrrrrrr");
        System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrxSBBLrrJBKrrrrrrrrrJBBBBBrBBBBBBBBBBBBJBBrrrrrrrrrrrrrrr");
        System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrtBrrrrTNBgrrrrrrrrrygBBBBBBNNRMPPPPTJrNCrrrrrrrrrrrrrrr");
        System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrcrrrrfrJTTrrrrrrfTTTTcJJrrrrrrrrrrrrrrrcrrrrrrrrrrrrrr");
        System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
        System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
        */
        
	}
	
	
	
	
	
	//Method to make sure user inputs "Yes", and will keep repeating otherwise
	static boolean isCorrectAnswer(String userAnswer, String[] response, String[] info) {
	    boolean rightAnswer = (userAnswer).equalsIgnoreCase(choices[0]);
	    if (rightAnswer){
	    	System.out.println(response[0]);
	    }
	    else if (!rightAnswer){
	    	System.out.println(response[1]);
	    	printArray(info);
	    }
	    return rightAnswer;
	}
	
	//Method for outputting arrays
	public static void printArray(String[] anArray) {
		for (int i = 0; i < anArray.length; i++) {
			System.out.println(anArray[i]);
		}
	}
	
	//Method for the multiple choices questions
	//Note: It would be cool to eventually keep score of what answer the user actually picks with an integer, and each
	//if and else statement would add to the score. That way, the picture that's outputted would actually change depending
	//on what answers you pick. However, I still must test to see if the score is kept or if it can be outputted from the method.
	static boolean mc_questions(String userAnswer, String[] answers, String[] responses, boolean[] booleans) {
	    boolean moveOn = false;
	    if (booleans[0] = (userAnswer).equalsIgnoreCase(answers[0])){
			System.out.println(responses[0]);
			System.out.println("");
			moveOn = true;
		}
		else if (booleans[1] = (userAnswer).equalsIgnoreCase(answers[1])){
			System.out.println(responses[1]);
			System.out.println("");
			moveOn = true;
		}
		else if (booleans[2] = (userAnswer).equalsIgnoreCase(answers[2])){
			System.out.println(responses[2]);
			System.out.println("");
			moveOn = true;
		}
		else if (booleans[3] = (userAnswer).equalsIgnoreCase(answers[3])){
			System.out.println(responses[3]);
			System.out.println("");
			moveOn = true;
		}
		else if (booleans[4] = (userAnswer).equalsIgnoreCase(answers[4])){
			System.out.println(responses[4]);
			System.out.println("");
			moveOn = true;
		}
		else{
			System.out.println(responses[5]);
		}
	    return moveOn;
	}
	
}
