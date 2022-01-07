package Contests.weekly274;
//2126. Destroying Asteroids
import java.util.*;
public class Q2126 {

    public static boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);

        long totalMass = mass;
        for (int asteroid : asteroids) {
            if (totalMass < asteroid) return false;
            totalMass += asteroid;
        }
        return true;
    }

    public static void main(String[] args) {
        int mass = 10;
        int[] asteroids = {3,9,19,5,21};
        boolean ans = asteroidsDestroyed(mass,asteroids);
        System.out.println(ans);
    }
}
