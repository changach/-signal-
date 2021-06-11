package sharon.matatu.project;
import java.util.Scanner;

public class Main {
    //Welcome message
    public static void welcomemessage() {
        System.out.println("Hello,Welcome to EasyRide Services");
        System.out.println("Please Log In");

    }

    //Create LogIn Object
    private Auth Enter;

    //Vehicles Available
    //Classification By Purpose
    private String[] Exclusive = {"Sedan", "Convertible", "Mercedes", "Lamborghini"};
    private String[] Comfortable = {"SUV", "BMW", "Toyota"};
    private String[] Capacity = {"Lorry", "Trucks", "Pick-up"};

    //specify max number of elements
    // private String[] userCategory = new String[2];
    private String[] userChoices = new String[1];
    private String[] CurrentCategory = new String[1];

    //boolean to store choices
    private boolean chooseInSameCategory = false;
    private boolean chooseInDifferentCategory = false;

    public static void main(String[] args) {
        //invoke default Constructor
        Main mainProgram = new Main();
        //Invoke LogIn Constructor
        mainProgram.Enter = new Auth();
        // Initialize Input
        mainProgram.input = new Scanner(System.in);
        //display welcome message
        mainProgram.welcomemessage();
        //Authenticate User
        boolean IsSuccessful = mainProgram.LogInUser();

        if (IsSuccessful) {
            mainProgram.UserActivity();
        }
    }

    //Create Scanner Object
    private Scanner input;
    //storing user input
    private String first_name;
    private String last_name;
    private int Phone_number;

    //Prompt User to Input LogIn Details
    private boolean LogInUser() {
        boolean success = true;
        System.out.println("First name: ");
        //Store LogIn Details
        //Intake first name
        String first_name = input.next();
        //Intake Last name
        System.out.println("Last name: ");
        String last_name = input.next();
        //Intake Phone Number
        System.out.println("Phone Number: ");
        int Phone_number = Integer.parseInt(input.next());

        //Store values in setters
        Enter.setfirst_name(first_name);
        Enter.setlast_name(last_name);
        Enter.setPhone_number(Phone_number);
        return true;

    }

    //Choosing category
    //retrieve user
    private void UserActivity() {
        String actualUser = Enter.getfirst_name();
        System.out.println("Hi, " + actualUser);
    }
}

