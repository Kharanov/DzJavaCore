package DZ6;

import java.io.IOException;
import java.util.Scanner;

public class UserInterface {
    private final Controller conroller = new Controller();

    public void runApplication() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите ответ: 1 - Poluchit' pogody iz Yandexa, " +
                    "2 - Poluchit' pogody iz BD, " +
                    "выход (exit) - zavershit' rabotu");
            String result = scanner.nextLine();
            checkIsExit(result);

            try {
                notifyController(result);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void checkIsExit(String result) {
        if (result.toLowerCase().equals("exit")) {
            System.out.println("Zavershau raboty");
            System.exit(0);
        }
    }

    private void notifyController(String input) throws IOException{
        conroller.onUserInput(input);
    }
}
