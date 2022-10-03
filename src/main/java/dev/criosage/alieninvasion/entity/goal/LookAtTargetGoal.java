package dev.criosage.alieninvasion.entity.goal;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.mob.FlyingEntity;
import net.minecraft.entity.mob.GhastEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

import java.util.EnumSet;

public class LookAtTargetGoal extends Goal {
    private final FlyingEntity entity;

    public LookAtTargetGoal(FlyingEntity entity) {
        this.entity = entity;
        this.setControls(EnumSet.of(Goal.Control.LOOK));
    }

    @Override
    public boolean canStart() {
        return true;
    }

    @Override
    public boolean shouldRunEveryTick() {
        return true;
    }

    @Override
    public void tick() {
        if (this.entity.getTarget() == null) {
            Vec3d vec3d = this.entity.getVelocity();
            this.entity.setYaw(-((float) MathHelper.atan2(vec3d.x, vec3d.z)) * 57.295776f);
            this.entity.bodyYaw = this.entity.getYaw();
        } else {
            LivingEntity livingEntity = this.entity.getTarget();
            double d = 64.0;
            if (livingEntity.squaredDistanceTo(this.entity) < 4096.0) {
                double e = livingEntity.getX() - this.entity.getX();
                double f = livingEntity.getZ() - this.entity.getZ();
                this.entity.setYaw(-((float)MathHelper.atan2(e, f)) * 57.295776f);
                this.entity.bodyYaw = this.entity.getYaw();
            }
        }
    }
}
