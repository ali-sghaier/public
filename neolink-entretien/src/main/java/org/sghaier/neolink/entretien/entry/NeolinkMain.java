/*
 * Created on 1 ao�t 2017
 *
 */
package org.sghaier.neolink.entretien.entry;

import java.util.Scanner;

/**
 * Main Class.
 * 
 * @author Personal - Ali
 *
 *         1 août 2017
 *
 */
public class NeolinkMain {

    /**
     * MAin methode:
     * <br>
     * <br>
     *
     * @author Personal - Ali
     *
     *         1 août 2017
     * 
     * @param args
     *
     */
    public static void main(String[] args) {

        Scanner scanner = null;
        try {
            System.out.println("**********         sghaier ali                  **********");
            System.out.println("********** users and account manager            **********");
            System.out.println("********** 'h' for help                         **********");

            scanner = new Scanner(System.in);

            while (true) {

                System.out.print("insert the service please : ");

                final String operation = scanner.nextLine();

                boolean goToExit = false;

                switch (operation) {
                    case "h":
                        printHelp();
                        break;

                    case "q":
                        goToExit = true;
                        System.out.println("exit");
                        break;

                    case "1":
                        System.out.println("add user");
                        break;

                    case "2":
                        System.out.println("add user");
                        break;

                    case "3":
                        System.out.println("add user");
                        break;

                    case "4":
                        System.out.println("add user");
                        break;

                    case "5":
                        System.out.println("add user");
                        break;

                    case "6":
                        System.out.println("add user");
                        break;

                    case "7":
                        System.out.println("add user");
                        break;

                    case "8":
                        System.out.println("add user");
                        break;
                    case "9":
                        System.out.println("add user");
                        break;

                    case "10":
                        System.out.println("add user");
                        break;

                    default:
                        System.out.println("operation not supported");
                        break;
                }

                if (goToExit) {
                    break;
                }
            }

        }
        catch (final Exception e) {
            System.out.println("Erreur: " + e.getMessage());
            System.exit(-2);
        }
        finally {
            scanner.close();
            System.out.println("********** Good Bye **********");
        }
    }

    /**
     * Print in the system out the help
     * <br>
     * <br>
     *
     * @author Personal - Ali
     *
     *         2 août 2017
     * 
     *
     */
    private static void printHelp() {

        System.out.println("services :");
        System.out.println();
        System.out.println("q  : for exit");
        System.out.println("h  : for help");
        System.out.println("1  : add user");
        System.out.println("2  : delete user");
        System.out.println("3  : update user");
        System.out.println("4  : add account");
        System.out.println("5  : delete account");
        System.out.println("6  : update account");
        System.out.println("7  : deposite money");
        System.out.println("8  : link account to user");
        System.out.println("9  : find accounts by user");
        System.out.println("10 : balance all accounts by user");

    }
}
