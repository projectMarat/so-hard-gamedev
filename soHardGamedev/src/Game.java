import java.util.Random;
import java.util.Scanner;

public class Game {
    public static int zagadannoe_chislo = 0;
//    static Scanner s = new Scanner(System.in);
    static Random r;
    static Enemy enemy = new Enemy();
    static boolean flag = false;
    public static void main(String[] args) {
        start();
        while (true){

            for (int i = 0; i < 10; i++) {
                int hand = HandleInput.input();
                if(hand == zagadannoe_chislo){
                    System.out.println("krasava");
                    flag = true;
                    break;
                }
                else {
                    enemy.add(hand);
                    System.out.println(hand+" ne verno\n");
                }
                int enin = Enemy.enemyinput();
                System.out.println("enemy sholdi "+enin);
                if (enin == zagadannoe_chislo){
                    System.out.println("enemy won");
                    flag = true;
                    break;
                }else {
                    enemy.add(enin);
                    System.out.println(enin+" ne verno\n");
                }
            }
            if(!flag) System.out.println("draw! chislo bilo "+zagadannoe_chislo);
//            else System.out.println("chislo bilo "+zagadannoe_chislo);
            enemy.restart();
            flag = false;
            zagadannoe_chislo = r.nextInt(19)+1;
        }
    }
    public static void start(){
        r = new Random();
        zagadannoe_chislo = r.nextInt(19)+1;
        System.out.println("rules:\nvi doljni vvesti chislo ot 1 do 20\nesli chislo sovpadaet c zagadannim vi viigrivaete\nu vas est protivnik kotorij toge budet pitatsya ugadat chislo");
    }
    public static boolean compare(int a){
        return a == zagadannoe_chislo;
    }
}
