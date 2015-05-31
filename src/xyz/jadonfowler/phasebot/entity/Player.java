package xyz.jadonfowler.phasebot.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

import xyz.jadonfowler.phasebot.util.NameFetcher;

imoprt lombok.*;

@ToString(exclude={"pitch", "yaw"})
public class Player extends Entity {

	public static ArrayList<Player> players = new ArrayList<Player>();

	@Getter private UUID uuid;
	@Getter private String name;
	
	public Player(int i, UUID uuid, double x, double y, double z) {
		this(i, uuid, x, y, z, 0, 0);
	}

	public Player(int i, UUID uuid, double x, double y, double z, float yaw, float pitch) {
		super(i, "PLAYER", x, y, z);
		this.uuid = uuid;
		NameFetcher nf = new NameFetcher(Arrays.asList(uuid));
		try {
			name = nf.call().get(uuid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		players.add(this);
	}

	public static Player byUUID(UUID u) {
		for (Player p : players)
			if (p.getUUID().equals(u))
				return p;
		return null;
	}

}
