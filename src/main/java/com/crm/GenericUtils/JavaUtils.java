package com.crm.GenericUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtils 
{
	public int GetRandomNo()
	{
		Random ran = new Random();
		int random = ran.nextInt(500);
		return random;
	}
	
	public String SystemDate()
	{
		Date date = new Date();
		String systemdate = date.toString();
		return systemdate;
	}
	
	public String systemDateInFormat()
	{
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy HH-mm-ss");
		Date date = new Date();
		String systemdateInFormat = dateformat.format(date);
		return systemdateInFormat;
	}

}
