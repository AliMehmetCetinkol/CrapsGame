# CrapsGame
Craps is a game played with two dice, known almost all over the world. The rules of the game are as follows.
1) If it is 7 or 11, the player wins.
2) If it's 2,3,12, the player loses. (This is called craps!)
3) If the total value of the two dice is anything other than the above ( 4,5,6,8,9,10), the game continues as follows:
The player rolls the dice again until they get the same result. If the player rolls a 7 before finding the same result (the total value of the two dice), the player loses. If the player manages to roll the same result again before the 7 comes, he wins.
# How to run

```
public class App {
    public static void main(String[] args) {
        int trials = 100000;
        int wins = 0;

        for (int t = 0; t < trials; t++)
            if (Craps.winsPassBet()) wins++;
        System.out.println("Winning percentage = " + 1.0 * wins / trials);
    }
}
```
