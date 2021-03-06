package mcjty.rftools.blocks.shield.filters;

import mcjty.network.ByteBufConverter;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;

public interface ShieldFilter extends ByteBufConverter {
    public static final int ACTION_PASS = 0;            // Entities that match this filter can pass
    public static final int ACTION_SOLID = 1;           // Entities that match this filter are blocked
    public static final int ACTION_DAMAGE = 2;          // Entities that match this filter get damage (can be combined with solid)

    /// Return true if this entity matches the filter.
    boolean match(Entity entity);

    int getAction();

    void setAction(int action);

    String getFilterName();

    void readFromNBT(NBTTagCompound tagCompound);

    void writeToNBT(NBTTagCompound tagCompound);
}
