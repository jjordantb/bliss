import java.util.ArrayList;
import java.util.List;

public class Npcs {

    public static Npc[] getLoaded() {
        final List<Npc> npcs = new ArrayList<>();
        for (Interactable interactable : Scene.getGraph().npcsIThink) {
            if (interactable instanceof Npc) {
                npcs.add((Npc) interactable);
            }
        }
        return npcs.toArray(new Npc[0]);
    }

}
