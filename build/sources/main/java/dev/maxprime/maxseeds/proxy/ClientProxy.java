package dev.maxprime.maxseeds.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.player.EntityPlayer;

public class ClientProxy extends CommonProxy{

    @Override
    public void registerRenders() {
        RenderManager rendermanager = Minecraft.getMinecraft().getRenderManager();
    }

    @Override
    public EntityPlayer getClientPlayer() {
        return Minecraft.getMinecraft().thePlayer;
    }

    @Override
    public boolean isSinglePlayer() {
        return Minecraft.getMinecraft().isSingleplayer();
    }

    @Override
    public boolean isDedicatedServer() {
        return false;
    }

    @Override
    public void preInit() {
        System.out.println("CommonProxy pre-init");
    }

    @Override
    public void init() {
        System.out.println("CommonProxy init");
    }

    @Override
    public void registerRenderInformation() {

    }

}
