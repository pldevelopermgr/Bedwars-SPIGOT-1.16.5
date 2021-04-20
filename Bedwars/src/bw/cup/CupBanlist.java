package bw.cup;

import java.util.ArrayList;

import org.bukkit.entity.Player;

public class CupBanlist 
{
	private final ArrayList<Player> content;
	
	public CupBanlist(String pattern)
	{
		this.content = this.init(pattern);
	}
	
	private ArrayList<Player> init(String pattern)
	{
		if(pattern.contains(" "))
		{
			pattern.replaceAll(" ", "");
		}
		String[] res1;
		String content_part1 = "";
		if(pattern.contains(":"))
		{
			res1 = pattern.split(":");
			for(int i = 0; i<=res1.length; i++)
			{
				if(!res1[i].contains("cup-banlist"))
				{
					content_part1 = res1[i];
				}
			}
		}
		if(content_part1.contains("$enabled"))
		{
			
		}
		else 
		{
			return null;
		}
	}

}
