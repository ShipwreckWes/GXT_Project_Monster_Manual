package com.sencha.gxt.project.client;

import com.google.gwt.editor.client.Editor.Path;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.shared.LabelProvider;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.PropertyAccess;

public interface MonsterProperties extends PropertyAccess<Monsters> {

	@Path("id")
	ModelKeyProvider<Monsters> key();

	@Path("name1")
	LabelProvider<Monsters> nameLabel();

	ValueProvider<Monsters, String> name1();

	ValueProvider<Monsters, Integer> challengeRating();

	ValueProvider<Monsters, Integer> challengeXP();

	ValueProvider<Monsters, String> acType();

	ValueProvider<Monsters, Integer> armorClass();

	ValueProvider<Monsters, Integer> strScore();

	ValueProvider<Monsters, Integer> strMod();

	ValueProvider<Monsters, Integer> dexScore();

	ValueProvider<Monsters, Integer> dexMod();

	ValueProvider<Monsters, Integer> conScore();

	ValueProvider<Monsters, Integer> conMod();

	ValueProvider<Monsters, Integer> intScore();

	ValueProvider<Monsters, Integer> intMod();

	ValueProvider<Monsters, Integer> wisScore();

	ValueProvider<Monsters, Integer> wisMod();

	ValueProvider<Monsters, Integer> chaScore();

	ValueProvider<Monsters, Integer> chaMod();

	ValueProvider<Monsters, String> hpDice();

	ValueProvider<Monsters, Integer> hp();

}
