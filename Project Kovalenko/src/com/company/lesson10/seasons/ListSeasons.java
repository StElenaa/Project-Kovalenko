package com.company.lesson10.seasons;

public class ListSeasons {

	public static void describeSeason(Seasons s) {
		switch (s) {
		case SUMMER:
			System.out.println("я люблю лето");
		default:
			System.out.println(s.name() + " - " + s.getDescription() + " —редн€€ температура - " + s.getTemp());
			break;
		}
	}

	@Override
	public String toString() {
		return "ListSeasons [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", super.toString()="
				+ super.toString() + "]";
	}

	public static void main(String[] args) {
		for (Seasons s : Seasons.values()) {
			System.out.println(s.name() + " - " + s.getDescription() + " —редн€€ температура - " + s.getTemp());
		}
		Seasons s = Seasons.SUMMER;
		describeSeason(s);
	}
}
