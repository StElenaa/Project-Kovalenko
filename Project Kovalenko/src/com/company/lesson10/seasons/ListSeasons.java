package com.company.lesson10.seasons;

public class ListSeasons {

	public static void main(String[] args) {
		for (Seasons s : Seasons.values()) {
			System.out.println(s.name() + " - " + s.getDescription() + " ������� ����������� - " + s.temp);
		}
		Seasons s = Seasons.SUMMER;
		describeSeason(s);
	}

	public static void describeSeason(Seasons s) {
		switch (s) {
		case SUMMER:
			System.out.println("� ����� ����");
		default:
			System.out.println(s.name() + " - " + s.getDescription() + " ������� ����������� - " + s.temp);
			break;
		}
	}
}
