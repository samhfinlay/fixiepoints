package fixiepoints;

import java.util.ArrayList;

import static fixiepoints.data.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<parts> frames = new ArrayList<parts>();
        frames.add(new parts("all city", 10));
        frames.add(new parts("soma", 3));
        frames.add(new parts("affinity", 6));
        frames.add(new parts("10", 10));

        ArrayList<parts> cranks = new ArrayList<parts>();
        cranks.add(new parts("sugino 75", 10));
        cranks.add(new parts("sugino messenger", 7));
        cranks.add(new parts("sugino pista", 10));
        cranks.add(new parts("sram omnium", 1));
        cranks.add(new parts("10", 10));

        ArrayList<parts> wheels = new ArrayList<parts>();
        wheels.add(new parts("archetype", 4));
        wheels.add(new parts("arya", 8));
        wheels.add(new parts("mavic", 5));
        wheels.add(new parts("10", 10));

        ArrayList<parts> hubs = new ArrayList<parts>();
        hubs.add(new parts("phil wood", 10));
        hubs.add(new parts("origin 8", 3));
        hubs.add(new parts("dura ace", 9));
        hubs.add(new parts("10", 10));

        ArrayList<parts> footRetention = new ArrayList<parts>();
        footRetention.add(new parts("clipless", 8));
        footRetention.add(new parts("straps", 7));
        footRetention.add(new parts("none", 1));
        footRetention.add(new parts("10", 10));

        ArrayList<parts> brakes = new ArrayList<parts>();
        brakes.add(new parts("yes", 5));
        brakes.add(new parts("no", 10));
        brakes.add(new parts("10", 10));

        String[] build = new String[6];

        System.out.print("frameset?");
        build[0] = getInput();

        System.out.print("cranks?");
        build[1] = getInput();

        System.out.print("wheels?");
        build[2] = getInput();

        System.out.print("hubs?");
        build[3] = getInput();

        System.out.print("foot retention?");
        build[4] = getInput();

        System.out.print("brakes?");
        build[5] = getInput();

        toLowerCase(build);

        ArrayList[] type = new ArrayList[] {frames, cranks, wheels, hubs, footRetention, brakes};

        if (isSamsBike(build)) {
            System.out.print("Damn, nice ride, bro! 100/10");
            return;
        }

        int total = 0;
        for (int i = 0; i < build.length; i++) {
            total += partScore(type[i], build[i]);
        }
        total = total / 6;
        System.out.print("score: " + total + "/10");
    }
}
