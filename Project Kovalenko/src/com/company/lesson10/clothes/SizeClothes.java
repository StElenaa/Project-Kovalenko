package com.company.lesson10.clothes;

public enum SizeClothes {
	XS(38), S(40), M(42), L(44), XXS(36) {
		public String getDescription() {
			return "детский размер";
		}
	};
	private int euroSize;

	SizeClothes(int euroSize) {
		this.euroSize = euroSize;
	}

	public String getDescription() {
		return "взрослый размер";
	}

	public int getEuroSize() {
		return euroSize;
	}

	public void setEuroSize(int euroSize) {
		this.euroSize = euroSize;
	}
}
