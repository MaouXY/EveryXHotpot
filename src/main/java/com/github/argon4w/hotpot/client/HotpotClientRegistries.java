package com.github.argon4w.hotpot.client;

import com.github.argon4w.hotpot.client.contents.HotpotContentRenderers;
import com.github.argon4w.hotpot.client.contents.HotpotItemContentSpecialRenderers;
import com.github.argon4w.hotpot.client.contents.HotpotStrainerBasketContentRenderers;
import com.github.argon4w.hotpot.client.items.HotpotItemSpecialRenderers;
import com.github.argon4w.hotpot.client.items.sprites.colors.HotpotSpriteColorProviders;
import com.github.argon4w.hotpot.client.items.sprites.processors.HotpotSpriteProcessors;
import com.github.argon4w.hotpot.client.items.sprites.processors.providers.HotpotSpriteProcessorProviders;
import com.github.argon4w.hotpot.client.placements.HotpotPlacementRenderers;
import com.github.argon4w.hotpot.client.soups.effects.HotpotSoupClientTickEffects;
import com.github.argon4w.hotpot.client.soups.renderers.HotpotSoupCustomElementSerializers;
import net.neoforged.bus.api.IEventBus;

public class HotpotClientRegistries {

    public static void register(IEventBus modEventBus) {
        HotpotSoupCustomElementSerializers.CUSTOM_ELEMENT_RENDERER_SERIALIZERS.register(modEventBus);
        HotpotSoupClientTickEffects.SOUP_CLIENT_TICK_EFFECT_SERIALIZERS.register(modEventBus);
        HotpotContentRenderers.CONTENT_RENDERERS.register(modEventBus);
        HotpotStrainerBasketContentRenderers.STRAINER_BASKET_CONTENT_RENDERERS.register(modEventBus);
        HotpotItemContentSpecialRenderers.ITEM_CONTENT_SPECIAL_RENDERERS.register(modEventBus);
        HotpotPlacementRenderers.PLACEMENT_RENDERERS.register(modEventBus);
        HotpotItemSpecialRenderers.ITEM_SPECIAL_RENDERERS.register(modEventBus);
        HotpotSpriteProcessors.SPRITE_PROCESSORS.register(modEventBus);
        HotpotSpriteColorProviders.SPRITE_COLOR_PROVIDERS.register(modEventBus);
        HotpotSpriteProcessorProviders.SPRITE_PROCESSOR_PROVIDERS.register(modEventBus);
    }
}
