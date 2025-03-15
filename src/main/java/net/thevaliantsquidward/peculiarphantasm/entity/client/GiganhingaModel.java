package net.thevaliantsquidward.peculiarphantasm.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.thevaliantsquidward.peculiarphantasm.PeculiarPhantasm;
import net.thevaliantsquidward.peculiarphantasm.entity.custom.Giganhinga;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class GiganhingaModel extends GeoModel<Giganhinga> {

    @Override
    public ResourceLocation getModelResource(Giganhinga animatable) {
        return new ResourceLocation(PeculiarPhantasm.MOD_ID, "geo/giganhinga.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Giganhinga animatable) {
        return new ResourceLocation(PeculiarPhantasm.MOD_ID, "textures/entity/giganhinga.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Giganhinga animatable) {
        return new ResourceLocation(PeculiarPhantasm.MOD_ID, "animations/giganhinga.animation.json");
    }
    @Override
    public void setCustomAnimations(Giganhinga animatable, long instanceId, AnimationState<Giganhinga> animationState) {
        super.setCustomAnimations(animatable, instanceId, animationState);
        if (animationState == null) return;
        EntityModelData extraDataOfType = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
        //CoreGeoBone head = this.getAnimationProcessor().getBone("bone");

        //if (!animatable.isSprinting()) {
        //    head.setRotY(extraDataOfType.netHeadYaw() * Mth.DEG_TO_RAD);
        //}
    }

}