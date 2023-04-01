package io.github.tanguygab.cctv.Events;

import io.github.tanguygab.cctv.entities.Camera;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

public class CameraConnectEvent extends PlayerEvent implements Cancellable {

    public static HandlerList handlerList = new HandlerList();
    Camera camera;

    public CameraConnectEvent(Player who,Camera camera) {
        super(who);
        this.camera = camera;
    }

    public Camera getCamera() {
        return camera;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }

    private boolean cancel = false;

    @Override
    public boolean isCancelled() {
        return cancel;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }
}
