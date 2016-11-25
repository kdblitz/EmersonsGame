package com.odde.emersonsgame.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class SpeedTypeTest {
	@Test
	public void getNormalSpeedShouldGetSetNormal() {
		assertEquals(SpeedType.NORMAL, SpeedType.get("normal"));
	}

	@Test
	public void getSuperSpeedShouldGetSetSuper() {
		assertEquals(SpeedType.SUPER, SpeedType.get("super"));
	}

	@Test
	public void getSuperSpeedShouldReturnNull() {
		assertEquals(null, SpeedType.get("invalid"));
	}

	@Test
	public void rollNormalSpeedOdd1ShouldReturn1(){
		assertEquals(1, SpeedType.NORMAL.roll(1));
	}

	@Test
	public void rollNormalSpeedEven2ShouldReturn2(){
		assertEquals(2, SpeedType.NORMAL.roll(2));
	}

	@Test
	public void rollNormalSpeedOdd3ShouldReturn1(){
		assertEquals(1, SpeedType.NORMAL.roll(3));
	}

	@Test
	public void rollNormalSpeedEven4ShouldReturn2(){
		assertEquals(2, SpeedType.NORMAL.roll(4));
	}

	@Test
	public void rollSuperSpeed1ShouldReturn1() {
		assertEquals(1, SpeedType.SUPER.roll(1));
	}

	@Test
	public void rollSuperSpeed6ShouldReturn6() {
		assertEquals(6, SpeedType.SUPER.roll(6));
	}
}