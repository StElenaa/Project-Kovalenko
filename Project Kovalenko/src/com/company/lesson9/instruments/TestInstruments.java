package com.company.lesson9.instruments;

public class TestInstruments {

	public static void main(String[] args) {
		Instrument[] instruments = new Instrument[] { new Guitar(6), new Drum(30), new Pipe(10), new Guitar(7),
				new Drum(50), new Pipe(20) };
		for (Instrument instrument : instruments) {
			instrument.play();
		}
		System.out.println("Вызов клавиши из интерфейса - " + Instrument.KEY);
	}
}
