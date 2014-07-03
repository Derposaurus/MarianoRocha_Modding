package mariano.rocha;

//Recipes
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.registry.GameRegistry;

//MyBlocks Imports
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.ItemFood;

//My Blocks
import mariano.rocha.MyBlocks.RubyOre;
import mariano.rocha.MyBlocks.ButterOre;

//MyItems
import mariano.rocha.MyItems.RubyGem;
import mariano.rocha.MyItems.Tortilla;
import mariano.rocha.MyItems.CookedTortilla;
import mariano.rocha.MyItems.BeefTaco;
import mariano.rocha.MyItems.Quesadilla;
import mariano.rocha.MyItems.Cheese;
import mariano.rocha.MyItems.RawQuesadilla;
import mariano.rocha.MyItems.CurdledMilk;
import mariano.rocha.MyItems.Churro;
import mariano.rocha.MyItems.ChickenTaco;
import mariano.rocha.MyItems.Tostada;
import mariano.rocha.MyItems.Chips;
import mariano.rocha.MyItems.Nachos;
import mariano.rocha.MyItems.ColdNachos;

//MyTools
import net.minecraftforge.common.util.EnumHelper;
import mariano.rocha.MyItems.RubySword;

public class MyCode {

	// List Blocks Here #setupBlock
	public static Block rubyOre;
	public static Block ButterOre;

	// List Items Here #setupItem
	public static Item rubyGem;
	public static Item Tortilla;
	public static Item CookedTortilla;
	public static Item BeefTaco;
	public static Item Quesadilla;
	public static Item Cheese;
	public static Item RawQuesadilla;
	public static Item CurdledMilk;
	public static Item Churro;
	public static Item ChickenTaco;
	public static Item Tostada;
	public static Item Chips;
	public static Item Nachos;
	public static Item ColdNachos;

	// tools
	public static Item rubySword;
	public static Item.ToolMaterial RUBY = EnumHelper.addToolMaterial("RUBY",
			3, 800, 9.0F, 3.5F, 10);

	public static void MyBlocks() {
		// Blocks #setupBLOCK
		// rubyOre
		// ButterOre
		rubyOre = new RubyOre(Material.ground).setHardness(0.9F)
				.setStepSound(Block.soundTypeGravel).setBlockName("rubyOre")
				.setCreativeTab(CreativeTabs.tabBlock)
				.setBlockTextureName("redstone_ore");

		ButterOre = new RubyOre(Material.ground).setHardness(0.9F)
				.setStepSound(Block.soundTypeStone).setBlockName("ButterOre")
				.setCreativeTab(CreativeTabs.tabBlock)
				.setBlockTextureName("gold_ore");
		// Harvest Level

		// Register #setupBLOCK
		GameRegistry.registerBlock(rubyOre, "RubyOre");
		GameRegistry.registerBlock(ButterOre, "ButterOre");

	}

	public static void MyItems() {

		// ruby gem
		rubyGem = new RubyGem().setMaxStackSize(64)
				.setCreativeTab(CreativeTabs.tabMisc)
				.setUnlocalizedName("rubyGem");

		Tortilla = new Tortilla(8, 3, false);
		CookedTortilla = new CookedTortilla(12, 5, false);
		BeefTaco = new BeefTaco(20, 8 , true);
		Quesadilla = new Quesadilla(18, 8 , false);
		Cheese = new Cheese(4, 3 , false);
		RawQuesadilla = new RawQuesadilla(18, 8 , false);
		CurdledMilk = new CurdledMilk(0, 0, false);
		Churro = new Churro(8, 4, false);
		ChickenTaco = new ChickenTaco(20, 8 , true);
		Tostada = new Tostada(10, 4 , false);
		Chips = new Chips(5, 2 , false);
		Nachos = new Nachos(8, 4 , false);
		ColdNachos = new ColdNachos(8, 6 , false);

		rubySword = new RubySword(RUBY);

		GameRegistry.registerItem(BeefTaco, "BeefTaco");
		GameRegistry.registerItem(Tortilla, "tortilla");
		GameRegistry.registerItem(CookedTortilla, "CookedTortilla");
		GameRegistry.registerItem(rubyGem, "rubyGem");
		GameRegistry.registerItem(rubySword, "RubySword");
		GameRegistry.registerItem(Quesadilla, "Quesadilla");
		GameRegistry.registerItem(Cheese, "Cheese");
		GameRegistry.registerItem(RawQuesadilla, "RawQuesadilla");
		GameRegistry.registerItem(CurdledMilk, "CurdledMilk");
		GameRegistry.registerItem(Churro, "Churro");
		GameRegistry.registerItem(ChickenTaco, "ChickenTaco");
		GameRegistry.registerItem(Tostada, "Tostada");
		GameRegistry.registerItem(Chips, "Chips");
		GameRegistry.registerItem(Nachos, "Nachos");
		GameRegistry.registerItem(ColdNachos, "ColdNachos");

	}

	public static void MyRecipes() {
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.brown_mushroom),
				new Object[] { new ItemStack(Items.cookie) });
		GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond),
				new Object[] { new ItemStack(Blocks.dirt) });
		GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond),
				new Object[] { new ItemStack(Blocks.dirt) });

		GameRegistry.addRecipe(new ItemStack(Items.cookie), new Object[] {
				"AAA", "AAA", "AAA", 'A', Blocks.dirt });

		ItemStack lava = new ItemStack(Items.lava_bucket);
		ItemStack water = new ItemStack(Items.water_bucket);
		ItemStack obsidian = new ItemStack(Blocks.obsidian);

		GameRegistry.addShapelessRecipe(obsidian, lava, water);
		
		ItemStack taco = new ItemStack(BeefTaco);
		ItemStack tortilla = new ItemStack(CookedTortilla);
		ItemStack beef = new ItemStack(Items.cooked_beef);
		
		GameRegistry.addShapelessRecipe(taco, tortilla, beef);
		
		ItemStack ctaco = new ItemStack(ChickenTaco);
		ItemStack chicken = new ItemStack(Items.cooked_chicken);
		
		GameRegistry.addShapelessRecipe(taco, tortilla, chicken);
	
		GameRegistry.addShapelessRecipe(new ItemStack(Chips, 8),
				new Object[] { new ItemStack(Tostada) });

		
		ItemStack quesadilla = new ItemStack(RawQuesadilla);
		ItemStack shmoop = new ItemStack(Tortilla);
		ItemStack cheese = new ItemStack(Cheese);


		GameRegistry.addShapelessRecipe(taco, tortilla, cheese);
		
		ItemStack Cmalk = new ItemStack(CurdledMilk);
		ItemStack malk = new ItemStack(Items.milk_bucket);

		GameRegistry.addShapelessRecipe(Cmalk, malk, malk);
		
		ItemStack chee = new ItemStack(Cheese);

		GameRegistry.addShapelessRecipe(chee, Cmalk, Cmalk, Cmalk);
		
		ItemStack egg = new ItemStack(Items.egg);
		ItemStack pork = new ItemStack(Items.porkchop);
		ItemStack carrot = new ItemStack(Items.carrot);
		ItemStack spawn = new ItemStack(Items.spawn_egg);

		GameRegistry.addShapelessRecipe(spawn, carrot, pork, egg);

		ItemStack grass = new ItemStack(Blocks.grass);
		ItemStack cobble = new ItemStack(Blocks.cobblestone);
		ItemStack MossyCobble = new ItemStack(Blocks.mossy_cobblestone);

		GameRegistry.addShapelessRecipe(MossyCobble, grass, cobble);

		GameRegistry.addRecipe(new ItemStack(Blocks.bedrock), new Object[] {
				"SSS", "ODO", "EEE", 'S', Blocks.stone, 'O', Blocks.obsidian,
				'D', Blocks.diamond_ore, 'E', Blocks.emerald_block,

		});
		
		GameRegistry.addRecipe(new ItemStack(Churro), new Object[] {
			"SWS", "SWS", "SWS", 'S', Items.sugar, 'W', Items.wheat
	});
		GameRegistry.addRecipe(new ItemStack(ColdNachos), new Object[] {
			"NNN", "NCN", "NNN", 'N', Chips, 'C', Cheese
	});

		GameRegistry.addRecipe(new ItemStack(Blocks.sponge), new Object[] {
				"GGG", "OBO", "DDD", 'G', Blocks.gold_block, 'O',
				Blocks.obsidian, 'B', Items.bucket, 'D', Items.glowstone_dust,

		});
		GameRegistry.addRecipe(new ItemStack(Tortilla), new Object[] { " T ",
				"TTT", " T ", 'T', Items.wheat, });

		GameRegistry.addSmelting(Blocks.packed_ice,
				new ItemStack(Blocks.ice, 1), 0.1F);
		GameRegistry.addSmelting(Blocks.ice, new ItemStack(Blocks.water, 1),
				0.1F);
		GameRegistry.addSmelting(Blocks.soul_sand, new ItemStack(
				Blocks.mycelium, 1), 0.1F);

		GameRegistry.addSmelting(CookedTortilla, new ItemStack(Tostada,1),0.5F);
		GameRegistry.addSmelting(Tortilla, new ItemStack(CookedTortilla,1),0.5F);
		GameRegistry.addSmelting(RawQuesadilla, new ItemStack(Quesadilla,1),0.5F);
		GameRegistry.addSmelting(ColdNachos, new ItemStack(Nachos,1),0.5F);

		ItemStack newEnchantment = new ItemStack(Items.cooked_beef, 1);
		newEnchantment.addEnchantment(Enchantment.knockback, 127);
		GameRegistry.addSmelting(Items.cookie, newEnchantment, 0.01F);

		ItemStack boots = new ItemStack(Items.diamond_boots, 1);
		boots.addEnchantment(Enchantment.featherFalling, 127);
		GameRegistry.addSmelting(Items.diamond_boots, boots, 0.01F);
	}

}