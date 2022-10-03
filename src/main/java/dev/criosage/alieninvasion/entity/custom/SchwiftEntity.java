package dev.criosage.alieninvasion.entity.custom;

import dev.criosage.alieninvasion.entity.ModEntities;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.passive.AbstractHorseEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class SchwiftEntity extends AbstractHorseEntity implements IAnimatable {
    //Properties
    private AnimationFactory factory = new AnimationFactory(this);
    //constructor
    public SchwiftEntity(EntityType<? extends AbstractHorseEntity> entityType, World world) {
        super(entityType, world);
    }
    //methods
    public static DefaultAttributeContainer.Builder setAttributes() {
        return createBaseHorseAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 15.0)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.20000000298023224);
    }
    protected void initAttributes(Random random) {
        this.getAttributeInstance(EntityAttributes.HORSE_JUMP_STRENGTH).setBaseValue(this.getChildJumpStrengthBonus(random));
    }
    public double getMountedHeightOffset() {
        return super.getMountedHeightOffset() - 0.1875;
    }
    protected float getBaseMovementSpeedMultiplier() {
        return 0.96F;
    }
    @Nullable
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return (PassiveEntity) ModEntities.SCHWIFT.create(world);
    }
    public ActionResult interactMob(PlayerEntity player, Hand hand) {
        if(this.hasPassengers()) return super.interactMob(player, hand);
        this.putPlayerOnBack(player);
        return ActionResult.success(this.world.isClient);
    }
    //Geckolib Methods
    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        event.getController().transitionLengthTicks = 0;
        if(event.isMoving()) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.schwift.walk", true));
            return PlayState.CONTINUE;
        }
        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.schwift.idle", true));
        return PlayState.CONTINUE;
    }
    @Override
    public void registerControllers(AnimationData animationData) {
        animationData.addAnimationController(new AnimationController(this, "controller",
                0, this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return factory;
    }
}
