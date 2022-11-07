package Day2;
import java.util.Random;
import java.io.IOException;

import static Day2.UniqueRandomNumbers.initNumbers;

public class TeamComp {
    static int[][] teamComp1 = {{6,2,2},{2,2,6},{2,6,2},{5,3,2},{5,2,3},{3,5,2},{2,5,3},{2,3,5},{4,3,3},{3,3,4},{3,4,3}};
    static String teamNm;

    public static void teamCreation() throws IOException {
        Random rand = new Random();
        int ranComp = rand.nextInt((11));
        RandomRealName teamN = new RandomRealName();
        String teamName = teamN.getPoke();
        teamNm = teamName;
        System.out.println("Team name: " + teamName);
        initNumbers();
        Team team = new Team(1,teamComp1[ranComp][0],teamComp1[ranComp][1],teamComp1[ranComp][2]);
    }

}
