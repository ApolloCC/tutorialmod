package apollocc.tutorialmod.util;

import apollocc.tutorialmod.TutorialMod;
import net.minecraft.item.Item;

public class RegistryUtil {

	public static Item setItemName(final Item item, final String name) {
		item.setRegistryName(TutorialMod.MODID, name).setTranslationKey(TutorialMod.MODID + "." + name);
		return item;
	}
}
	

