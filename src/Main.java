import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(800);
        boss.setHit(50);
        System.out.println("Boss health: " + boss.getHealth() + ", Boss hit: " + boss.getHit());
        System.out.println(boss.printInfo());

        Skeleton s1 = new Skeleton(800,50,11);
        Skeleton s2 = new Skeleton(800,50,13);
        System.out.println(s1.printInfo());
        System.out.println(s2.printInfo());
    }
}