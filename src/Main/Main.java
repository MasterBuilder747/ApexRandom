package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] legends = {
                "Wraith",
                "Bangalore",
                "Gibraltar",
                "Lifeline",
                "Pathfinder",
                "Bloodhound",
                "Mirage",
                "Caustic",
                "Octane", //s1
                "Wattson", //s2
                "Crypto", //s3
                "Revenant", //s4
                "Loba", //s5
                "Rampart", //s6
                "Horizon" //s7
        };

        //high tier loot unless stated
        String[] map_worlds = {
                "Bloodhound's Trials",
                "Countdown",
                "Fragment East",
                "Fragment West", //mid
                "Harvester",
                "Hill Valley", //low
                "Launch Site",
                "Lava City",
                "Lava Fissure",
                "Overlook",
                "Refinery",
                "Staging",
                "Sorting Factory",
                "Spring's End", //mid
                "Survey Camp",
                "Thermal Station",
                "The Bridge", //low
                "The Dome",
                "The Epicenter",
                "The Geyser",
                "The Mining Pass", //low
                "The Rain Tunnel", //low
                "The Tree",
                "The Train Yard"
        };
        String[] map_worlds_high = {
                "Bloodhound's Trials",
                "Countdown",
                "Fragment East",
                "Harvester",
                "Launch Site",
                "Lava City",
                "Lava Fissure",
                "Overlook",
                "Refinery",
                "Staging",
                "Sorting Factory",
                "Survey Camp",
                "Thermal Station",
                "The Dome",
                "The Epicenter",
                "The Geyser",
                "The Tree",
                "The Train Yard"
        };
        String[] map_olympus = {
                "Agriculture Entry", //low
                "Antechamber", //low
                "Autumn Estates",
                "Bonzai Plaza", //mid
                "Arcadia Supercarrier",
                "Cargo Hold", //low
                "Central Turbine", //mid
                "Crossroads", //low
                "Defense Perimeter", //low
                "Docks",
                "Elysium",
                "Energy Depot",
                "Farmstead", //low
                "Grow Towers", //mid
                "Golden Gardens", //mid
                "Hammond Labs", //mid
                "Hydroponics", //?
                "Ivory Pass", //low
                "Lab Annex", //low
                "Maintenance", //low
                "Orbital Cannon Test Site",
                "Phase Gateway Central", //low
                "Phase Gateway West", //low
                "Primary Power Grid", //mid
                "Rift Aftermath",
                "Research Basin",
                "Secondary Power Grid", //low
                "Shipyard", //low
                "Solar Array", //mid
                "Supply Track", //low
                "The Reverie Lounge",
                "Underpass", //low
                "Velvet Oasis", //mid
                "Welcome Center", //low
                "Wildflower Meadow" //low
        };
        String[] map_olympus_high = {
                "Autumn Estates",
                "Arcadia Supercarrier",
                "Docks",
                "Elysium",
                "Energy Depot",
                "Orbital Cannon Test Site",
                "Rift Aftermath",
                "Research Basin",
                "The Reverie Lounge",
        };

        Scanner kb = new Scanner(System.in);
        System.out.println("Legend: " + random(legends));
        System.out.println();
        System.out.println("Olympus jump location: " + random(map_olympus));
        System.out.println("World's Edge jump location: " + random(map_worlds));
        System.out.println();
        System.out.println("Olympus jump location (high tier loot): " + random(map_olympus_high));
        System.out.println("World's Edge jump location (high tier loot): " + random(map_worlds));

        /*
        System.out.println("Are you jumpmaster?");
        System.out.print("(type any character if so, enter if not): ");
        String choice = kb.next();
        System.out.println();

        if (choice.length() > 0) {
            System.out.print("Map? (Olympus = o, World's Edge = w): ");
            String choice2 = kb.next();
            System.out.println();
            System.out.println("High tier loot only?");
            System.out.print("(type any character if yes, enter if no): ");
            String choice3 = kb.next();
            System.out.println();

            if (choice3.length() > 0) {
                if (choice2.contains("o")) {
                    System.out.println("Olympus jump location (high tier loot): " + random(map_olympus_high));
                } else if (choice2.contains("w")) {
                    System.out.println("World's Edge jump location (high tier loot): " + random(map_worlds));
                } else {
                    System.out.println("invalid input character for map selection.");
                }
            } else {
                if (choice2.contains("o")) {
                    System.out.println("Olympus jump location: " + random(map_olympus));
                } else if (choice2.contains("w")) {
                    System.out.println("World's Edge jump location: " + random(map_worlds));
                } else {
                    System.out.println("invalid input character for map selection.");
                }
            }
        } else {
            System.exit(1);
        }
        */
    }

    public static String random(String[] a) {
        return a[(int)(Math.random() * a.length)];
    }
}
