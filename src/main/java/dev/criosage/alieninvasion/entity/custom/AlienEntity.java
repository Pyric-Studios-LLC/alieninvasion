package dev.criosage.alieninvasion.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.world.World;

public class AlienEntity extends HostileEntity {
    private static final TrackedData<Boolean> ATTACKING = DataTracker.registerData(AlienEntity.class,
            TrackedDataHandlerRegistry.BOOLEAN);
    protected AlienEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }
    @Override
    protected void initDataTracker() {
        super.initDataTracker();
        this.dataTracker.startTracking(ATTACKING, false);
    }
    public Boolean getAttackingState() {
        return this.dataTracker.get(ATTACKING);
    }
    public void setAttackingState(boolean attackingState) {
        this.dataTracker.set(ATTACKING, attackingState);
    }
}
