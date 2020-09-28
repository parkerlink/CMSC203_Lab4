/** 
*The purpose of this class is to model a television
*Your name and today’s date
*/

public class Television {
	private static String MANUFACTURER; //Stores the name of the manufacturer, it cannot be changed
	private static int SCREEN_SIZE; //Stores the screen size of the television, cannot be changed
	
	public boolean powerOn;
	public int channel;
	public int volume;
	
	public Television(String manufacturer,int screen_size) {
		//Creates a constructor for Television class
		//Sets the manufacturer and screen_size when the Television class is created
		MANUFACTURER = manufacturer;
		SCREEN_SIZE = screen_size;
		powerOn = false;
		channel = 2;
		volume = 20;
	  }
	/**
	  * Sets the channel to a station provided by user
	  * @param station the new channel that will be set
	*/
	public void setChannel(int station) {
		channel = station;
	}
	/**
	  * Flips the power, if it's off it will be turned on and vice versa
	*/
	public void power() {
		powerOn = !powerOn;
	}
	/**
	  * Increases the volume by an increment of one
	*/
	public void increaseVolume(){
		volume++;
	}
	/**
	  * Decreases the volume by an increment of one
	*/
	public void decreaseVolume() {
		volume--;
	}
	/**
	  * @returns the value of channel
	*/
	public int getChannel() {
		return channel;
	}
	/**
	  * @returns the value of volume
	*/
	public int getVolume() {
		return volume;
	}
	/**
	  * @returns the value of the manufacturer
	*/
	public String getManufacturer() {
		return MANUFACTURER;
	}
	/**
	  * @returns the value of the screen size
	*/
	public int getScreenSize() {
		return SCREEN_SIZE;
	}
}
