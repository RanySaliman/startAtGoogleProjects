package Day2;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.io.FileWriter;
import java.io.IOException;
import static Day2.Player.*;
import static Day2.TeamComp.teamNm;
import static Day2.UniqueRandomNumbers.counter;
import static Day2.UniqueRandomNumbers.generateNum;

public class Team {

    static ArrayList<Player> teamPlayers = new ArrayList<>();

    public Team(int gk, int att, int def, int midf) throws IOException {

    if (gk + att + def + midf != 11)
        return;
    if (gk != 1)
    return;

    Player player = new Player(1);
    teamPlayers.add(player);


    while(att!=0) {
        makeAtt();
        teamPlayers.add(new Player(2));
        att--;
    }

    while(def!=0) {
        makeDef();
        teamPlayers.add(new Player(3));
        def--;
    }
    while(midf!=0) {
        makeMid();
        teamPlayers.add(new Player(4));
        midf--;
    }
        saveToFile("filename.txt", "Team Name:" + teamNm, true);
        for (int i = 0; i < 11; i++) {
            String outputText = teamPlayers.get(i).getName() + "| Jersey number: " + teamPlayers.get(i).getJerseyNum() + "| Grade: " +
                    teamPlayers.get(i).getGrade() + "|  Position: " + teamPlayers.get(i).pos;
            saveToFile("filename.txt", outputText, true);
        }
        for (int i = 0; i < 11; i++) {
        System.out.println(teamPlayers.get(i).getName() +
                " Jersey number: " + teamPlayers.get(i).getJerseyNum() +
                " Grade: " + teamPlayers.get(i).getGrade()+
                " Position: " + teamPlayers.get(i).pos);

    }
}

    private static void saveToFile(String filename, String text, boolean append) throws IOException{

        File file1 = new File(filename);

        FileWriter fw = new FileWriter(file1,append);

        PrintWriter pw = new PrintWriter(fw);

        pw.println(text);

        pw.close();

    }
}
