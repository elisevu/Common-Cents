import java.io.*;
import java.util.*;
public class Quiz
{
	private int house, frequency;
	private String street, city, state;
	private double spend;
	public Quiz()
	{
		house = 0000;
		frequency = 0000;
		street = "";
		city = "";
		state = "";
		spend = 0.0;	
	}
	public Quiz(int h, int f, String s, String c, String st, double sp)
	{
		house = h;
		frequency = f;
		street = s;
		city = c;
		state = st;
		spend = sp;
	}
	public int getHouse()
	{
		return house;
	}
	public int getFrequency()
	{
		return frequency;
	}
	public String getStreet()
	{
		return street;
	}
	public String getCity()
	{
		return city;
	}
	public String getState()
	{
		return state;
	}
	public double getSpend()
	{
	return spend;
	}
	public String toString()
	{
		return house + " " street + ", " + city + state + "/n" + frequency + ": $" + spend;
	}
}
	




