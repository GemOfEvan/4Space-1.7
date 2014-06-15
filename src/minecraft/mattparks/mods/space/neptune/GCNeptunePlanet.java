package mattparks.mods.space.neptune;

import mattparks.mods.space.core.ConfigManager;
import mattparks.mods.space.neptune.client.GCMapNeptune;
import micdoodle8.mods.galacticraft.api.world.IGalaxy;
import micdoodle8.mods.galacticraft.api.world.IMapObject;
import micdoodle8.mods.galacticraft.api.world.IPlanet;
import micdoodle8.mods.galacticraft.core.GalacticraftCore;
import net.minecraft.world.WorldProvider;

public class GCNeptunePlanet implements IPlanet
{
	private final IMapObject neptune = new GCMapNeptune();

	@Override
	public String getName()
	{
		return "Neptune";
	}

	@Override
	public boolean isReachable()
	{
		return false;
	}

	@Override
	public IGalaxy getParentGalaxy()
	{
		return GalacticraftCore.galaxyMilkyWay;
	}

	@Override
	public IMapObject getMapObject()
	{
		return this.neptune;
	}

	@Override
	public boolean autoRegister()
	{
		return false;
	}

	@Override
	public boolean addToList()
	{
		return false;
	}

	@Override
	public Class<? extends WorldProvider> getWorldProvider()
	{
		return null;
	}

	@Override
	public int getDimensionID()
	{
		return -1;
	}

	@Override
	public boolean forceStaticLoad()
	{
		return true;
	}
}
