package com.sencha.gxt.project.client;

import java.io.Serializable;

public class Monsters implements Serializable {

	// Create strings that match table headers in filepath
	private Integer id;
	private String name1;
	private String challengeRating;
	private String challengeXP;
	private String acType;
	private String armorClass;
	private String strScore;
	private String strMod;
	private String dexScore;
	private String dexMod;
	private String conScore;
	private String conMod;
	private String intScore;
	private String intMod;
	private String wisScore;
	private String wisMod;
	private String chaScore;
	private String chaMod;
	private String hpDice;
	private String hp;

	private static int COUNTER = 0;

	public Monsters() {
		this.id = Integer.valueOf(COUNTER);
	}

	public Monsters(String name1, String challengeRating, String challengeXP, String acType, String armorClass,
			String strScore, String strMod, String dexScore, String dexMod, String conScore, String conMod,
			String intScore, String intMod, String wisScore, String wisMod, String chaScore, String chaMod,
			String hpDice, String hp) {
		this();
		this.name1 = name1;
		this.challengeRating = challengeRating;
		this.challengeXP = challengeXP;
		this.acType = acType;
		this.armorClass = armorClass;
		this.strScore = strScore;
		this.strMod = strMod;
		this.dexScore = dexScore;
		this.dexMod = dexMod;
		this.conScore = conScore;
		this.conMod = conMod;
		this.intScore = intScore;
		this.intMod = intMod;
		this.wisScore = wisScore;
		this.wisMod = wisMod;
		this.chaScore = chaScore;
		this.chaMod = chaMod;
		this.hpDice = hpDice;
		this.hp = hp;
	}

	public Integer getID() {
		return id;
	}

	public String getName1() {
		return name1;
	}

	public String getChallengeRating() {
		return challengeRating;
	}

	public String getChallengeXP() {
		return challengeXP;
	}

	public String getAcType() {
		return acType;
	}

	public String getArmorClass() {
		return armorClass;
	}

	public String getStrScore() {
		return strScore;
	}

	public String getStrMod() {
		return strMod;
	}

	public String getDexScore() {
		return dexScore;
	}

	public String getDexMod() {
		return dexMod;
	}

	public String getConScore() {
		return conScore;
	}

	public String getConMod() {
		return conMod;
	}

	public String getIntScore() {
		return intScore;
	}

	public String getIntMod() {
		return intMod;
	}

	public String getWisScore() {
		return wisScore;
	}

	public String getWisMod() {
		return wisMod;
	}

	public String getChaScore() {
		return chaScore;
	}

	public String getChaMod() {
		return chaMod;
	}

	public String getHpDice() {
		return hpDice;
	}

	public String getHp() {
		return hp;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public void setChallengeRating(String challengeRating) {
		this.challengeRating = challengeRating;
	}

	public void setChallengeXP(String challengeXP) {
		this.challengeXP = challengeXP;
	}

	public void setAcType(String acType) {
		this.acType = acType;
	}

	public void setArmorClass(String armorClass) {
		this.armorClass = armorClass;
	}

	public void setStrScore(String strScore) {
		this.strScore = strScore;
	}

	public void setStrMod(String strMod) {
		this.strMod = strMod;
	}

	public void setDexScore(String dexScore) {
		this.dexScore = dexScore;
	}

	public void setDexMod(String dexMod) {
		this.dexMod = dexMod;
	}

	public void setConScore(String conScore) {
		this.conScore = conScore;
	}

	public void setConMod(String conMod) {
		this.conMod = conMod;
	}

	public void setIntScore(String intScore) {
		this.intScore = intScore;
	}

	public void setIntMod(String intMod) {
		this.intMod = intMod;
	}

	public void setWisScore(String wisScore) {
		this.wisScore = wisScore;
	}

	public void setWisMod(String wisMod) {
		this.wisMod = wisMod;
	}

	public void setChaScore(String chaScore) {
		this.chaScore = chaScore;
	}

	public void setChaMod(String chaMod) {
		this.chaMod = chaMod;
	}

	public void setHpDice(String hpDice) {
		this.hpDice = hpDice;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}
}