package planet;

import mindustry.mod.Mod;

public class contentAddon extends Mod {

    public contentAddon() {
    }

    @Override
    public void loadContent() {
        modPlanets.load();
    }
}
