package io.github.tanguygab.cctv.utils;

import io.github.tanguygab.cctv.CCTV;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;

public class BukkitEventCaller {

    public static boolean callEvent(Event event) {
        if (event == null) return false;
        CCTV.get().getServer().getPluginManager().callEvent(event);
        return event instanceof Cancellable cancellable &&
                cancellable.isCancelled();
    }

}
