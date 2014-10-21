package powercrystals.powerconverters.common;

import powercrystals.powerconverters.power.PowerSystem;
import net.minecraftforge.common.util.ForgeDirection;

public class BridgeSideData {
	public ForgeDirection side;
	public PowerSystem powerSystem;
	public boolean isConsumer;
	public boolean isProducer;
	public boolean isConnected;
	public int voltageNameIndex;
	public double outputRate;
}
