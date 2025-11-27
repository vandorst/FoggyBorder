package dev.louis.foggyborder.client;

import com.mojang.logging.LogUtils;
import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;

public class FoggyBorder implements ClientModInitializer {
    public static final Logger LOGGER = LogUtils.getLogger();

    /**
     * Runs the mod initializer on the client environment.
     */
    @Override
    public void onInitializeClient() {
        LOGGER.info("Foggy Border initialised");
    }
}
