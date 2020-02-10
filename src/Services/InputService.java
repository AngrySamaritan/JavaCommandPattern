package Services;

import java.util.Scanner;

public class InputService {

    private static final Scanner scanner = new Scanner(System.in);

    public static String input(String invention) {
        System.out.print(invention);
        return scanner.nextLine();
    }
}
