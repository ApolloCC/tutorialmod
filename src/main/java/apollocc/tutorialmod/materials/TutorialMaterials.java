package apollocc.tutorialmod.materials;

import apollocc.tutorialmod.TutorialMod;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class TutorialMaterials {

	public static final ToolMaterial TUTORIAL_TOOL = EnumHelper.addToolMaterial(TutorialMod.MODID + ":" + "tutorial_tool", 2, 16250, 20.0F, 6.5F, 20);
	
}
