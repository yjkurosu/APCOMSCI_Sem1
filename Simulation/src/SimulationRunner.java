/**
 * Created by cooperg2832 on 5/19/2017.
 */
import java.util.Scanner;
public class SimulationRunner extends PlayerDatabase {



    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args)
    {

        Time t1 = new Time();
        Simulation s1 = new Simulation();
        PlayerDatabase HOME = new PlayerDatabase();
        PlayerDatabase AWAY = new PlayerDatabase();
        System.out.println("Pick a home team from the following: \nWarriors \nCavaliers \nLakers \nSpurs \nThunder \nBulls \nCeltics \nKnicks \nRaptors \nHeat");
        String home = kb.nextLine();
        System.out.println("Pick an away team from the following: \nWarriors\nCavaliers\nLakers\nSpurs\nThunder\nBulls\nCeltics\nKnicks\nRaptors\nHeat");
        String away = kb.nextLine();
        s1.gamescore(s1, HOME.returnTeam(home), AWAY.returnTeam(away));
        System.out.println(HOME.returnTeam(home).getName() + "  " + s1 + "  " + AWAY.returnTeam(away).getName());





    }

}