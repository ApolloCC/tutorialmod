package apollocc.tutorialmod;

import apollocc.tutorialmod.util.RegistryUtil;
import apollocc.tutorialmod.TutorialMod;
import apollocc.tutorialmod.item.ItemTutorialSword;
import apollocc.tutorialmod.materials.TutorialMaterials;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = TutorialMod.MODID)
public class RegistrationHandler {

	@SubscribeEvent
	public static void registerItems(Register<Item> event) {
		final Item[] items = {
				RegistryUtil.setItemName(new Item(), "first_item").setCreativeTab(CreativeTabs.MISC),
				
				RegistryUtil.setItemName(new ItemTutorialSword(TutorialMaterials.TUTORIAL_TOOL), "tutorial_sword").setCreativeTab(CreativeTabs.COMBAT),
		};

		event.getRegistry().registerAll(items);
	}

}
