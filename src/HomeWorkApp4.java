import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp4 {
    private static char[][] map;
    private static Scanner scanner;
    private static Random random;


    private static final int SIZE = 3;


    private static final char MAP_ELEMENT_EMPTY = '*';
    private static final char MAP_ELEMENT_X = 'X';
    private static final char MAP_ELEMENT_O = 'O';

    public static void main(String[] args) {
        random = new Random();
        scanner = new Scanner(System.in);
        initMap();
        printMap();
        while (true) {
            playerTurn();
            printMap();
            if (checkAll(MAP_ELEMENT_X)) {
                System.out.println("Игра оконченаю. Победил игрок!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Игра оконченаю. Ничья!");
                break;
            }
            aiTurn();
            printMap();
            if (checkAll(MAP_ELEMENT_O)) {
                System.out.println("Игра оконченаю. Победил AI!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Игра оконченаю. Ничья!");
                break;
            }
        }
    }

    public static boolean checkAll(char element) {
        for (int i = 0; i < SIZE; i++) {
            if (checkWinRow(element, i) || checkWinColumn(element, i)) {
                return true;
            }
        }
        if (checkDiagonal(element) || checkDiagonal2(element)) {
            return true;
        }
        return false;
    }

    public static boolean checkWinRow(char element, int rowNumber) {
        for (int i = 0; i < SIZE; i++) {
            if (map[rowNumber][i] != element) {
                return false;
            }

        }
        return true;
    }

    public static boolean checkWinColumn(char element, int columnNumber) {
        for (int i = 0; i < SIZE; i++) {
            if (map[i][columnNumber] != element) {
                return false;
            }

        }
        return true;
    }


    public static boolean checkDiagonal(char element) {
        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] != element) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkDiagonal2(char element) {
        for (int i = 0; i < SIZE; i++) {
            if (map[i][SIZE - i - 1] != element) {
                return false;
            }
        }
        return true;
    }


    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == MAP_ELEMENT_EMPTY) {
                    return false;
                }

            }
        }
        return true;
    }

    public static void playerTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты хода 'X Y'");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellEmpty(x, y));
        map[x][y] = MAP_ELEMENT_X;
        printMap();
    }

    public static void aiTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты хода 'X Y'");
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellEmpty(x, y));
        map[x][y] = MAP_ELEMENT_O;
        System.out.println("AI походил в клетку [ " + (x + 1) + ", " + (y + 1) + " ]");
        printMap();
    }

    public static boolean isCellEmpty(int x, int y) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        if (map[x][y] != MAP_ELEMENT_EMPTY) {
            return false;
        }
        return true;
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = MAP_ELEMENT_EMPTY;
            }
        }
    }
}

}
