import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a % b;

        if (c == 1 || c == 4) {
            System.out.print("Upper berth");
        } else if (c == 2 || c == 5) {
            System.out.print("Middle berth");
        } else if (c == 3 || c == 6) {
            System.out.print("Lower berth");
        } else if (c == 7) {
            System.out.print("Side Lower berth");
        } else if (c == 8) {
            System.out.print("Side Upper berth");
        }else {
            System.out.print("Invalid input");
        }
    }
}
