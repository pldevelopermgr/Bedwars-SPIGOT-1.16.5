package bw.cup;

import java.io.File;
import java.text.SimpleDateFormat;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public class Cup 
{
	
	private String name;
	private double version;
	private Location lobby;
	private Player owner;
	private SimpleDateFormat cup_date;
	private File cup_dialogues;
	private int min_participants;
	private int max_participants;
	private CupBanlist banlist;
	private CupWhitelist whitelist;

}
