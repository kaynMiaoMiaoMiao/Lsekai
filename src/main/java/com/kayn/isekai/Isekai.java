package com.kayn.isekai;


import com.kayn.isekai.group.IsekaiGroup;
import com.kayn.isekai.item.IsekaiItem;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Isekai implements ModInitializer {

	public static final String MOD_ID = "isekai";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		IsekaiItem.initialize();

		IsekaiGroup.initialize();

		LOGGER.info("Hello Fabric world!");

	}
}