package ogsettlementsize;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import necesse.engine.modLoader.annotations.ModEntry;
import necesse.inventory.recipe.Ingredient;
import necesse.level.maps.levelData.settlementData.SettlementBoundsManager;
import necesse.level.maps.levelData.settlementData.SettlementBoundsManager.FlagTierRegion;

@ModEntry
public class OgSettlementSize {
    public OgSettlementSize() {
    }

    public void init() {
        try {
            SettlementBoundsManager.flagTiers = new FlagTierRegion[]{
                    new FlagTierRegion(
                            (Ingredient[])null,
                            new Rectangle(-2, -2, 5, 5)
                    ),
                    new FlagTierRegion(
                            new Ingredient[]{new Ingredient("coin", 1)},
                            new Rectangle(-3, -3, 7, 7)
                    ),
                    new FlagTierRegion(
                            new Ingredient[]{new Ingredient("coin", 1)},
                            new Rectangle(-4, -4, 9, 9)
                    ),
                    new FlagTierRegion(
                            new Ingredient[]{new Ingredient("coin", 1)},
                            new Rectangle(-5, -5, 11, 11)
                    ),
                    new FlagTierRegion(
                            new Ingredient[]{new Ingredient("coin", 1)},
                            new Rectangle(-6, -6, 13, 13)
                    ),
                    new FlagTierRegion(
                            new Ingredient[]{new Ingredient("coin", 1)},
                            new Rectangle(-7, -7, 15, 15)
                    ),
                    new FlagTierRegion(
                            new Ingredient[]{new Ingredient("coin", 1)},
                            new Rectangle(-8, -8, 17, 17)
                    ),
                    new FlagTierRegion(
                            new Ingredient[]{new Ingredient("coin", 1)},
                            new Rectangle(-9, -9, 19, 19)
                    ),
                    new FlagTierRegion(
                            new Ingredient[]{new Ingredient("coin", 2500), new Ingredient("demonicbar", 40)},
                            new Rectangle(-10, -10, 21, 21)
                    ),
                    new FlagTierRegion(
                            new Ingredient[]{new Ingredient("coin", 5000), new Ingredient("frostshard", 20), new Ingredient("runestone", 20), new Ingredient("ivybar", 20), new Ingredient("quartz", 20)},
                            new Rectangle(-11, -11, 23, 23)
                    ),
                    new FlagTierRegion(
                            new Ingredient[]{new Ingredient("coin", 10000), new Ingredient("tungstenbar", 40)},
                            new Rectangle(-12, -12, 25, 25)
                    ),
                    new FlagTierRegion(
                            new Ingredient[]{new Ingredient("coin", 20000), new Ingredient("glacialbar", 20), new Ingredient("amber", 20), new Ingredient("myceliumbar", 20), new Ingredient("ancientfossilbar", 20)},
                            new Rectangle(-13, -13, 27, 27)
                    ),
                    new FlagTierRegion(new Ingredient[]{
                            new Ingredient("coin", 50000), new Ingredient("amethyst", 20), new Ingredient("sapphire", 20), new Ingredient("emerald", 20), new Ingredient("ruby", 20), new Ingredient("topaz", 20)},
                            new Rectangle(-14, -14, 29, 29)),
                    new FlagTierRegion(
                            new Ingredient[]{new Ingredient("coin", 100000), new Ingredient("shadowessence", 50), new Ingredient("cryoessence", 50), new Ingredient("bioessence", 50), new Ingredient("primordialessence", 50), new Ingredient("slimeessence", 50), new Ingredient("bloodessence", 50), new Ingredient("spideressence", 50)},
                            new Rectangle(-15, -15, 31, 31))
            };
        } catch (Exception e) {
            System.err.println("[OgSettlementSize] error occurred while initialising:\n" + e);
        }
    }
}
