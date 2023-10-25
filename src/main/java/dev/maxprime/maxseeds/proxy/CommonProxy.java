package dev.maxprime.maxseeds.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.INetHandler;
import net.minecraft.network.NetHandlerPlayServer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;

public class CommonProxy implements ProxyInterface{

    public void registerRenders() {

    }
    @Override
    public void registerRenderInformation() {

    }

    public World getClientWorld(){
        return null;
    }

    public EntityPlayer getClientPlayer() {
        return null;
    }
    @Override
    public EntityPlayer getPlayerFromHandler(INetHandler handler) {
        if (handler instanceof NetHandlerPlayServer) return ((NetHandlerPlayServer)handler).playerEntity;
        return null;
    }

    @Override
    public boolean isSinglePlayer() {
        return false;
    }
    @Override
    public boolean isDedicatedServer() {
        return MinecraftServer.getServer().isDedicatedServer();
    }

    @Override
    public void preInit() {
        System.out.println("CommonProxy pre-init");
    }

    public void init() {
        System.out.println("CommonProxy init");
    }

}
