package mariano.rocha.MyItems;


import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemFood;
import net.minecraft.util.IIcon;

public class Tortilla extends ItemFood{

	public Tortilla(int i, int j, boolean b) {
		super(j,b);
		setUnlocalizedName("Tortilla");
	}
	//Load Icons and Textures Properly
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister)
	{
			this.itemIcon = par1IconRegister.registerIcon("mrochamod:" + (this.getUnlocalizedName().substring(5)));
	}
}