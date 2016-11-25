package com.odde.emersonsgame.model;

public class Player {
	public final String NORMAL = "normal";
	public final String SUPER = "super";

	private SpeedType speedType;
	private int damage;
	private int step;

	public void setSpeedType(SpeedType speedType) {
		this.speedType = speedType;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public void roll(int actualRoll) {
		step += computeStepWithPenalties(actualRoll);
		if (SpeedType.SUPER.equals(speedType)) {
			damage++;
		}
	}

	private int computeStepWithPenalties(int actualRoll) {
		return Math.max(speedType.roll(actualRoll) - damage, 0);
	}

	public int getStep() {
		return step;
	}

	public int getDamage() {
		return damage;
	}
}
