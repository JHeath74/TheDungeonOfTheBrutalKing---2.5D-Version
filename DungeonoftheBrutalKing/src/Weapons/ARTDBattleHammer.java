package Weapons;

import DungeonoftheBrutalKing.Singleton;
import DungeonoftheBrutalKing.Weapons;

public class ARTDBattleHammer extends Weapons {

	public ARTDBattleHammer() {
		name = "Battle Hammer";
		requiredStrength = 35;
		charStrength = Singleton.myCharSingleton().CharInfo.get(7).toString();
	}

}
