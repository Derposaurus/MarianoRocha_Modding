package mariano.rocha;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler; // used in 1.6.2
//import cpw.mods.fml.common.Mod.PreInit;    // used in 1.5.2
//import cpw.mods.fml.common.Mod.Init;       // used in 1.5.2
//import cpw.mods.fml.common.Mod.PostInit;   // used in 1.5.2
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
//import cpw.mods.fml.common.network.NetworkMod; // not used in 1.7




@Mod(modid="MrochaMod", name="Mrocha Mod", version="1.1.1")
//@NetworkMod(clientSideRequired=true) // not used in 1.7
public class MrochaMod {

        // The instance of your mod that Forge uses.
        @Instance(value = "GenericModID")
        public static MrochaMod instance;
        
        // Says where the client and server 'proxy' code is loaded.
        @SidedProxy(clientSide="mariano.rocha.client.ClientProxy", serverSide="mariano.rocha.CommonProxy")
        public static CommonProxy proxy;
        
        @EventHandler // used in 1.6.2
        public void preInit(FMLPreInitializationEvent event) {
                // Stub Method
            MyCode.MyBlocks();
            MyCode.MyItems();
        }
        
        @EventHandler // used in 1.6.2
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();
                MyCode.MyRecipes();     
        }
        
        
        @EventHandler // used in 1.6.2
        //@PostInit   // used in 1.5.2
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method

        }
}
