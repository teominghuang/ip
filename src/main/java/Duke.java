import java.util.Scanner;

public class Duke {
    public static void main(String[] args) {
        /*String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);*/

        String hyphenate = "____________________________________________________________";
        System.out.println(hyphenate + "\nHello! I'm Duke\nWhat can I do for you?\n" + hyphenate);

        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        while (!command.equals("bye")){
            System.out.println(hyphenate + "\n" + command + "\n" + hyphenate);
            command = sc.nextLine();
        }
        
        sc.close();
    }
}
