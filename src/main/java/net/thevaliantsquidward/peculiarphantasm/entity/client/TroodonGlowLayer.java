package net.thevaliantsquidward.peculiarphantasm.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.thevaliantsquidward.peculiarphantasm.PeculiarPhantasm;
import net.thevaliantsquidward.peculiarphantasm.entity.custom.Troodon;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoRenderer;
import software.bernie.geckolib.renderer.layer.GeoRenderLayer;

public class TroodonGlowLayer extends GeoRenderLayer<Troodon> {
    private static final ResourceLocation OVERLAY = new ResourceLocation(PeculiarPhantasm.MOD_ID, "textures/entity/troodoneyes.png");
    private static final ResourceLocation MODEL = new ResourceLocation(PeculiarPhantasm.MOD_ID, "geo/troojohn.geo.json");
    public TroodonGlowLayer(GeoRenderer<Troodon> entityRendererIn) {
        super(entityRendererIn);

    }

    public void render(PoseStack poseStack, Troodon entityLivingBaseIn, BakedGeoModel bakedModel, RenderType renderType, MultiBufferSource bufferSource, VertexConsumer buffer, float partialTick, int packedLight, int packedOverlay) {
            RenderType cameo = RenderType.eyes(OVERLAY);
            getRenderer().reRender(this.getGeoModel().getBakedModel(MODEL), poseStack, bufferSource, entityLivingBaseIn, renderType,
                    bufferSource.getBuffer(cameo), partialTick, packedLight, OverlayTexture.NO_OVERLAY,
                    1, 1, 1, 1);
    }
}