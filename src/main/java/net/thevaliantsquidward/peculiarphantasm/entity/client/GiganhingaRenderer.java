package net.thevaliantsquidward.peculiarphantasm.entity.client;


import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.thevaliantsquidward.peculiarphantasm.PeculiarPhantasm;
import net.thevaliantsquidward.peculiarphantasm.entity.custom.Giganhinga;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class GiganhingaRenderer extends GeoEntityRenderer<Giganhinga> {
    public GiganhingaRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new GiganhingaModel());
    }

    @Override
    public ResourceLocation getTextureLocation(Giganhinga animatable) {
        return new ResourceLocation(PeculiarPhantasm.MOD_ID, "textures/entity/giganhinga.png");
    }

    @Override
    public void render(Giganhinga entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}