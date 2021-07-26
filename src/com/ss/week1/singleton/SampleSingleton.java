package com.ss.week1.singleton;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class SampleSingleton {

	private static Connection conn = null;
	
	private static SampleSingleton _instance = null;
	
	public static SampleSingleton getInstance() {
		if (_instance == null) {
			synchronized(SampleSingleton.class) {
				if (_instance == null) {
					_instance = new SampleSingleton();
				}
			}
		}
		return _instance;
	}
	
}

