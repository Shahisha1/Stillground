package com.shahisha.stillground;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Stillground implements ModInitializer {
    public static final String MOD_ID = "stillground";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        StillgroundBlocks.register();
        LOGGER.info("Stillground is ready.");
    }
}
