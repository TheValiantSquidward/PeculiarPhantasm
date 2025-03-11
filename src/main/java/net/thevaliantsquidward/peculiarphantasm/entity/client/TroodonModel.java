package net.thevaliantsquidward.peculiarphantasm.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.thevaliantsquidward.peculiarphantasm.PeculiarPhantasm;
import net.thevaliantsquidward.peculiarphantasm.entity.custom.Troodon;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class TroodonModel extends GeoModel<Troodon> {

    @Override
    public ResourceLocation getModelResource(Troodon animatable) {
        return new ResourceLocation(PeculiarPhantasm.MOD_ID, "geo/troojohn.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Troodon animatable) {
        return new ResourceLocation(PeculiarPhantasm.MOD_ID, "textures/entity/troodon.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Troodon animatable) {
        return new ResourceLocation(PeculiarPhantasm.MOD_ID, "animations/troodon.animation.json");
    }
    @Override
    public void setCustomAnimations(Troodon animatable, long instanceId, AnimationState<Troodon> animationState) {
        super.setCustomAnimations(animatable, instanceId, animationState);
        if (animationState == null) return;
        EntityModelData extraDataOfType = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
        //CoreGeoBone head = this.getAnimationProcessor().getBone("bone");

        //if (!animatable.isSprinting()) {
        //    head.setRotY(extraDataOfType.netHeadYaw() * Mth.DEG_TO_RAD);
        //}
    }

}