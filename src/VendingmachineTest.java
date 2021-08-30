import java.util.Scanner;

/**
 * This is second assignment of Java assignment
 * Which is based on Vending Machine.
 * This program is created on 22th June 2020.
 *
 *
 * @ Author: Utsavkumar M Patel (000820474)
 *
 */


public class VendingmachineTest {

    /**
     * @param args
     * @throws InterruptedException
     */

    public static void main(String[] args) throws InterruptedException {

        //Declare and Create Vending Machine 1 Object
        Vendingmachine v1 = new Vendingmachine();

        //Set the initial values of vending Machine 1
        v1.setItemName(" Chocolate Bar ");
        v1.setItemPrice(1.25);
        v1.setItemQuantity(5);
        v1.setUnusedCredit(0.0);
        v1.setTotalAmount(0.0);

        //Declare and Create Vending MAchine 2 Object
        Vendingmachine v2 = new Vendingmachine();

        //Set the initial Values of Vending Machine 2
        v2.setItemName(" Chips ");
        v2.setItemPrice(2.5);
        v2.setItemQuantity(1);
        v2.setUnusedCredit(0.0);
        v2.setTotalAmount(0.0);

        //Take input from the User
        Scanner sc = new Scanner(System.in);

        // Set the Initial value for Vending Machine1
        int ItemQuantity = 5;
        String ItemName = " Chocolate Bar ";
        double ItemPrice = 1.25;
        double UnusedCredit = 0.0;
        double TotalAmount = 0.0;


        //Display the Initial stages for both Vending Machines
        System.out.println("Welcome to the Break Room !");
        System.out.println("There are two vending machine here:");
        System.out.println("Vending Machine cotains: " + ItemQuantity + ItemName + " , Price " + ItemPrice);
        System.out.println("\tUnused Credit:" + UnusedCredit);
        System.out.println("\tTotal Amount of Money vended: " + TotalAmount + "\n");

        //Set the initial value for Vending Machine2
        ItemQuantity = 1;
        ItemName = " Chips ";
        ItemPrice = 2.5;
        UnusedCredit = 0.0;
        TotalAmount = 0.0;


        //Display the Initial stages for both Vending Machines
        System.out.println("Vending Machine cotains: " + ItemQuantity + ItemName + " , Price  " + ItemPrice);
        System.out.println("\tUnused Credit: " + UnusedCredit);
        System.out.println("\tTotal Amount of Money vended: " + TotalAmount + "\n");
        System.out.println("What would you like to do ? ");
        System.out.println("1. Enter Money ");
        System.out.println("2. Get change back ");
        System.out.println("3. Vend an item ");
        System.out.println("4. Leave the break room ");
        System.out.println("Enter Your Choice Below Here :");

        // Make a choice from available Options
        int choice = sc.nextInt();

        //For choice 1
        if (choice == 1) {
            //Display the chosen choice
            System.out.println(" *** Enter Money Selected *** ");
            System.out.println(" ** Which Vending Machine ? **");
            int machine = sc.nextInt();

            //Display the chosen machine
            if (machine == 1) {

                // Perform the operation of adding value
                System.out.println("*** You've selected Vending Machine1 to add money ***\n");
                System.out.println("Enter the Amount($) to be Added : ");
                double addMoney = sc.nextDouble();
                System.out.println("You have selected " + addMoney + "$ to add to Vending machine1 ");

                //Checking the enter amount in loonies , toonies ,quarter , dime , nickel
                if (addMoney == 2 || addMoney == 1 || addMoney == 0.25 || addMoney == 0.1 || addMoney == 0.05) {
                    v1.Coin(addMoney);
                } else {
                    System.out.println("Input a valid Coin !!");
                    Thread.sleep(2000);
                }

                //Stop a program for 5 Seconds
                System.out.println(" ** Please wait for a second!! It usually take a while...**");
                Thread.sleep(5000);


                System.out.println("Welcome to the Break Room !");
                System.out.println(v1);
                System.out.println("\n");
                System.out.println(v2);

                System.out.println("\nWhat would you like to do ? ");
                System.out.println("1. Enter Money ");
                System.out.println("2. Get change back ");
                System.out.println("3. Vend an item ");
                System.out.println("4. Leave the break room ");
                System.out.println("Enter Your Choice Below Here :");
                choice = sc.nextInt();
                // Choice For Vending MAchine2
            } else if (machine == 2) {
                System.out.println("*** You've selected Vending Machine2 to add money ***\n");
                System.out.println("Enter the Amount($) to be Added (Please Choose Toonie ,Loonie ,Quarter ,Dime ,Nickel ): ");
                double addMoney = sc.nextDouble();
                System.out.println("You have selected " + addMoney + "$ to add Vending machine2 ");

                if (addMoney == 2 || addMoney == 1 || addMoney == 0.25 || addMoney == 0.1 || addMoney == 0.05) {
                    v2.Coin(addMoney);
                } else {
                    System.out.println("Input a valid Coin !!");
                    Thread.sleep(2000);
                }

                //Stop a program for 5 Seconds
                System.out.println(" ** Please wait for a second!! It usually take a while...**");
                Thread.sleep(5000);


                System.out.println("Welcome to the Break Room !");
                System.out.println(v1);
                System.out.println("\n");
                System.out.println(v2);

                System.out.println("\nWhat would you like to do ? ");
                System.out.println("1. Enter Money ");
                System.out.println("2. Get change back ");
                System.out.println("3. Vend an item ");
                System.out.println("4. Leave the break room ");
                System.out.println("Enter Your Choice Below Here :");
                choice = sc.nextInt();

            } else {
                //Input Validation
                System.out.println(" *** Your selected the number which is not in Options *** ");
                System.out.println(" ** Make a Selection Again or Select 4 to exit ** ");
                choice = sc.nextInt();
                // Choice For 4th Option
                if (choice == 4) {
                    System.out.println("*** Leave the break room selected *** ");
                    System.out.println("\t*** Good Bye Take Care !! *** ");
                }
            }

        }

        // Choice For 2nd Option
        else if (choice == 2) {

            System.out.println(" *** Get Change Back Selected *** ");
            System.out.println(" ** Which Vending Machine ? **\n");
            int machine = sc.nextInt();
            // Choice For Vending Machine1
            if (machine == 1) {

                System.out.println("*** You've selected Vending Machine1 ***\n");
                System.out.println(" ** Checking Current balance...Please wait for a second!! **");
                Thread.sleep(5000);
                System.out.println("Your Change is " + v1.getUnusedCredit());
                v1.change();

                v2.change();
            } else if (machine == 2) {  // Choice For vending machine2

                System.out.println("*** You've selected Vending Machine2 ***\n");
                System.out.println(" ** Checking Current balance...Please wait for a second!! **");
                Thread.sleep(5000);
            } else //checking the options validation
                {

                System.out.println(" *** Your selected the number which is not in Options *** ");
                System.out.println(" ** Make a Selection Again or Select 4 to exit ** ");
                choice = sc.nextInt();

                // Choice For 4th Option
                if (choice == 4) {
                    System.out.println("*** Leave the break room selected *** ");
                    System.out.println("\t*** Good Bye Take Care !! *** ");
                }
            }


        }


        // Choice of 3rd Option
        else if (choice == 3) {

            System.out.println(" *** Vend an Item Chosen *** ");
            System.out.println(" ** Which Vending Machine? **\n");
            int machine = sc.nextInt();
            // Choice For 1st Option
            if (machine == 1) {


                System.out.println("*** You've selected Vending Machine1 ***\n");
                System.out.println("** Vend Failed ! , Not Enough Credit **");
                System.out.println("Welcome to the Break Room !");
                System.out.println("There are two vending machine here:");
                System.out.println(v1);
                System.out.println("\n");
                System.out.println(v2);

                System.out.println("\nWhat would you like to do ? ");
                System.out.println("1. Enter Money ");
                System.out.println("2. Get change back ");
                System.out.println("3. Vend an item ");
                System.out.println("4. Leave the break room ");
                System.out.println("Enter Your Choice Below Here :");
                choice = sc.nextInt();
                //Choice For 2nd Option

                if (choice == 2) {

                  System.out.println(" *** Get Change Back Selected *** ");
                  System.out.println(" ** Which Vending Machine ? **\n");
                  machine = sc.nextInt();
                  // Choice For Vending Machine1
                  if (machine == 1) {

                      System.out.println("*** You've selected Vending Machine1 ***\n");
                      System.out.println(" ** Checking Current balance...Please wait for a second!! **");
                      Thread.sleep(5000);
                      System.out.println("Your Change is " + v1.getUnusedCredit());
                      v1.change();

                      v2.change();
                } else if (machine == 2) {  // Choice For vending machine2

                   System.out.println("*** You've selected Vending Machine2 ***\n");
                   System.out.println(" ** Checking Current balance...Please wait for a second!! **");
                   Thread.sleep(5000);
                 } else //checking the options validation
                 {

                    System.out.println(" *** Your selected the number which is not in Options *** ");
                    System.out.println(" ** Make a Selection Again or Select 4 to exit ** ");
                    choice = sc.nextInt();

                   // Choice For 4th Option
                    if (choice == 4) {
                        System.out.println("*** Leave the break room selected *** ");
                        System.out.println("\t*** Good Bye Take Care !! *** ");
                      }
                  }

                }








                // Choice For 3rd Option
                if (choice == 3) {
                    System.out.println(v1);
                    if (v1.getTotalAmount() > 1 && (v1.getUnusedCredit() > v1.getItemPrice())) {
                        v1.getChange();
                        System.out.println("Your change is " + v1.getChange());
                        v1.remainCred();
                        v1.newBalance();
                        v1.remainAmt();

                        // Choice For 4th Option
                    } else if (choice == 4) {
                        System.out.println("*** Leave the break room selected *** ");
                        System.out.println("\t*** Good Bye Take Care !! *** ");
                    }

                }
                // Choice For vending machine 2 Option
                else if (machine == 2) {
                    System.out.println("*** You've selected Vending Machine2 ***\n");
                    System.out.println("** Vend Failed ! , Not Enough Credit **");
                    System.out.println("Welcome to the Break Room !");
                    System.out.println("There are two vending machine here:");
                    System.out.println(v1);
                    System.out.println("\n");
                    System.out.println(v2);

                    System.out.println("\nWhat would you like to do ? ");
                    System.out.println("1. Enter Money ");
                    System.out.println("2. Get change back ");
                    System.out.println("3. Vend an item ");
                    System.out.println("4. Leave the break room ");
                    System.out.println("Enter Your Choice Below Here :");
                    choice = sc.nextInt();

                    // Choice For 4th Option
                    if (choice == 4) {
                        System.out.println("*** Leave the break room selected *** ");
                        System.out.println("\t*** Good Bye Take Care !! *** ");
                    }
                    // Choice For 3th Option
                    else if (choice == 3) {
                        System.out.println(v2);
                        // Checking the amount balance
                        if (v2.getTotalAmount() > 1 && (v2.getUnusedCredit() > v2.getItemPrice())) {
                            v2.getChange();
                            System.out.println("Your change is " + v2.getChange());
                            v2.remainCred();
                            v2.newBalance();
                            v2.remainAmt();

                        }
                    }
                } else {
                    //Validating the number
                    System.out.println(" *** Your selected the number which is not in Options *** ");
                    System.out.println(" ** Make a Selection Again or Select 4 to exit ** ");
                    choice = sc.nextInt();
                    // Choice For 4th Option
                    if (choice == 4) {
                        System.out.println("*** Leave the break room selected *** ");
                        System.out.println("\t*** Good Bye Take Care !! *** ");
                    }
                }

            }

        }
            // Choice For 4th Option
            else if (choice == 4) {

                System.out.println("*** Leave the break room selected *** ");
                System.out.println("\t*** Good Bye Take Care !! *** ");
            }

            // Choice Rather than available Options
            else {

                //Ask the user to Select Appropriate Option or Select 4 to exit
                System.out.println(" *** Your selected the number which is not in Options *** ");
                System.out.println(" ** Make a Selection Again or Select 4 to exit ** ");
                choice = sc.nextInt();

                //If user choose 4th option to leave
                if (choice == 4) {
                    System.out.println("*** Leave the break room selected *** ");
                    System.out.println("\t*** Good Bye Take Care !! *** ");
                }
            }



    }
}

