package man.boogey.client;

import man.boogey.BoogeymanFinder;
import man.boogey.MonsterBehavior;

import java.util.Arrays;
import java.util.Locale;

class BoogeymanFinderClientArgs {

    public static void main(String[] args) {
        if (args.length < 5) {
            String usage = "Usage: java BoogeymanFinder <height> <appearance> <name> <behavior> <target>";
            String example = "Example: java BoogeymanFinder 8 masked Jason ATTACK counselors ";
            String note1 = String.format("Height must be %s to %s", BoogeymanFinder.MIN_HEIGHT, BoogeymanFinder.MAX_HEIGHT);
            String note2 = "Note: supported behaviors are " + Arrays.toString(MonsterBehavior.values());
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note1);
            System.out.println(note2);
            return;
        }

        int height = Integer.parseInt(args[0]);
        String appearance = args[1];
        String name = args[2];
        MonsterBehavior behavior = MonsterBehavior.valueOf(args[3].toUpperCase());
        String target = args[4];

        BoogeymanFinder boogeyman = new BoogeymanFinder(height, appearance, name, behavior, target);
        System.out.println(boogeyman);
        System.out.println("Congratulations on your Boogeyman identification! Now...RUN!!");

    }
}