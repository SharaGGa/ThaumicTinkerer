package com.nekokittygames.thaumictinkerer.common.tileentity;

import com.nekokittygames.thaumictinkerer.common.tileentity.TileEntityMagnet;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;

import java.util.function.Predicate;

public class TileEntityItemMagnet extends TileEntityMagnet {



    @Override
    public <T extends Entity>Predicate selectedEntities() {
        return  o -> o instanceof EntityItem;
    }

    protected boolean filterEntity(Entity entity) {
        if(entity.getEntityData().hasKey("PreventRemoteMovement"))
            return !entity.getEntityData().getBoolean("PreventRemoteMovement");
        return true;
    }
}