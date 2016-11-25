package com.odde.emersonsgame.model;

public enum SpeedType {
	NORMAL("normal") {
		@Override
		public int roll(int roll) {
			return (roll - 1) % 2 + 1;
		}
	},
	SUPER("super") {
		@Override
		public int roll(int roll) {
			return roll;
		}
	};

	private final String name;

	SpeedType(String name) {
		this.name = name;
	}

	public abstract int roll(int roll);

	public static SpeedType get(String type) {
		for (SpeedType s: values()) {
			if (s.name.equals(type)) return s;
		}
		return null;
	}
}
