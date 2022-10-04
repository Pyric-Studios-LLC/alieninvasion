package dev.criosage.alieninvasion.entity.goal;

import dev.criosage.alieninvasion.entity.custom.AlienEntity;
import net.minecraft.entity.ai.goal.Goal;

import java.util.EnumSet;

public class IlgoidAttackGoal extends Goal {
    private final AlienEntity entity;
    public IlgoidAttackGoal(AlienEntity entity) {
        this.entity = entity;
        this.setControls(EnumSet.of(Goal.Control.MOVE, Goal.Control.LOOK));
    }
    @Override
    public boolean canStart() {
        return this.entity.getTarget() != null;
    }
    public void start() {
        super.start();
        this.entity.setAttacking(true);
    }
    public void stop() {
        super.stop();
        this.entity.setAttacking(false);
        this.entity.setAttackingState(false);
    }
}
