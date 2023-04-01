package io.github.tanguygab.cctv.Events;

import io.github.tanguygab.cctv.entities.Camera;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

import java.util.List;

public class SwitchCameraEvent extends PlayerEvent implements Cancellable {

    private boolean cancel = false;

    public List<Camera> cameras;
    public static HandlerList handlerList = new HandlerList();

    public SwitchCameraEvent(Player who,List<Camera> cameras) {
        super(who);

        this.cameras = cameras;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }

    @Override
    public boolean isCancelled() {
        return cancel;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }
}
