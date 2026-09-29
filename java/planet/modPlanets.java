package planet;

import arc.graphics.Color;
import mindustry.content.Planets;
import mindustry.graphics.g3d.HexMesh;
import mindustry.type.Planet;

public class modPlanets {

    public static Planet selena;

    public static void load() {

        selena = new Planet("selena", Planets.serpulo, 0.4f, 1) {{
            generator = new selenaGenerator();

            meshLoader = () -> new HexMesh(this, 5);

            hasAtmosphere = true;
            atmosphereColor = Color.valueOf("6fa66b");
            atmosphereRadIn = 0.01f;
            atmosphereRadOut = 0.18f;

            iconColor = Color.valueOf("75b86d");

            alwaysUnlocked = true;

            startSector = 1;
        }};
    }
}
