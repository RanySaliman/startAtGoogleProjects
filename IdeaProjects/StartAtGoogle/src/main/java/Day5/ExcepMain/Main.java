package Day5.ExcepMain;
import Day5.Exc1.ConfigFile;

public class Main {
    public static void main(String[] args) {

        ConfigFile configFile = new ConfigFile();
        configFile.readFile("defaultConfig.txt");
    }
}