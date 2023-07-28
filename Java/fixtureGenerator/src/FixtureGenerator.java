import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class FixtureGenerator {
    private List<String> teams;

    public FixtureGenerator(List<String> teams) {
        this.teams = teams;
    }

    public List<String> generateFixtures() {
        List<String> fixtures = new ArrayList<>();

        // Eğer takım sayısı tek ise "Bay" takımı eklenir
        if (teams.size() % 2 != 0) {
            teams.add("Bay");
        }

        int totalWeeks = teams.size() - 1;
        int matchesPerWeek = teams.size() / 2;

        for (int week = 0; week < totalWeeks; week++) {
            List<String> matches = new ArrayList<>();

            for (int i = 0; i < matchesPerWeek; i++) {
                String homeTeam = teams.get(i);
                String awayTeam = teams.get(teams.size() - 1 - i);

                // "Bay" takımı ile eşleşen takımlar için maç yoktur
                if (!homeTeam.equals("Bay") && !awayTeam.equals("Bay")) {
                    matches.add(homeTeam + " vs " + awayTeam);
                }
            }

            Collections.shuffle(matches, new Random()); // Maçları rastgele sırala
            fixtures.addAll(matches);
            rotateTeams(); // Takımları döndürerek farklı eşleşmeler oluştur
        }

        return fixtures;
    }
    private void rotateTeams() {
        String lastTeam = teams.get(teams.size() - 1);

        // Son takımı hariç tüm takımları bir sağa kaydır
        for (int i = teams.size() - 1; i > 1; i--) {
            teams.set(i, teams.get(i - 1));
        }

        teams.set(1, lastTeam); // Son takımı listenin ikinci elemanı yap
    }
}

