import java.util.ArrayList;
import java.util.Random;

public class Enemy {
    static Random r = new Random();
    static ArrayList<Integer> arrayList = new ArrayList<>();
    public static int enemyinput() {
        int ans = 0;
        boolean flag = true;
        while (flag){
            ans = r.nextInt(19) + 1;
            for (int i = 0; i < arrayList.size(); i++) {
                if (ans != arrayList.get(i)) flag = false;
                else{
                    flag = true;
                    break;
                }
            }
        }
        return ans;
        }
    public static void restart(){
        arrayList.clear();
    }
    public static void add(int a){
        arrayList.add(a);
    }

}
