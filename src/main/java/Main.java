import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //forgot to add doors!
        Scanner myScanner = new Scanner(System.in);
        System.out.println("This is to calculate howS much paint you would need to paint all the required walls");
        System.out.println("How many walls are there?");
        int noOfWalls = Integer.parseInt(myScanner.nextLine());
        float totalPaintableArea = 0;
        float totalWindowArea = 0;
        float totalPlugArea = 0;


        /* start of where I was adding new code, comment out if not ready
        System.out.println("Please list the colours that you will be painting the walls with and separate them with a comma.");
        String list = myScanner.nextLine();
        String[] colourList = list.split(",");
        double[][] amountOfPaint = new double[colourList.length][4];

        for (int j = 0; j < colourList.length; j++){
            System.out.println("How many walls would you like to paint in " + colourList[j] + "?");
            int noOfWallsInColor = Integer.parseInt(myScanner.nextLine());

            for (int i = 0; i < noOfWallsInColor; i++) {
                int wallNo = i + 1;
                System.out.println("This is wall number " + wallNo);


                System.out.println("What is the height of the wall? (in meters)");
                Float wallHeight = myScanner.nextFloat();

                System.out.println("Now what is the width of the wall? (in meters)");
                Float wallWidth = myScanner.nextFloat();

                float wallArea = wallHeight * wallWidth;

                System.out.println("The height of the wall is: " + wallHeight + " meters \nThe width of the wall is: " + wallWidth + " meters");
                System.out.println("The total area of the wall is " + wallArea + " meters squared");
                System.out.println("\n");

                System.out.println("How many windows are on the wall?");
                int noOfWindows = myScanner.nextInt();

                if(noOfWindows > 0) {
                    System.out.println("What is the height of the window(s)? (in meters)");
                    float windowHeight = myScanner.nextFloat();

                    System.out.println("What is the width of the window(s)? (in meters)");
                    float windowWidth = myScanner.nextFloat();

                    totalWindowArea = windowWidth * windowHeight * noOfWindows;

                    System.out.println("So you have " + noOfWindows + " windows, with a height of " + windowHeight + " meters and a width of " + windowWidth + " meters.");
                    System.out.println("The total window area you have on the wall is " + totalWindowArea + " meters squared.");
                }

                System.out.println("\n");

                System.out.println("How many plug sockets do you have on the wall?");
                int noOfPlugs = myScanner.nextInt();

                if (noOfPlugs > 0) {
                    System.out.println("What is the height of the plug socket(s)? (in meters)");
                    float plugHeight = myScanner.nextFloat();

                    System.out.println("What is the width of the plug socket(s)? (in meters)");
                    float plugWidth = myScanner.nextFloat();

                    totalPlugArea = noOfPlugs * plugWidth * plugHeight;

                    System.out.println("You have " + noOfPlugs + " on your wall with a height of " + plugHeight + " meters and a width of " + plugWidth + " meters.");
                    System.out.println("The total area of plugs on the wall is " + totalPlugArea + " meters Squared");
                }

                totalPaintableArea = totalPaintableArea + wallArea - totalPlugArea - totalWindowArea;
                System.out.println("\nThe total area of wall that will need to be painted in " + colourList[j] + " is " + totalPaintableArea + " meters squared.");
            }

            System.out.println("How many coats of paint do you want to apply to the wall?");
            int coats = myScanner.nextInt();

            float totalArea = coats * totalPaintableArea;


            float litresOfPaint = totalArea / 6;

            int ten = 10;
            int five = 5;


            //amount of 10 litre paint needed
            double totalTen = Math.floor(litresOfPaint/ten);
            double amountLeft = litresOfPaint - (totalTen * 10);
            amountOfPaint[j][0] = totalTen;

            //amount of 5 litre paint needed
            double totalFive = Math.floor(amountLeft/five);
            amountLeft = amountLeft - (totalFive * 5);
            amountOfPaint[j][1] = totalFive;

            //amount of 2.5 litre paint needed
            double totalTwoPointFive = Math.floor(amountLeft/2.5);
            amountLeft = amountLeft - (totalTwoPointFive * 2.5);
            amountOfPaint[j][2] = totalTwoPointFive;

            //amount of 1 litre paint needed
            double totalOne = Math.ceil(amountLeft);
            amountOfPaint[j][3] = totalOne;

            System.out.println("On average 1 litre of paint will cover 6 meters squared of a wall.\nWith the area to be painted to be " + totalPaintableArea + " meters squared, with " + coats + " coats with the colour " + colourList[j] + ".");
            System.out.println("The total area that will need to be painted is " + totalArea + " meters squared");
            System.out.println("The total litres of paint needed is " + litresOfPaint);

        }

        System.out.println("In total, you will need to buy the following.");
        for (int j = 0; j < colourList.length; j++){
            System.out.println("For the " + colourList[j] + " paint:");
            System.out.println( amountOfPaint[j][0] + " bucket(s) of 10 litres.\n" + amountOfPaint[j][1] + " bucket(s) of 5 litres");
            System.out.println(amountOfPaint[j][2] + " bucket(s) of 2.5 litres\n" + amountOfPaint[j][3] + "bucket(s) of 1 litre");
        }
        Comment to here if out of time*/



        for (int i = 0; i < noOfWalls; i++) {
            int wallNo = i + 1;
            System.out.println("This is wall number " + wallNo);


            System.out.println("What is the height of the wall? (in meters)");
            Float wallHeight = myScanner.nextFloat();

            System.out.println("Now what is the width of the wall? (in meters)");
            Float wallWidth = myScanner.nextFloat();

            float wallArea = wallHeight * wallWidth;

            System.out.println("The height of the wall is: " + wallHeight + " meters \nThe width of the wall is: " + wallWidth + " meters");
            System.out.println("The total area of the wall is " + wallArea + " meters squared");
            System.out.println("\n");

            System.out.println("How many windows are on the wall?");
            int noOfWindows = myScanner.nextInt();

            if(noOfWindows > 0) {
                System.out.println("What is the height of the window(s)? (in meters)");
                float windowHeight = myScanner.nextFloat();

                System.out.println("What is the width of the window(s)? (in meters)");
                float windowWidth = myScanner.nextFloat();

                totalWindowArea = windowWidth * windowHeight * noOfWindows;

                System.out.println("So you have " + noOfWindows + " windows, with a height of " + windowHeight + " meters and a width of " + windowWidth + " meters.");
                System.out.println("The total window area you have on the wall is " + totalWindowArea + " meters squared.");
            }

            System.out.println("\n");

            System.out.println("How many plug sockets do you have on the wall?");
            int noOfPlugs = myScanner.nextInt();

            if (noOfPlugs > 0) {
                System.out.println("What is the height of the plug socket(s)? (in meters)");
                float plugHeight = myScanner.nextFloat();

                System.out.println("What is the width of the plug socket(s)? (in meters)");
                float plugWidth = myScanner.nextFloat();

                totalPlugArea = noOfPlugs * plugWidth * plugHeight;

                System.out.println("You have " + noOfPlugs + " on your wall with a height of " + plugHeight + " meters and a width of " + plugWidth + " meters.");
                System.out.println("The total area of plugs on the wall is " + totalPlugArea + " meters Squared");
            }

            totalPaintableArea = totalPaintableArea + wallArea - totalPlugArea - totalWindowArea;
            System.out.println("\nThe total area of wall that will need to be painted is " + totalPaintableArea + " meters squared.");
        }

        System.out.println("How many coats of paint do you want to apply to the wall?");
        int coats = myScanner.nextInt();

        float totalArea = coats * totalPaintableArea;


        float litresOfPaint = totalArea / 6;

        System.out.println("On average 1 litre of paint will cover 6 meters squared of a wall.\nWith the area to be painted to be " + totalPaintableArea + " meters squared, with " + coats + " coats.");
        System.out.println("The total area that will need to be painted is " + totalArea + " meters squared");
        System.out.println("The total litres of paint needed is " + litresOfPaint);

        int ten = 10;
        int five = 5;


        //amount of 10 litre paint needed
        double totalTen = Math.floor(litresOfPaint/ten);
        double amountLeft = litresOfPaint - (totalTen * 10);

        //amount of 5 litre paint needed
        double totalFive = Math.floor(amountLeft/five);
        amountLeft = amountLeft - (totalFive * 5);

        //amount of 2.5 litre paint needed
        double totalTwoPointFive = Math.floor(amountLeft/2.5);
        amountLeft = amountLeft - (totalTwoPointFive * 2.5);

        //amount of 1 litre paint needed
        double totalOne = Math.ceil(amountLeft);

        System.out.println("The size of the buckets of paint required is:\n" + totalTen + " bucket(s) of 10 litres.\n" + totalFive + " bucket(s) of 5 litres");
        System.out.println(totalTwoPointFive + " bucket(s) of 2.5 litres\n" + totalOne + " bucket(s) of 1 litre");

    }


}
