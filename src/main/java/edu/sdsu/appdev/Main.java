package edu.sdsu.appdev;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Your workflow is not correctly running the Java application. No name argument, Aborting");
	    
	    System.exit(-1);
        } else if (args.length == 1) {
            System.out.printf("Congrats. You got the workflow to run successfully, %s!\n", args[0]);
        } else {
            System.out.println("Your workflow is not correctly running the Java application. Too many args (should be 1, your name), aborting");

	    System.exit(-1);
        }
    }
}
