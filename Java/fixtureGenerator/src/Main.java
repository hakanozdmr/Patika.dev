import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<String> teams = new ArrayList<>();
        teams.add("Team A");
        teams.add("Team B");
        teams.add("Team C");
        teams.add("Team D");

        FixtureGenerator fixtureGenerator = new FixtureGenerator(teams);
        List<String> fixtures = fixtureGenerator.generateFixtures();

        // Maç fikstürünü ekrana yazdır
        for (int week = 0; week < fixtures.size(); week++) {
            System.out.println("Week " + (week + 1) + ": " + fixtures.get(week));
        }
    }
}