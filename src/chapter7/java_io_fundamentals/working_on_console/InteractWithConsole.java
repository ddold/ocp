package chapter7.java_io_fundamentals.working_on_console;

import java.io.Console;

/**
 * Created by dan on 12/17/16.
 */
public class InteractWithConsole {
    public static void main(String [] args){
        Console console = System.console();
        if(console != null){
            String file = console.readLine("Enter File to delete:");
            console.format("About to delete %s %n", file);

            console.printf("Sure to delete %s(Y/N)?", file);
            String delete = console.readLine();

            if(delete.toUpperCase().trim().equals("Y")){
                char[] pwd = console.readPassword("Enter Password:");
                if(pwd.length > 0){
                    console.format("Deleted %s", file);
                } else {
                    console.format("No password. Cancelling deletion");
                }
            } else {
                console.format("Operation cancelled... %nNow Exiting.");
            }
        } else {
            System.out.println("No Console");
        }
    }
}
