package com.sencha.gxt.project.client;

import java.io.Serializable;

public class Monsters implements Serializable {

	// Create strings that match table headers in filepath
	private Integer id;
	private String name1;
	private Integer challengeRating;
	private Integer challengeXP;
	private String acType;
	private Integer armorClass;
	private Integer strScore;
	private Integer strMod;
	private Integer dexScore;
	private Integer dexMod;
	private Integer conScore;
	private Integer conMod;
	private Integer intScore;
	private Integer intMod;
	private Integer wisScore;
	private Integer wisMod;
	private Integer chaScore;
	private Integer chaMod;
	private String hpDice;
	private Integer hp;

	private static int COUNTER = 0;

	public Monsters() {
		this.id = COUNTER++;
	}

	public Monsters(String name1, Integer challengeRating, Integer challengeXP, String acType, Integer armorClass,
			Integer strScore, Integer strMod, Integer dexScore, Integer dexMod, Integer conScore, Integer conMod,
			Integer intScore, Integer intMod, Integer wisScore, Integer wisMod, Integer chaScore, Integer chaMod,
			String hpDice, Integer hp) {
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

	public Integer getId() {
		return id;
	}

	public String getName1() {
		return name1;
	}

	public Integer getChallengeRating() {
		return challengeRating;
	}

	public Integer getChallengeXP() {
		return challengeXP;
	}

	public String getAcType() {
		return acType;
	}

	public Integer getArmorClass() {
		return armorClass;
	}

	public Integer getStrScore() {
		return strScore;
	}

	public Integer getStrMod() {
		return strMod;
	}

	public Integer getDexScore() {
		return dexScore;
	}

	public Integer getDexMod() {
		return dexMod;
	}

	public Integer getConScore() {
		return conScore;
	}

	public Integer getConMod() {
		return conMod;
	}

	public Integer getIntScore() {
		return intScore;
	}

	public Integer getIntMod() {
		return intMod;
	}

	public Integer getWisScore() {
		return wisScore;
	}

	public Integer getWisMod() {
		return wisMod;
	}

	public Integer getChaScore() {
		return chaScore;
	}

	public Integer getChaMod() {
		return chaMod;
	}

	public String getHpDice() {
		return hpDice;
	}

	public Integer getHp() {
		return hp;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public void setChallengeRating(Integer challengeRating) {
		this.challengeRating = challengeRating;
	}

	public void setChallengeXP(Integer challengeXP) {
		this.challengeXP = challengeXP;
	}

	public void setAcType(String acType) {
		this.acType = acType;
	}

	public void setArmorClass(Integer armorClass) {
		this.armorClass = armorClass;
	}

	public void setStrScore(Integer strScore) {
		this.strScore = strScore;
	}

	public void setStrMod(Integer strMod) {
		this.strMod = strMod;
	}

	public void setDexScore(Integer dexScore) {
		this.dexScore = dexScore;
	}

	public void setDexMod(Integer dexMod) {
		this.dexMod = dexMod;
	}

	public void setConScore(Integer conScore) {
		this.conScore = conScore;
	}

	public void setConMod(Integer conMod) {
		this.conMod = conMod;
	}

	public void setIntScore(Integer intScore) {
		this.intScore = intScore;
	}

	public void setIntMod(Integer intMod) {
		this.intMod = intMod;
	}

	public void setWisScore(Integer wisScore) {
		this.wisScore = wisScore;
	}

	public void setWisMod(Integer wisMod) {
		this.wisMod = wisMod;
	}

	public void setChaScore(Integer chaScore) {
		this.chaScore = chaScore;
	}

	public void setChaMod(Integer chaMod) {
		this.chaMod = chaMod;
	}

	public void setHpDice(String hpDice) {
		this.hpDice = hpDice;
	}

	public void setHp(Integer hp) {
		this.hp = hp;
	}
}