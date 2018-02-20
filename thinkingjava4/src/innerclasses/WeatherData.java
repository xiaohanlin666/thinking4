package innerclasses;

import java.util.Observable;

public class WeatherData extends Observable{
	
	public void measurementsChanged()
	{
		addObserver(null);
		setChanged();
		notifyObservers();
	}

}
