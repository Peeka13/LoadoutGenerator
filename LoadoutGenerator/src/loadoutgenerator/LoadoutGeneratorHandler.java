/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loadoutgenerator;

import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author samanthahohmann
 */
public class LoadoutGeneratorHandler {
    private static ArrayList<String> classes, scoutPrimaries, scoutSecondaries, scoutMelees,
            soldierPrimaries, soldierSecondaries, soldierMelees,
            pyroPrimaries, pyroSecondaries, pyroMelees,
            demoPrimaries, demoSecondaries, demoMelees,
            heavyPrimaries, heavySecondaries, heavyMelees,
            engiPrimaries, engiSecondaries, engiMelees,
            medicPrimaries, medicSecondaries, medicMelees,
            sniperPrimaries, sniperSecondaries, sniperMelees,
            spyPrimaries, spySecondaries, spyMelees, spyPDAs;
    
    public static boolean[] enabled;
    private static Random r;
    
    public static void load()
    {
        classes = new ArrayList<String>();
        classes.add("Scout");
        classes.add("Soldier");
        classes.add("Pyro");
        classes.add("Demoman");
        classes.add("Heavy");
        classes.add("Engineer");
        classes.add("Medic");
        classes.add("Sniper");
        classes.add("Spy");
        
        scoutPrimaries = new ArrayList<String>();
        scoutPrimaries.add("Scattergun");
	scoutPrimaries.add("Force-A-Nature");
	scoutPrimaries.add("Shortstop");
	scoutPrimaries.add("Soda Popper");
	scoutPrimaries.add("Baby Face's Blaster");
	scoutPrimaries.add("Back Scatter");
        
        scoutSecondaries = new ArrayList<String>();
        scoutSecondaries.add("Pistol");
	scoutSecondaries.add("Bonk! Atomic Punch");
	scoutSecondaries.add("Winger");
	scoutSecondaries.add("Pretty Boy's Pocket Pistol");
	scoutSecondaries.add("Flying Guillotine");
	scoutSecondaries.add("Crit-a-Cola");
	scoutSecondaries.add("Mad Milk");
        
        scoutMelees = new ArrayList<String>();
        scoutMelees.add("Bat");
	scoutMelees.add("Sandman");
	scoutMelees.add("Holy Mackerel");
	scoutMelees.add("Candy Cane");
	scoutMelees.add("Boston Basher");
	scoutMelees.add("Sun-on-a-Stick");
	scoutMelees.add("Fan O'War");
	scoutMelees.add("Atomizer");
	scoutMelees.add("Wrap Assassin");
        
        soldierPrimaries = new ArrayList<String>();
        soldierPrimaries.add("Rocket Launcher");
	soldierPrimaries.add("Direct Hit");
	soldierPrimaries.add("Original");
	soldierPrimaries.add("Black Box");
	soldierPrimaries.add("Rocket Jumper");
	soldierPrimaries.add("Liberty Launcher");
	soldierPrimaries.add("Cow Mangler 5000");
	soldierPrimaries.add("Beggar's Bazooka");
	soldierPrimaries.add("Air Strike");
        
        soldierSecondaries = new ArrayList<String>();
        soldierSecondaries.add("Shotgun");
	soldierSecondaries.add("Buff Banner");
	soldierSecondaries.add("Reserve Shooter");
	soldierSecondaries.add("Gunboats");
	soldierSecondaries.add("Battalion's Backup");
	soldierSecondaries.add("Concheror");
	soldierSecondaries.add("Mantreads");
	soldierSecondaries.add("Righteous Bison");
	soldierSecondaries.add("B.A.S.E. Jumper");
	soldierSecondaries.add("Panic Attack");
        
        soldierMelees = new ArrayList<String>();
        soldierMelees.add("Shovel");
	soldierMelees.add("Equalizer");
	soldierMelees.add("Escape Plan");
	soldierMelees.add("Market Gardener");
	soldierMelees.add("Disciplinary Action");
	soldierMelees.add("Pain Train");
	soldierMelees.add("Half-Zatoichi");
        
        pyroPrimaries = new ArrayList<String>();
        pyroPrimaries.add("Flame Thrower");
	pyroPrimaries.add("Backburner");
	pyroPrimaries.add("Degreaser");
	pyroPrimaries.add("Phlogistinator");
	pyroPrimaries.add("Rainblower");
        
        pyroSecondaries = new ArrayList<String>();
        pyroSecondaries.add("Shotgun");
	pyroSecondaries.add("Flare Gun");
	pyroSecondaries.add("Reserve Shooter");
	pyroSecondaries.add("Detonator");
	pyroSecondaries.add("Manmelter");
	pyroSecondaries.add("Scorch Shot");
	pyroSecondaries.add("Panic Attack");
        
        pyroMelees = new ArrayList<String>();
        pyroMelees.add("Fire Axe");
	pyroMelees.add("Axtinguisher");
	pyroMelees.add("Homewrecker");
	pyroMelees.add("Back Scratcher");
	pyroMelees.add("Neon Annihilator");
	pyroMelees.add("Lollichop");
	pyroMelees.add("Powerjack");
	pyroMelees.add("Sharpened Volcano Fragment");
	pyroMelees.add("Third Degree");
        
        demoPrimaries = new ArrayList<String>();
        demoPrimaries.add("Grenade Launcher");
	demoPrimaries.add("Loch-n-Load");
	demoPrimaries.add("Loose Cannon");
	demoPrimaries.add("Ali Baba's Wee Booties");
	demoPrimaries.add("B.A.S.E. Jumper");
	demoPrimaries.add("Iron Bomber");
        
        demoSecondaries = new ArrayList<String>();
        demoSecondaries.add("Stickybomb Launcher");
	demoSecondaries.add("Scottish Resistance");
	demoSecondaries.add("Sticky Jumper");
	demoSecondaries.add("Chargin' Targe");
	demoSecondaries.add("Splendid Screen");
	demoSecondaries.add("Tide Turner");
	demoSecondaries.add("Quickiebomb Launcher");
        
        demoMelees = new ArrayList<String>();
        demoMelees.add("Bottle");
	demoMelees.add("Eyelander");
	demoMelees.add("Claidheamh Mor");
	demoMelees.add("Persian Persuader");
	demoMelees.add("Pain Train");
	demoMelees.add("Half-Zatoichi");
	demoMelees.add("Scotsman's Skullcutter");
	demoMelees.add("Ullapool Caber");
        
        heavyPrimaries = new ArrayList<String>();
        heavyPrimaries.add("Minigun");
	heavyPrimaries.add("Natascha");
	heavyPrimaries.add("Brass Beast");
	heavyPrimaries.add("Tomislav");
	heavyPrimaries.add("Huo-Long Heater");
        
        heavySecondaries = new ArrayList<String>();
        heavySecondaries.add("Shotgun");
	heavySecondaries.add("Family Business");
	heavySecondaries.add("Sandvich");
	heavySecondaries.add("Dalokohs Bar");
	heavySecondaries.add("Buffalo Steak Sandvich");
	heavySecondaries.add("Panic Attack");
        
        heavyMelees = new ArrayList<String>();
        heavyMelees.add("Fists");
	heavyMelees.add("Killing Gloves of Boxing");
	heavyMelees.add("Gloves of Running Urgently");
	heavyMelees.add("Fists of Steel");
	heavyMelees.add("Eviction Notice");
	heavyMelees.add("Warrior's Spirit");
	heavyMelees.add("Holiday Punch");
        
        engiPrimaries = new ArrayList<String>();
        engiPrimaries.add("Shotgun");
	engiPrimaries.add("Frontier Justice");
	engiPrimaries.add("Widowmaker");
	engiPrimaries.add("Pomson 6000");
	engiPrimaries.add("Rescue Ranger");
	engiPrimaries.add("Panic Attack");
        
        engiSecondaries = new ArrayList<String>();
        engiSecondaries.add("Pistol");
	engiSecondaries.add("Wrangler");
	engiSecondaries.add("Short Circuit");
        
        engiMelees = new ArrayList<String>();
        engiMelees.add("Wrench");
	engiMelees.add("Gunslinger");
	engiMelees.add("Jag");
	engiMelees.add("Southern Hospitality");
	engiMelees.add("Eureka Effect");
        
        medicPrimaries = new ArrayList<String>();
        medicPrimaries.add("Syringe Gun");
	medicPrimaries.add("Blutsauger");
	medicPrimaries.add("Crusader's Crossbow");
	medicPrimaries.add("Overdose");
        
        medicSecondaries = new ArrayList<String>();
        medicSecondaries.add("Medi Gun");
	medicSecondaries.add("Kritzkrieg");
	medicSecondaries.add("Quick-Fix");
	medicSecondaries.add("Vaccinator");
        
        medicMelees = new ArrayList<String>();
        medicMelees.add("Bonesaw");
	medicMelees.add("Ubersaw");
	medicMelees.add("Vita-Saw");
	medicMelees.add("Amputator");
	medicMelees.add("Solemn Vow");
        
        sniperPrimaries = new ArrayList<String>();
        sniperPrimaries.add("Sniper Rifle");
	sniperPrimaries.add("Huntsman");
	sniperPrimaries.add("Bazaar Bargain");
	sniperPrimaries.add("Sydney Sleeper");
	sniperPrimaries.add("Hitman's Heatmaker");
	sniperPrimaries.add("Machina");
	sniperPrimaries.add("Classic");
        
        sniperSecondaries = new ArrayList<String>();
        sniperSecondaries.add("SMG");
	sniperSecondaries.add("Jarate");
	sniperSecondaries.add("Razorback");
	sniperSecondaries.add("Darwin's Danger Shield");
	sniperSecondaries.add("Cleaner's Carbine");
	sniperSecondaries.add("Cozy Camper");
        
        sniperMelees = new ArrayList<String>();
        sniperMelees.add("Kukri");
	sniperMelees.add("Tribalman's Shiv");
	sniperMelees.add("Bushwacka");
	sniperMelees.add("Shahanshah");
        
        spyPrimaries = new ArrayList<String>();
        spyPrimaries.add("Revolver");
        spyPrimaries.add("Ambassador");
        spyPrimaries.add("L'Etranger");
        spyPrimaries.add("Enforcer");
        spyPrimaries.add("Diamondback");
        
        spySecondaries = new ArrayList<String>();
        spySecondaries.add("Sapper");
        spySecondaries.add("Red-Tape Recorder");
        
        spyMelees = new ArrayList<String>();
        spyMelees.add("Knife");
	spyMelees.add("Your Eternal Reward");
	spyMelees.add("Big Earner");
	spyMelees.add("Spy-cicle");
	spyMelees.add("Conniver's Kunai");
        
        spyPDAs = new ArrayList<String>();
        spyPDAs.add("Invis Watch");
        spyPDAs.add("Cloak and Dagger");
        spyPDAs.add("Dead Ringer");
        
        r = new Random();
        
        enabled = new boolean[9];
        for(int i = 0; i < enabled.length; i++)
        {
            enabled[i] = true;
        }
        
    }
    
    public static void toggleEnabled(int index)
    {
        enabled[index] = !enabled[index];
    }
    
    
    public static Loadout generate()
    {
        int gClassIndex = r.nextInt(classes.size());
        while(!enabled[gClassIndex])
        {
            gClassIndex = r.nextInt(classes.size());
        }
        String gClass = classes.get(gClassIndex);
        String gPrimary = "";
        String gSecondary = "";
        String gMelee = "";
        String gPDA = "";
        switch(gClassIndex)
        {
            case 0:
                gPrimary = scoutPrimaries.get(r.nextInt(scoutPrimaries.size()));
                gSecondary = scoutSecondaries.get(r.nextInt(scoutSecondaries.size()));
                gMelee = scoutMelees.get(r.nextInt(scoutMelees.size()));
                break;
            case 1:
                gPrimary = soldierPrimaries.get(r.nextInt(soldierPrimaries.size()));
                gSecondary = soldierSecondaries.get(r.nextInt(soldierSecondaries.size()));
                gMelee = soldierMelees.get(r.nextInt(soldierMelees.size()));
                break;
            case 2:
                gPrimary = pyroPrimaries.get(r.nextInt(pyroPrimaries.size()));
                gSecondary = pyroSecondaries.get(r.nextInt(pyroSecondaries.size()));
                gMelee = pyroMelees.get(r.nextInt(pyroMelees.size()));
                break;
            case 3:
                gPrimary = demoPrimaries.get(r.nextInt(demoPrimaries.size()));
                gSecondary = demoSecondaries.get(r.nextInt(demoSecondaries.size()));
                gMelee = demoMelees.get(r.nextInt(demoMelees.size()));
                break;
            case 4:
                gPrimary = heavyPrimaries.get(r.nextInt(heavyPrimaries.size()));
                gSecondary = heavySecondaries.get(r.nextInt(heavySecondaries.size()));
                gMelee = heavyMelees.get(r.nextInt(heavyMelees.size()));
                break;
            case 5:
                gPrimary = engiPrimaries.get(r.nextInt(engiPrimaries.size()));
                gSecondary = engiSecondaries.get(r.nextInt(engiSecondaries.size()));
                gMelee = engiMelees.get(r.nextInt(engiMelees.size()));
                break;
            case 6:
                gPrimary = medicPrimaries.get(r.nextInt(medicPrimaries.size()));
                gSecondary = medicSecondaries.get(r.nextInt(medicSecondaries.size()));
                gMelee = medicMelees.get(r.nextInt(medicMelees.size()));
                break;
            case 7:
                gPrimary = sniperPrimaries.get(r.nextInt(sniperPrimaries.size()));
                gSecondary = sniperSecondaries.get(r.nextInt(sniperSecondaries.size()));
                gMelee = sniperMelees.get(r.nextInt(sniperMelees.size()));
                break;
            case 8:
                gPrimary = spyPrimaries.get(r.nextInt(spyPrimaries.size()));
                gSecondary = spySecondaries.get(r.nextInt(spySecondaries.size()));
                gMelee = spyMelees.get(r.nextInt(spyMelees.size()));
                gPDA = spyPDAs.get(r.nextInt(spyPDAs.size()));
                break;
                       
        }
        return new Loadout(gClass, gPrimary, gSecondary, gMelee, gPDA);
        
        
    }
}
