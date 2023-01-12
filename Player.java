import java.util.*;
import java.io.*;
import java.math.*;

    /**
     * Auto-generated code below aims at helping you parse
     * the standard input according to the problem statement.
     **/
    class Player {

        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            int surfaceN = in.nextInt(); // the number of points used to draw the surface of Mars.
            int flatX1 = 0;
            int flatX2 = 0;
            int flatY = 0;
            int lastY = 0;
            int lastX = 0;
            for (int i = 0; i < surfaceN; i++) {
                int landX = in.nextInt(); // X coordinate of a surface point. (0 to 6999)
                int landY = in.nextInt(); // Y coordinate of a surface point. By linking all the points together in a sequential fashion, you form the surface of Mars.
                if(lastY == landY) {
                    flatX1 = lastX;
                    flatX2 = landX;
                    flatY = landY;
                }
                lastX = landX;
                lastY = landY;
            }

            System.err.println(flatX1 + " " + flatX2);

            // game loop
            while (true) {
                int X = in.nextInt();
                int Y = in.nextInt();
                int hSpeed = in.nextInt(); // the horizontal speed (in m/s), can be negative.
                int vSpeed = in.nextInt(); // the vertical speed (in m/s), can be negative.
                int fuel = in.nextInt(); // the quantity of remaining fuel in liters.
                int rotate = in.nextInt(); // the rotation angle in degrees (-90 to 90).
                int power = in.nextInt(); // the thrust power (0 to 4).

                // Write an action using System.out.println()
                // To debug: System.err.println("Debug messages...");
                System.err.println(hSpeed + " " + vSpeed);

                // rotate power. rotate is the desired rotation angle. power is the desired thrust power.
                if(X < flatX1) {

                    if(hSpeed > 40) {
                        if(Y < flatY  + 500) {
                            System.out.println("10 4");
                        } else {
                            System.out.println("40 4");
                        }
                    } else if(hSpeed < -40) {
                        if(Y < flatY  + 500) {
                            System.out.println("-10 4");
                        } else {
                            System.out.println("-40 4");
                        }

                    } else {
                        if(Y < flatY  + 500) {
                            System.out.println("-10 4");
                        } else {
                            System.out.println("-20 4");
                        }

                    }
                } else if(X > flatX2) {
                    if(hSpeed > 40) {
                        if(Y < flatY  + 500) {
                            System.out.println("10 4");
                        } else {
                            System.out.println("35 4");
                        }

                    } else if(hSpeed < -40) {
                        if(Y < flatY  + 500) {
                            System.out.println("-10 4");
                        } else {
                            System.out.println("-35 4");
                        }

                    } else {
                        if(Y < flatY  + 500) {
                            System.out.println("10 4");
                        } else {
                            System.out.println("15 3");
                        }
                    }
                }
                else if(hSpeed > 10) {
                    System.out.println("50 4");
                } else if(hSpeed < -10) {
                    System.out.println("-60 4");
                } else if(vSpeed < -35) {
                    System.out.println("0 4");
                } else if(vSpeed > 40) {
                    System.out.println("0 4");
                } else {
                    System.out.println("0 1");
                }
            }
        }
    }
