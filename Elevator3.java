/*ANNUAL EXAM PROJECT 2019-20*/
import java.io.*;       // importing input/output package for BufferReader
import java.util.*;
class Elevator3         //class name
{   
    static String G1[], F1[], F2[], F3[], F4[], F5[];       //          declaration of String arrays

    public Elevator3 (){     // default constructor for   creating an object
        Elevator3 Ev = new Elevator3();
    }             // end of the constructor

    public static void disp(){    // function definition
        System.out.println("\t\t\t Welcome to Digital Forum\t\t\t");
        System.out.println("\t\t       ****************************\t\t");

    }    // end of the function disp()

    static int floor = 0, choice1, dest = 0;    // declaration and initilisation of variables
    static int choice2;
    static BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));     // creating BufferReader
    public static void main(String args[])throws IOException                 //main method
    {
        disp();     //function call of disp()

        String G1[] = {"Pizza hut", "Fasos", "cafe coffee day", "online reservation centre", "Dominos", "Mc Donald - burger centre"};      
        String F1[] = {" Electronics and Electricals - Mobile, Laptops, desktops, Refrigerator, Washing Machine , LED and LCD TV'S, Microwave ovens, etc...."};
        String F2[] = {"Ladies Textiles", "ladies cosmetics", "Salon and spa"};
        String F3[] = {"Mens wear and textiles", "Men's salon", "Titan Watches", "Sonata Watches"};    //arrays to display the shops in particular floors
        String F4[] = {"Kids Wear", "Toys", "Kids cosmetics", "Medical Pharmacy"};
        String F5[] = {"Fun World - Games", "Digital Games", "Cinemas - 'INOX, IMAX, PVR, ARENA ANIMATIONS, IMAX - INSIGNIA' "};
        do{         //do-while loop to continue with the elevator
            System.out.println("\t\t\tWelcome to TOSHIBA Elevators\t\t\t");
            System.out.println("\t\t\tMaximum weight carriable by the elevator - 5650 kg\t\t\t ");

            floor = ((int) (Math.random() * 5 + 1));    // to display the floor at which the elevator currently is

            System.out.println("The elevator is now on floor " +floor);
            System.out.print("Which floor are you at now , 0 = basement: ");        

            choice1 = Integer.parseInt(buff.readLine());      // reading the input from user
            if(floor == choice1)
            {
                System.out.println("Enter the elevator");
            }

            else if(floor > choice1)
            {
                ElevatorDown();
            }

            else if(floor < choice1)
            {
                ElevatorUp();
            }

            System.out.println("To which floor would you want to go (0-5) , 0 = basement" );
            System.out.println("press 100 for an emergency alaram");
            choice1 = Integer.parseInt(buff.readLine());    // reading the input from user

            if(choice1 == 100){
                Emergency();  // function call of Emergency();
            }
            else if(floor > choice1)
            {
                ElevatorDown();  // function call of ElevatorDown();
            }

            else if(floor < choice1)
            {
                ElevatorUp();  // function call of ElevatorUp();
            } 

            if(choice1==0){          // to display the shops in the particular floor
                System.out.println(" Shops in Ground floor : ");
                for(int j = 0; j<G1.length; j++){
                    System.out.println(G1[j]);
                }
            }  else if(choice1==1){
                System.out.println(" Shops in First floor : ");
                for(int j = 0; j<F1.length; j++){
                    System.out.println(F1[j]);
                }
            }  else if(choice1==2){
                System.out.println(" Shops in Second floor : ");
                for(int j = 0; j<F2.length; j++){
                    System.out.println(F2[j]);
                }
            }  else if(choice1==3){
                System.out.println(" Shops in Third floor : ");
                for(int j = 0; j<F3.length; j++){
                    System.out.println(F3[j]);
                }
            }  else if(choice1==4){
                System.out.println(" Shops in Fourth floor : ");
                for(int j = 0; j<F4.length; j++){
                    System.out.println(F4[j]);
                }
            }  else if(choice1==5){
                System.out.println(" Shops in Fifth floor : ");
                for(int j = 0; j<F5.length; j++){
                    System.out.println(F5[j]);
                }
            } 

            System.out.println("press 1 to exit / any number to ride again");    // asking the user if they want to continue or exit 
            choice2 = Integer.parseInt(buff.readLine());  // readig the input from the user to exit or continue
        }
        while (choice2 != 1);   // end of the do-while loop 

        if(choice2 == 1){
            exit();   // function call of exit() if the user chooses to exit
        }
    }    // end of the main method

    public static void ElevatorUp()  
    {
        System.out.println("The elevator is on it's way up...");
        try{
            for (dest = choice1; choice1>=floor; floor++){
                Thread.sleep(1000);
                System.out.println(floor+"^");
            }
            System.out.println("The elevator has arrived");
            System.out.println("Doors are opened");
            System.out.println("You are ready to enter / exit now");
        }   //end of the function ElevatorUp
        catch(Exception e){
        }
    }

    public static void ElevatorDown()  
    {
        System.out.println("The elevator is on it's way down...");

        for (dest = choice1; choice1<=floor; floor--)

            System.out.println(floor);

        System.out.println("The elevator has arrived");
        System.out.println("Doors are opened");
        System.out.println("You are ready enter / to exit  now");
    }  //end of the function ElevatorDown

    public static void Emergency(){ 
        System.out.println("Emergency doors are opened");
        System.out.println("Exit the elevator immediately");
    }  //end of the function Emergency

    public static void exit(){
        System.out.println ("\t\t\t*********Thank You*********");
        System.out.println ("\t\t\t   *****Visit Again*****");
    }  //end of the function exit

}    // end of the class Elevator3

