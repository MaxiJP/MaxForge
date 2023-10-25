package dev.maxprime.maxseeds;

import dev.maxprime.maxseeds.proxy.CommonProxy;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MaxSeedsForge.MODID, version = MaxSeedsForge.VERSION)
public class MaxSeedsForge
{
    public static final String MODID = "maxseeds";
    public static final String VERSION = "b1024";

    @Mod.Instance(MODID)
    public static MaxSeedsForge instance;

    @SidedProxy(modId=MODID, clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit();
        System.out.println("MaxForge pre-init!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
        System.out.println("MaxForge init!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println("MaxForge post-init!");
    }

}
