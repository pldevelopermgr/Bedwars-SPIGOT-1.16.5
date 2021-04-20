package bw.cup;

import java.io.File;
import java.util.ArrayList;

public class PluginCupHandler {
	
	/*
	 * Loads a BW Cup from a file which should be on the server.
	 */
	
	public Cup loadCupFromFile(File f)
	{
		return null;
	}
	
	/*
	 * Loads all .bwcup files from a directory.
	 */
	
	public ArrayList<Cup> loadAllFromDir(File dir)
	{
		return null;
	}
	
	/*
	 * Default Cup File:
	 * 1| cup-name: <CupName>
	 * 2| cup-date: <Date>
	 * 3| cup-default-dialogues: <PathTo".cupdialogue"File>
	 * 4| cup-owner: <Playername/e-mail/normal-name/--> (if -- then the cup owner will be the server!)
	 * 5| min-players: <amount/whitelist/endl>
	 * 6| max-players: <amount/whitelist/endl>
	 * 7| cup-status: <Easy/Normal/Hard/{BW-Loot&FixEnchantSettings}>
	 */

}
