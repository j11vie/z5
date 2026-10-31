import java.util.Scanner;

public class Main {

    static int countChocolates(int money, int price, int wrapsForOne) {
        int eaten = money / price;
        int wrappers = eaten;

        while (wrappers >= wrapsForOne) {
            int bonus = wrappers / wrapsForOne;
            eaten += bonus;
            // остаются обертки, которые не обменяли, плюс обертки от новых шоколадок
            wrappers = bonus + wrappers % wrapsForOne;
        }
        return eaten;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Сколько денег:");
        int money = in.nextInt();
        System.out.println("Цена одной шоколадки:");
        int price = in.nextInt();
        System.out.println("Сколько оберток нужно на одну шоколадку:");
        int wraps = in.nextInt();

        System.out.println(countChocolates(money, price, wraps));
    }
}
