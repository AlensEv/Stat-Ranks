
/*Alens Evra CSC 250 */
// This program provides the best and worst stats for an athlete. 
/*  After you have indicate the number years a player has been playing and their starting year. The program will prompt you to provide the 
the stats for each year untill that number limit is reached. 

The program will provide the besta and stat rankings for each year.
*/
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int numYears;
        /* scans and greets user */
        Scanner scnr = new Scanner(System.in);
        System.out.println("Welcome to nfl/nba player stat ranks");
        System.out.print("Enter the number of years ");
        numYears = scnr.nextInt();
        int c[] = new int[numYears];
        int min = Integer.MAX_VALUE;
        int max = 0;
        int i;
        int yearent;/* user may add their inputs */
        System.out.print("Enter the starting year ");
        yearent = scnr.nextInt();

        for (i = 0; i < numYears; i++) {/* takes in the year that the user wants to start */
            System.out.print("Enter stat for year " + (yearent++) + ": ");
            c[i] = scnr.nextInt();
        }
        for (i = 0; i < numYears; i++) {
        }
        for (i = 0; i < numYears; i++) {/* calculates max */
            if (c[i] > max)
                max = c[i];
        }
        {/* calculates min */
            for (i = 0; i < c.length; i++) {
                if (c[i] < min) {
                    min = c[i];
                }
            } /* ouputs the user min and max */
            System.out.println("Best stat was " + max + " in year " + yearent);
            System.out.println("Worse stat was " + min + " in year " + yearent);
            System.out.println(" ");
            {/* Start of output 2 */
                int numears;

                Scanner snr = new Scanner(System.in);
                System.out.print("Enter the number of years");
                numears = snr.nextInt();
                int b[] = new int[numears];/* different variables for ouput 2 */
                int in = 100;
                int ax = 0;
                int a;
                int newyear;
                System.out.print("Enter the starting year");
                newyear = snr.nextInt();

                for (a = 0; a < numears; a++) {/* user enters year and it gets incremented here */
                    System.out.print("Enter stat for year" + (newyear++) + ":");
                    b[a] = snr.nextInt();
                }
                for (a = 0; a < numears; a++) {
                }
                for (a = 0; a < numears; a++) {/* calculates max */
                    if (b[a] > ax)
                        ax = b[a];
                }
                {/* calculates min */
                    for (a = 0; a < b.length; a++) {
                        if (b[a] < in) {
                            in = b[a];
                        }
                    }
                    /* ouputs the user min and max */
                    System.out.println("Best stat was " + ax + " in year " + newyear);
                    System.out.println("Worse stat was " + in + " in year " + newyear);

                }
            }
        }
    }
}
