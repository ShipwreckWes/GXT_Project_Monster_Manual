package com.sencha.gxt.project.client;

import java.util.ArrayList;
import java.util.List;

public class MonsterData {
	public static List<Monsters> getMonsters() {
		List<Monsters> monsters = new ArrayList<Monsters>();

		monsters.add(new Monsters("Adult Red Dragon", "17", "18000", "natural armor", "19", "27", "8", "10", "0", "25",
				"7", "16", "3", "13", "1", "21", "5", "19d12 + 133", "256"));
		monsters.add(new Monsters("Stone Golem", "10", "5900", "natural armor", "17", "22", "6", "9", "-1", "20", "5",
				"3", "-4", "11", "0", "1", "-5", "17d10 + 85", "178"));
		monsters.add(new Monsters("Fire Giant", "9", "5000", "plate", "18", "25", "7", "9", "-1", "23", "6", "10", "0",
				"14", "2", "13", "1", "13d12 + 78", "162"));
		monsters.add(new Monsters("Hydra", "8", "3900", "natural armor", "15", "20", "5", "12", "1", "20", "5", "2",
				"-4", "10", "0", "7", "-2", "15d12 + 75", "172"));
		monsters.add(new Monsters("Frost Giant", "8", "3900", "patchwork armor", "15", "23", "6", "9", "-1", "21", "5",
				"9", "-1", "10", "0", "12", "1", "12d12 + 60", "138"));
		monsters.add(new Monsters("Young Green Dragon", "8", "3900", "natural armor", "18", "19", "4", "12", "1", "17",
				"3", "16", "3", "13", "1", "15", "2", "16d10 + 48", "136"));
		monsters.add(new Monsters("Tyrannosaurus Rex", "8", "3900", "natural armor", "13", "25", "7", "10", "0", "19",
				"4", "2", "-4", "12", "1", "9", "-1", "13d12 + 52", "136"));
		monsters.add(new Monsters("Giant Ape", "7", "2900", "no armor type", "12", "23", "6", "14", "2", "18", "4", "7",
				"-2", "12", "1", "7", "-2", "15d12 + 60", "157"));
		monsters.add(new Monsters("Cyclops", "6", "2300", "natural armor", "14", "22", "6", "11", "0", "20", "5", "8",
				"-1", "6", "-2", "10", "0", "12d12 + 60", "138"));
		monsters.add(new Monsters("Medusa", "6", "2300", "natural armor", "15", "10", "0", "15", "2", "16", "3", "12",
				"1", "13", "1", "15", "2", "17d8 + 51", "127"));
		monsters.add(new Monsters("Mammoth", "6", "2300", "natural armor", "13", "24", "7", "9", "-1", "21", "5", "3",
				"-4", "11", "0", "6", "-2", "11d12 + 55", "126"));
		monsters.add(new Monsters("Chimera", "6", "2300", "natural armor", "14", "19", "4", "11", "0", "19", "4", "3",
				"-4", "14", "2", "10", "0", "12d10 + 48", "114"));
		monsters.add(new Monsters("Wyvern", "6", "2300", "natural armor", "13", "19", "4", "10", "0", "16", "3", "5",
				"-3", "12", "1", "6", "-2", "13d10 + 39", "110"));
		monsters.add(new Monsters("Earth Elemental", "5", "1800", "natural armor", "17", "20", "5", "8", "-1", "20",
				"5", "5", "-3", "10", "0", "5", "-3", "12d10 + 60", "126"));
		monsters.add(new Monsters("Giant Shark", "5", "1800", "natural armor", "13", "23", "6", "11", "0", "21", "5",
				"1", "-5", "10", "0", "5", "-3", "11d12 + 55", "126"));
		monsters.add(new Monsters("Water Elemental", "5", "1800", "natural armor", "14", "18", "4", "14", "2", "18",
				"4", "5", "-3", "10", "0", "8", "-1", "12d10 + 48", "114"));
		monsters.add(new Monsters("Hill Giant", "5", "1800", "natural armor", "13", "21", "5", "8", "-1", "19", "4",
				"5", "-3", "9", "-1", "6", "-2", "10d12 + 40", "105"));
		monsters.add(new Monsters("Fire Elemental", "5", "1800", "no armor type", "13", "10", "0", "17", "3", "16", "3",
				"6", "-2", "10", "0", "7", "-2", "12d10 + 36", "102"));
		monsters.add(new Monsters("Triceratops", "5", "1800", "natural armor", "13", "22", "6", "9", "-1", "17", "3",
				"2", "-4", "11", "0", "5", "-3", "10d12 + 30", "95"));
		monsters.add(new Monsters("Flesh Golem", "5", "1800", "no armor type", "9", "19", "4", "9", "-1", "18", "4",
				"6", "-2", "10", "0", "5", "-3", "11d8 + 44", "93"));
		monsters.add(new Monsters("Air Elemental", "5", "1800", "no armor type", "15", "14", "2", "20", "5", "14", "2",
				"6", "-2", "10", "0", "6", "-2", "12d10 + 24", "90"));
		monsters.add(new Monsters("Giant Crocodile", "5", "1800", "natural armor", "14", "21", "5", "9", "-1", "17",
				"3", "2", "-4", "10", "0", "7", "-2", "9d12 + 27", "85"));
		monsters.add(new Monsters("Troll", "5", "1800", "natural armor", "15", "18", "4", "13", "1", "20", "5", "7",
				"-2", "9", "-1", "7", "-2", "8d10 + 40", "84"));
		monsters.add(new Monsters("Elephant", "4", "1100", "natural armor", "12", "22", "6", "9", "-1", "17", "3", "3",
				"-4", "11", "0", "6", "-2", "8d12 + 24", "76"));
		monsters.add(new Monsters("Banshee", "4", "1100", "no armor type", "12", "1", "-5", "14", "2", "10", "0", "12",
				"1", "11", "0", "17", "3", "13d8", "58"));
		monsters.add(new Monsters("Ghost", "4", "1100", "no armor type", "11", "7", "-2", "13", "1", "10", "0", "10",
				"0", "12", "1", "17", "3", "10d8", "45"));
		monsters.add(new Monsters("Flameskull", "4", "1100", "no armor type", "13", "1", "-5", "17", "3", "14", "2",
				"16", "3", "10", "0", "11", "0", "9d4 + 18", "40"));
		monsters.add(new Monsters("Killer Whale", "3", "700", "natural armor", "12", "19", "4", "10", "0", "13", "1",
				"3", "-4", "12", "1", "7", "-2", "12d12 + 12", "90"));
		monsters.add(new Monsters("Minotaur", "3", "700", "natural armor", "14", "18", "4", "11", "0", "16", "3", "6",
				"-2", "16", "3", "9", "-1", "9d10 + 27", "76"));
		monsters.add(new Monsters("Winter Wolf", "3", "700", "natural armor", "13", "18", "4", "13", "1", "14", "2",
				"7", "-2", "12", "1", "8", "-1", "10d10 + 20", "75"));
		monsters.add(new Monsters("Ankylosaurus", "3", "700", "natural armor", "15", "19", "4", "11", "0", "15", "2",
				"2", "-4", "12", "1", "5", "-3", "8d12 + 16", "68"));
		monsters.add(new Monsters("Manticore", "3", "700", "natural armor", "14", "17", "3", "16", "3", "17", "3", "7",
				"-2", "12", "1", "8", "-1", "8d10 + 24", "68"));
		monsters.add(new Monsters("Owlbear", "3", "700", "natural armor", "13", "20", "5", "12", "1", "17", "3", "3",
				"-4", "12", "1", "7", "-2", "7d10 + 21", "59"));
		monsters.add(new Monsters("Werewolf", "3", "700", "natural armor", "12", "15", "2", "13", "1", "14", "2", "10",
				"0", "11", "0", "10", "0", "9d8 + 18", "58"));
		monsters.add(new Monsters("Mummy", "3", "700", "natural armor", "11", "16", "3", "8", "-1", "15", "2", "6",
				"-2", "10", "0", "12", "1", "9d8 + 18", "58"));
		monsters.add(new Monsters("Doppelganger", "3", "700", "no armor type", "14", "11", "0", "18", "4", "14", "2",
				"11", "0", "12", "1", "14", "2", "8d8 + 16", "52"));
		monsters.add(new Monsters("Basilisk", "3", "700", "natural armor", "15", "16", "3", "8", "-1", "15", "2", "2",
				"-4", "8", "-1", "7", "-2", "8d8 + 16", "52"));
		monsters.add(new Monsters("Giant Scorpion", "3", "700", "natural armor", "15", "15", "2", "13", "1", "15", "2",
				"1", "-5", "9", "-1", "3", "-4", "7d10 + 14", "52"));
		monsters.add(new Monsters("Yeti", "3", "700", "natural armor", "12", "18", "4", "13", "1", "16", "3", "8", "-1",
				"12", "1", "7", "-2", "6d10 + 18", "51"));
		monsters.add(new Monsters("Hell Hound", "3", "700", "natural armor", "15", "17", "3", "12", "1", "14", "2", "6",
				"-2", "13", "1", "6", "-2", "7d8 + 14", "45"));
		monsters.add(new Monsters("Wight", "3", "700", "studded leather", "14", "15", "2", "14", "2", "16", "3", "10",
				"0", "13", "1", "15", "2", "6d8 + 18", "45"));
		monsters.add(new Monsters("Spectator", "3", "700", "natural armor", "14", "8", "-1", "14", "2", "14", "2", "13",
				"1", "14", "2", "11", "0", "6d8 + 12", "39"));
		monsters.add(new Monsters("Phase Spider", "3", "700", "natural armor", "13", "15", "2", "15", "2", "12", "1",
				"6", "-2", "10", "0", "6", "-2", "5d10 + 5", "32"));
		monsters.add(new Monsters("Plesiosaurus", "2", "450", "natural armor", "13", "18", "4", "15", "2", "16", "3",
				"2", "-4", "12", "1", "5", "-3", "8d10 + 24", "68"));
		monsters.add(new Monsters("Giant Constrictor Snake", "2", "450", "no armor type", "12", "19", "4", "14", "2",
				"12", "1", "1", "-5", "10", "0", "3", "-4", "8d12 + 8", "60"));
		monsters.add(new Monsters("Awakened Tree", "2", "450", "natural armor", "13", "19", "4", "6", "-2", "15", "2",
				"10", "0", "10", "0", "7", "-2", "7d12 + 14", "59"));
		monsters.add(new Monsters("Griffon", "2", "450", "no armor type", "12", "18", "4", "15", "2", "16", "3", "2",
				"-4", "13", "1", "8", "-1", "7d10 + 21", "59"));
		monsters.add(new Monsters("Pegasus", "2", "450", "no armor type", "12", "18", "4", "15", "2", "16", "3", "10",
				"0", "15", "2", "13", "1", "7d10 + 21", "59"));
		monsters.add(new Monsters("Ogre", "2", "450", "hide armor", "11", "19", "4", "8", "-1", "16", "3", "5", "-3",
				"7", "-2", "7", "-2", "7d10 + 21", "59"));
		monsters.add(new Monsters("Gargoyle", "2", "450", "natural armor", "15", "15", "2", "11", "0", "16", "3", "6",
				"-2", "11", "0", "7", "-2", "7d8 + 21", "52"));
		monsters.add(new Monsters("Saber-Toothed Tiger", "2", "450", "no armor type", "12", "18", "4", "14", "2", "15",
				"2", "3", "-4", "12", "1", "8", "-1", "7d10 + 14", "52"));
		monsters.add(new Monsters("Allosaurus", "2", "450", "natural armor", "13", "19", "4", "13", "1", "17", "3", "2",
				"-4", "12", "1", "5", "-3", "6d10 + 18", "51"));
		monsters.add(new Monsters("Nothic", "2", "450", "natural armor", "15", "14", "2", "16", "3", "16", "3", "13",
				"1", "10", "0", "8", "-1", "6d8 + 18", "45"));
		monsters.add(new Monsters("Centaur", "2", "450", "no armor type", "12", "18", "4", "14", "2", "14", "2", "9",
				"-1", "13", "1", "11", "0", "6d10 + 12", "45"));
		monsters.add(new Monsters("Hunter Shark", "2", "450", "natural armor", "12", "18", "4", "13", "1", "15", "2",
				"1", "-5", "10", "0", "4", "-3", "6d10 + 12", "45"));
		monsters.add(new Monsters("Rhinoceros", "2", "450", "natural armor", "11", "21", "5", "8", "-1", "15", "2", "2",
				"-4", "12", "1", "6", "-2", "6d10 + 12", "45"));
		monsters.add(new Monsters("Ochre Jelly", "2", "450", "no armor type", "8", "15", "2", "6", "-2", "14", "2", "2",
				"-4", "6", "-2", "1", "-5", "6d10 + 12", "45"));
		monsters.add(new Monsters("Giant Elk", "2", "450", "natural armor", "14", "19", "4", "16", "3", "14", "2", "7",
				"-2", "14", "2", "10", "0", "5d12 + 10", "42"));
		monsters.add(new Monsters("Polar Bear", "2", "450", "natural armor", "12", "20", "5", "10", "0", "16", "3", "2",
				"-4", "13", "1", "7", "-2", "5d10 + 15", "42"));
		monsters.add(new Monsters("Giant Boar", "2", "450", "natural armor", "12", "17", "3", "10", "0", "16", "3", "2",
				"-4", "7", "-2", "5", "-3", "5d10 + 15", "42"));
		monsters.add(new Monsters("Swarm of Poisonous Snakes", "2", "450", "no armor type", "14", "8", "-1", "18", "4",
				"11", "0", "1", "-5", "10", "0", "3", "-4", "8d8", "36"));
		monsters.add(new Monsters("Grick", "2", "450", "natural armor", "14", "14", "2", "14", "2", "11", "0", "3",
				"-4", "14", "2", "5", "-3", "6d8", "27"));
		monsters.add(new Monsters("Giant Octopus", "1", "200", "no armor type", "11", "17", "3", "13", "1", "13", "1",
				"4", "-3", "10", "0", "4", "-3", "8d10 + 8", "52"));
		monsters.add(new Monsters("Giant Hyena", "1", "200", "no armor type", "12", "16", "3", "14", "2", "14", "2",
				"2", "-4", "12", "1", "7", "-2", "6d10 + 12", "45"));
		monsters.add(new Monsters("Death Dog", "1", "200", "no armor type", "12", "15", "2", "14", "2", "14", "2", "3",
				"-4", "13", "1", "6", "-2", "6d8 + 12", "39"));
		monsters.add(new Monsters("Giant Toad", "1", "200", "no armor type", "11", "15", "2", "13", "1", "13", "1", "2",
				"-4", "10", "0", "3", "-4", "6d10 + 6", "39"));
		monsters.add(new Monsters("Harpy", "1", "200", "no armor type", "11", "12", "1", "13", "1", "12", "1", "7",
				"-2", "10", "0", "13", "1", "7d8 + 7", "38"));
		monsters.add(new Monsters("Dire Wolf", "1", "200", "natural armor", "14", "17", "3", "15", "2", "15", "2", "3",
				"-4", "12", "1", "7", "-2", "5d10 + 10", "37"));
		monsters.add(new Monsters("Tiger", "1", "200", "no armor type", "12", "17", "3", "15", "2", "14", "2", "3",
				"-4", "12", "1", "8", "-1", "5d10 + 10", "37"));
		monsters.add(new Monsters("Brown Bear", "1", "200", "natural armor", "11", "19", "4", "10", "0", "16", "3", "2",
				"-4", "13", "1", "7", "-2", "4d10 + 12", "34"));
		monsters.add(new Monsters("Animated Armor", "1", "200", "natural armor", "18", "14", "2", "11", "0", "13", "1",
				"1", "-5", "3", "-4", "1", "-5", "6d8 + 6", "33"));
		monsters.add(new Monsters("Swarm of Quippers", "1", "200", "no armor type", "13", "13", "1", "16", "3", "9",
				"-1", "1", "-5", "7", "-2", "2", "-4", "8d8 - 8", "28"));
		monsters.add(new Monsters("Bugbear", "1", "200", "hide armor w/shield", "16", "15", "2", "14", "2", "13", "1",
				"8", "-1", "11", "0", "9", "-1", "5d8 + 5", "27"));
		monsters.add(new Monsters("Giant Eagle", "1", "200", "no armor type", "13", "16", "3", "17", "3", "13", "1",
				"8", "-1", "14", "2", "10", "0", "4d10 + 4", "26"));
		monsters.add(new Monsters("Giant Spider", "1", "200", "natural armor", "14", "14", "2", "16", "3", "12", "1",
				"2", "-4", "11", "0", "4", "-3", "4d10 + 4", "26"));
		monsters.add(new Monsters("Lion", "1", "200", "no armor type", "12", "17", "3", "15", "2", "13", "1", "3", "-4",
				"12", "1", "8", "-1", "4d10 + 4", "26"));
		monsters.add(new Monsters("Ghoul", "1", "200", "no armor type", "12", "13", "1", "15", "2", "10", "0", "7",
				"-2", "10", "0", "6", "-2", "5d8", "22"));
		monsters.add(new Monsters("Giant Vulture", "1", "200", "no armor type", "10", "15", "2", "10", "0", "15", "2",
				"6", "-2", "12", "1", "7", "-2", "3d10 + 6", "22"));
		monsters.add(new Monsters("Hippogriff", "1", "200", "no armor type", "11", "17", "3", "13", "1", "13", "1", "2",
				"-4", "12", "1", "8", "-1", "3d10 + 3", "19"));
		monsters.add(new Monsters("Satyr", "0", "100", "leather armor", "14", "12", "1", "16", "3", "11", "0", "12",
				"1", "10", "0", "14", "2", "7d8", "31"));
		monsters.add(new Monsters("Cockatrice", "0", "100", "no armor type", "11", "6", "-2", "12", "1", "12", "1", "2",
				"-4", "13", "1", "5", "-3", "6d6 + 6", "27"));
		monsters.add(new Monsters("Worg", "0", "100", "natural armor", "13", "16", "3", "13", "1", "13", "1", "7", "-2",
				"11", "0", "8", "-1", "4d10 + 4", "26"));
		monsters.add(new Monsters("Swarm of Insects", "0", "100", "natural armor", "12", "3", "-4", "13", "1", "10",
				"0", "1", "-5", "7", "-2", "1", "-5", "5d8", "22"));
		monsters.add(new Monsters("Gnoll", "0", "100", "hide armor w/shield", "15", "14", "2", "12", "1", "11", "0",
				"6", "-2", "10", "0", "7", "-2", "5d8", "22"));
		monsters.add(new Monsters("Reef Shark", "0", "100", "natural armor", "12", "14", "2", "13", "1", "13", "1", "1",
				"-5", "10", "0", "4", "-3", "4d8 + 4", "22"));
		monsters.add(new Monsters("Lizardfolk", "0", "100", "natural armor w/shield", "15", "15", "2", "10", "0", "13",
				"1", "7", "-2", "12", "1", "7", "-2", "4d8 + 4", "22"));
		monsters.add(new Monsters("Ape", "0", "100", "no armor type", "12", "16", "3", "14", "2", "14", "2", "6", "-2",
				"12", "1", "7", "-2", "3d8 + 6", "19"));
		monsters.add(new Monsters("Black Bear", "0", "100", "natural armor", "11", "15", "2", "10", "0", "14", "2", "2",
				"-4", "12", "1", "7", "-2", "3d8 + 6", "19"));
		monsters.add(new Monsters("Warhorse", "0", "100", "no armor type", "11", "18", "4", "12", "1", "13", "1", "2",
				"-4", "12", "1", "7", "-2", "3d10 + 3", "19"));
		monsters.add(new Monsters("Giant Goat", "0", "100", "natural armor", "11", "17", "3", "11", "0", "12", "1", "3",
				"-4", "12", "1", "6", "-2", "3d10 + 3", "19"));
		monsters.add(new Monsters("Crocodile", "0", "100", "natural armor", "12", "15", "2", "10", "0", "13", "1", "2",
				"-4", "10", "0", "5", "-3", "3d10 + 3", "19"));
		monsters.add(new Monsters("Giant Sea Horse", "0", "100", "natural armor", "13", "12", "1", "15", "2", "11", "0",
				"2", "-4", "12", "1", "5", "-3", "3d10", "16"));
		monsters.add(new Monsters("Orc", "0", "100", "hide armor", "13", "16", "3", "12", "1", "16", "3", "7", "-2",
				"11", "0", "10", "0", "2d8 + 6", "15"));
		monsters.add(new Monsters("Giant Wasp", "0", "100", "no armor type", "12", "10", "0", "14", "2", "10", "0", "1",
				"-5", "10", "0", "3", "-4", "3d8", "13"));
		monsters.add(new Monsters("Hobgoblin", "0", "100", "chain mail w/shield", "18", "13", "1", "12", "1", "12", "1",
				"10", "0", "10", "0", "9", "-1", "2d8 + 2", "11"));
		monsters.add(new Monsters("Swarm of Ravens", "0", "50", "no armor type", "12", "6", "-2", "14", "2", "8", "-1",
				"3", "-4", "12", "1", "6", "-2", "7d8 - 7", "24"));
		monsters.add(new Monsters("Swarm of Rats", "0", "50", "no armor type", "10", "9", "-1", "11", "0", "9", "-1",
				"2", "-4", "10", "0", "3", "-4", "7d8 - 7", "24"));
		monsters.add(new Monsters("Swarm of Bats", "0", "50", "no armor type", "12", "5", "-3", "15", "2", "10", "0",
				"2", "-4", "12", "1", "4", "-3", "5d8", "22"));
		monsters.add(new Monsters("Blink Dog", "0", "50", "no armor type", "13", "12", "1", "17", "3", "12", "1", "10",
				"0", "13", "1", "11", "0", "4d8 + 4", "22"));
		monsters.add(new Monsters("Giant Bat", "0", "50", "no armor type", "13", "15", "2", "16", "3", "11", "0", "2",
				"-4", "12", "1", "6", "-2", "4d10", "22"));
		monsters.add(new Monsters("Zombie", "0", "50", "no armor type", "8", "13", "1", "6", "-2", "16", "3", "3", "-4",
				"6", "-2", "5", "-3", "3d8 + 9", "22"));
		monsters.add(new Monsters("Giant Owl", "0", "50", "no armor type", "12", "13", "1", "15", "2", "12", "1", "8",
				"-1", "13", "1", "10", "0", "3d10 + 3", "19"));
		monsters.add(new Monsters("Axe Beak", "0", "50", "no armor type", "11", "14", "2", "12", "1", "12", "1", "2",
				"-4", "10", "0", "5", "-3", "3d10 + 3", "19"));
		monsters.add(new Monsters("Giant Lizard", "0", "50", "natural armor", "12", "15", "2", "12", "1", "13", "1",
				"2", "-4", "10", "0", "5", "-3", "3d10 + 3", "19"));
		monsters.add(new Monsters("Draft Horse", "0", "50", "no armor type", "10", "18", "4", "10", "0", "12", "1", "2",
				"-4", "11", "0", "7", "-2", "3d10 + 3", "19"));
		monsters.add(new Monsters("Giant Frog", "0", "50", "no armor type", "11", "12", "1", "13", "1", "11", "0", "2",
				"-4", "10", "0", "3", "-4", "4d8", "18"));
		monsters.add(new Monsters("Flying Sword", "0", "50", "natural armor", "17", "12", "1", "15", "2", "11", "0",
				"1", "-5", "5", "-3", "1", "-5", "5d6", "17"));
		monsters.add(new Monsters("Panther", "0", "50", "no armor type", "12", "14", "2", "15", "2", "10", "0", "3",
				"-4", "14", "2", "7", "-2", "3d8", "13"));
		monsters.add(new Monsters("Pteranodon", "0", "50", "natural armor", "13", "12", "1", "15", "2", "10", "0", "2",
				"-4", "9", "-1", "5", "-3", "3d8", "13"));
		monsters.add(new Monsters("Skeleton", "0", "50", "armor scraps", "13", "10", "0", "14", "2", "15", "2", "6",
				"-2", "8", "-1", "5", "-3", "2d8 + 4", "13"));
		monsters.add(new Monsters("Giant Badger", "0", "50", "no armor type", "10", "13", "1", "10", "0", "15", "2",
				"2", "-4", "12", "1", "5", "-3", "2d8 + 4", "13"));
		monsters.add(new Monsters("Constrictor Snake", "0", "50", "no armor type", "12", "15", "2", "14", "2", "12",
				"1", "1", "-5", "10", "0", "3", "-4", "2d10 + 2", "13"));
		monsters.add(new Monsters("Elk", "0", "50", "no armor type", "10", "16", "3", "10", "0", "12", "1", "2", "-4",
				"10", "0", "6", "-2", "2d10 + 2", "13"));
		monsters.add(new Monsters("Riding Horse", "0", "50", "no armor type", "10", "16", "3", "10", "0", "12", "1",
				"2", "-4", "11", "0", "7", "-2", "2d10 + 2", "13"));
		monsters.add(new Monsters("Giant Poisonous Snake", "0", "50", "no armor type", "14", "10", "0", "18", "4", "13",
				"1", "2", "-4", "10", "0", "3", "-4", "2d8 + 2", "11"));
		monsters.add(new Monsters("Giant Wolf Spider", "0", "50", "no armor type", "13", "12", "1", "16", "3", "13",
				"1", "3", "-4", "12", "1", "4", "-3", "2d8 + 2", "11"));
		monsters.add(new Monsters("Wolf", "0", "50", "natural armor", "13", "12", "1", "15", "2", "12", "1", "3", "-4",
				"12", "1", "6", "-2", "2d8 + 2", "11"));
		monsters.add(new Monsters("Boar", "0", "50", "natural armor", "11", "13", "1", "11", "0", "12", "1", "2", "-4",
				"9", "-1", "5", "-3", "2d8 + 2", "11"));
		monsters.add(new Monsters("Goblin", "0", "50", "leather armor w/shield", "15", "8", "-1", "14", "2", "10", "0",
				"10", "0", "8", "-1", "8", "-1", "2d6", "7"));
		monsters.add(new Monsters("Giant Centipede", "0", "50", "natural armor", "13", "5", "-3", "14", "2", "12", "1",
				"1", "-5", "7", "-2", "3", "-4", "1d6 + 1", "4"));
		monsters.add(new Monsters("Camel", "0", "125", "no armor type", "9", "16", "3", "8", "-1", "14", "2", "2", "-4",
				"8", "-1", "5", "-3", "2d10 + 4", "15"));
		monsters.add(new Monsters("Giant Crab", "0", "125", "natural armor", "15", "13", "1", "15", "2", "11", "0", "1",
				"-5", "9", "-1", "3", "-4", "3d8", "13"));
		monsters.add(new Monsters("Merfolk", "0", "125", "no armor type", "11", "10", "0", "13", "1", "12", "1", "11",
				"0", "11", "0", "12", "1", "2d8 + 2", "11"));
		monsters.add(new Monsters("Mule", "0", "125", "no armor type", "10", "14", "2", "10", "0", "13", "1", "2", "-4",
				"10", "0", "5", "-3", "2d8 + 2", "11"));
		monsters.add(new Monsters("Pony", "0", "125", "no armor type", "10", "15", "2", "10", "0", "13", "1", "2", "-4",
				"11", "0", "7", "-2", "2d8 + 2", "11"));
		monsters.add(new Monsters("Giant Weasel", "0", "125", "no armor type", "13", "11", "0", "16", "3", "10", "0",
				"4", "-3", "12", "1", "5", "-3", "2d8", "9"));
		monsters.add(new Monsters("Giant Rat", "0", "125", "no armor type", "12", "7", "-2", "15", "2", "11", "0", "2",
				"-4", "10", "0", "4", "-3", "2d6", "7"));
		monsters.add(new Monsters("Blood Hawk", "0", "125", "no armor type", "12", "6", "-2", "14", "2", "10", "0", "3",
				"-4", "14", "2", "5", "-3", "2d6", "7"));
		monsters.add(new Monsters("Kobold", "0", "125", "no armor type", "12", "7", "-2", "15", "2", "9", "-1", "8",
				"-1", "7", "-2", "8", "-1", "2d6 - 2", "5"));
		monsters.add(new Monsters("Flying Snake", "0", "125", "no armor type", "14", "4", "-3", "18", "4", "11", "0",
				"2", "-4", "12", "1", "5", "-3", "2d4", "5"));
		monsters.add(new Monsters("Mastiff", "0", "125", "no armor type", "12", "13", "1", "14", "2", "12", "1", "3",
				"-4", "12", "1", "7", "-2", "1d8 + 1", "5"));
		monsters.add(new Monsters("Twig Blight", "0", "125", "natural armor", "13", "6", "-2", "13", "1", "12", "1",
				"4", "-3", "8", "-1", "3", "-4", "1d6 + 1", "4"));
		monsters.add(new Monsters("Stirge", "0", "125", "natural armor", "14", "4", "-3", "16", "3", "11", "0", "2",
				"-4", "8", "-1", "6", "-2", "1d4", "2"));
		monsters.add(new Monsters("Poisonous Snake", "0", "125", "no armor type", "13", "2", "-4", "16", "3", "11", "0",
				"1", "-5", "10", "0", "3", "-4", "1d4", "2"));
		monsters.add(new Monsters("Awakened Shrub", "0", "10", "no armor type", "9", "3", "-4", "8", "-1", "11", "0",
				"10", "0", "10", "0", "6", "-2", "3d6", "10"));
		monsters.add(new Monsters("Hyena", "0", "10", "no armor type", "11", "11", "0", "13", "1", "12", "1", "2", "-4",
				"12", "1", "5", "-3", "1d8 + 1", "5"));
		monsters.add(new Monsters("Vulture", "0", "10", "no armor type", "10", "7", "-2", "10", "0", "13", "1", "2",
				"-4", "12", "1", "4", "-3", "1d8 + 1", "5"));
		monsters.add(new Monsters("Deer", "0", "10", "no armor type", "13", "11", "0", "16", "3", "11", "0", "2", "-4",
				"14", "2", "5", "-3", "1d8", "4"));
		monsters.add(new Monsters("Goat", "0", "10", "no armor type", "10", "12", "1", "10", "0", "11", "0", "2", "-4",
				"10", "0", "5", "-3", "1d8", "4"));
		monsters.add(new Monsters("Giant Fire Beetle", "0", "10", "natural armor", "13", "8", "-1", "10", "0", "12",
				"1", "1", "-5", "7", "-2", "3", "-4", "1d6 + 1", "4"));
		monsters.add(new Monsters("Jackal", "0", "10", "no armor type", "12", "8", "-1", "15", "2", "11", "0", "3",
				"-4", "12", "1", "6", "-2", "1d6", "3"));
		monsters.add(new Monsters("Eagle", "0", "10", "no armor type", "12", "6", "-2", "15", "2", "10", "0", "2", "-4",
				"14", "2", "7", "-2", "1d6", "3"));
		monsters.add(new Monsters("Octopus", "0", "10", "no armor type", "12", "4", "-3", "15", "2", "11", "0", "3",
				"-4", "10", "0", "4", "-3", "1d6", "3"));
		monsters.add(new Monsters("Baboon", "0", "10", "no armor type", "12", "8", "-1", "14", "2", "11", "0", "4",
				"-3", "12", "1", "6", "-2", "1d6", "3"));
		monsters.add(new Monsters("Badger", "0", "10", "no armor type", "10", "4", "-3", "11", "0", "12", "1", "2",
				"-4", "12", "1", "5", "-3", "1d4 + 1", "3"));
		monsters.add(new Monsters("Cat", "0", "10", "no armor type", "12", "3", "-4", "15", "2", "10", "0", "3", "-4",
				"12", "1", "7", "-2", "1d4", "2"));
		monsters.add(new Monsters("Crab", "0", "10", "natural armor", "11", "2", "-4", "11", "0", "10", "0", "1", "-5",
				"8", "-1", "2", "-4", "1d4", "2"));
		monsters.add(new Monsters("Lizard", "0", "10", "no armor type", "10", "2", "-4", "11", "0", "10", "0", "1",
				"-5", "8", "-1", "3", "-4", "1d4", "2"));
		monsters.add(new Monsters("Hawk", "0", "10", "no armor type", "13", "5", "-3", "16", "3", "8", "-1", "2", "-4",
				"14", "2", "6", "-2", "1d4 - 1", "1"));
		monsters.add(new Monsters("Quipper", "0", "10", "no armor type", "13", "2", "-4", "16", "3", "9", "-1", "1",
				"-5", "7", "-2", "2", "-4", "1d4 - 1", "1"));
		monsters.add(new Monsters("Weasel", "0", "10", "no armor type", "13", "3", "-4", "16", "3", "8", "-1", "2",
				"-4", "12", "1", "3", "-4", "1d4 - 1", "1"));
		monsters.add(new Monsters("Bat", "0", "10", "no armor type", "12", "2", "-4", "15", "2", "8", "-1", "2", "-4",
				"12", "1", "4", "-3", "1d4 - 1", "1"));
		monsters.add(new Monsters("Raven", "0", "10", "no armor type", "12", "2", "-4", "14", "2", "8", "-1", "2", "-4",
				"12", "1", "6", "-2", "1d4 - 1", "1"));
		monsters.add(new Monsters("Spider", "0", "10", "no armor type", "12", "2", "-4", "14", "2", "8", "-1", "1",
				"-5", "10", "0", "2", "-4", "1d4 - 1", "1"));
		monsters.add(new Monsters("Owl", "0", "10", "no armor type", "11", "3", "-4", "13", "1", "8", "-1", "2", "-4",
				"12", "1", "7", "-2", "1d4 - 1", "1"));
		monsters.add(new Monsters("Frog", "0", "0", "no armor type", "11", "1", "-5", "13", "1", "8", "-1", "1", "-5",
				"8", "-1", "3", "-4", "1d4 - 1", "1"));
		monsters.add(new Monsters("Sea Horse", "0", "0", "no armor type", "11", "1", "-5", "12", "1", "8", "-1", "1",
				"-5", "10", "0", "2", "-4", "1d4 - 1", "1"));
		monsters.add(new Monsters("Scorpion", "0", "10", "natural armor", "11", "2", "-4", "11", "0", "8", "-1", "1",
				"-5", "8", "-1", "2", "-4", "1d4 - 1", "1"));
		monsters.add(new Monsters("Rat", "0", "10", "no armor type", "10", "2", "-4", "11", "0", "9", "-1", "2", "-4",
				"10", "0", "4", "-3", "1d4 - 1", "1"));

		return monsters;
	}
}