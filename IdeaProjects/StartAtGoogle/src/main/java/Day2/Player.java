package Day2;
import java.util.Random;
import static Day2.UniqueRandomNumbers.generateNum;

public class Player {
    String name;
    int jerseyNum;
    int grade;
    String pos;

    public Player(int position) {
        RandomRealName playerN = new RandomRealName();
        this.name = playerN.getFirstName();
//        this.name = playerN.getPoke();
        this.jerseyNum = generateNum();
        Random rand = new Random();
        this.grade = rand.nextInt((100));
        switch(position){
            case  1:
                this.pos = "GoalKeeper";
                break;
            case  2:
                this.pos = "Attacker";
                break;
            case  3:
                this.pos = "Defense";
                break;
            case  4:
                this.pos = "MiddleField";
                break;
        }
    }

    public static void makeGK(){
        Player player = new Player(1);
    }
    public static void makeAtt(){
        Player player = new Player(2);
    }
    public static void makeDef(){
        Player player = new Player(3);
    }
    public static void makeMid(){
        Player player = new Player(4);
    }

    public String getName() {
        return name;
    }

    public int getJerseyNum() {
        return jerseyNum;
    }

    public int getGrade() {
        return grade;
    }
}

