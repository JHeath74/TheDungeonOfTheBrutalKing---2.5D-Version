package ARTDSpells;

import java.util.Random;

import AlternateRealityTheDungeon.ARTDCharecter;
import AlternateRealityTheDungeon.ARTDSingleton;
import AlternateRealityTheDungeon.ARTDSpells;

public class ARTDCold_Blast extends ARTDSpells
{
	
	//Damaged Base off of intelligence or Wisdom
	
	public ARTDCold_Blast() 
	{
		name = "Cold Blast";
		requiredint = 30;
		requiredwis = 30;
		intelligence = myChar.myCharSingleton().CharInfo.get(8).toString();
		wisdom = myChar.myCharSingleton().CharInfo.get(8).toString();

		
	}

}
