public class DisasterRescueManagementSystem {

    static class RescueTeam {
        protected String teamId;
        protected String location;

        RescueTeam(String teamId, String location) {
            this.teamId = teamId;
            this.location = location;
        }

        void performDuty() {
            System.out.println(teamId + " is on standby at " + location);
        }
    }

    static class MedicalTeam extends RescueTeam {
        MedicalTeam(String teamId, String location) {
            super(teamId, location);
        }

        @Override
        void performDuty() {
            System.out.println(teamId + " provides emergency medical aid at " + location);
        }
    }

    static class FireRescueTeam extends RescueTeam {
        FireRescueTeam(String teamId, String location) {
            super(teamId, location);
        }

        @Override
        void performDuty() {
            System.out.println(teamId + " controls fire and evacuates people at " + location);
        }
    }

    static class FoodSupplyTeam extends RescueTeam {
        FoodSupplyTeam(String teamId, String location) {
            super(teamId, location);
        }

        @Override
        void performDuty() {
            System.out.println(teamId + " distributes food and water at " + location);
        }
    }

    static RescueTeam findTeamByLocation(RescueTeam[] teams, String location) {
        for (RescueTeam team : teams) {
            if (team.location.equalsIgnoreCase(location)) {
                return team;
            }
        }
        return null;
    }

    static void displayTeamsByPrefix(RescueTeam[] teams, String prefix) {
        System.out.println("Teams with ID prefix '" + prefix + "':");
        for (RescueTeam team : teams) {
            if (team.teamId.startsWith(prefix)) {
                System.out.println(team.teamId + " at " + team.location);
            }
        }
    }

    static void performAllDuties(RescueTeam[] teams) {
        for (RescueTeam team : teams) {
            team.performDuty();
        }
    }

    static void countTeamsByCategory(RescueTeam[] teams) {
        int medical = 0;
        int fireRescue = 0;
        int foodSupply = 0;

        for (RescueTeam team : teams) {
            if (team instanceof MedicalTeam) {
                medical++;
            } else if (team instanceof FireRescueTeam) {
                fireRescue++;
            } else if (team instanceof FoodSupplyTeam) {
                foodSupply++;
            }
        }

        System.out.println("Medical teams: " + medical);
        System.out.println("Fire rescue teams: " + fireRescue);
        System.out.println("Food supply teams: " + foodSupply);

        String maxCategory = "MedicalTeam";
        int max = medical;

        if (fireRescue > max) {
            max = fireRescue;
            maxCategory = "FireRescueTeam";
        }
        if (foodSupply > max) {
            max = foodSupply;
            maxCategory = "FoodSupplyTeam";
        }

        System.out.println("Category with maximum deployments: " + maxCategory + " (" + max + ")");
    }

    public static void main(String[] args) {
        RescueTeam[] teams = {
            new MedicalTeam("MED-01", "Zone-A"),
            new FireRescueTeam("FIRE-10", "Zone-B"),
            new FoodSupplyTeam("FOOD-21", "Zone-A"),
            new FireRescueTeam("FIRE-11", "Zone-C"),
            new MedicalTeam("MED-02", "Zone-D")
        };

        performAllDuties(teams);

        RescueTeam found = findTeamByLocation(teams, "Zone-C");
        if (found != null) {
            System.out.println("Found team at Zone-C: " + found.teamId);
        }

        displayTeamsByPrefix(teams, "FIRE");
        countTeamsByCategory(teams);
    }
}
