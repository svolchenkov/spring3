package spring;

import java.security.GeneralSecurityException;

import spring.*;

public class Logger {
	private ConsoleWritter consoleWritter;
	private FileWritter fileWriter;

	public void setConsoleWritter(ConsoleWritter writer) {
		this.consoleWritter = writer;
	}

	public void setFileWritter(FileWritter fileWriter) {
		this.fileWriter = fileWriter;
	}
	
	public void writeFile(String text) {
		
	}
	
	public void writeConsole(String text) {
		
		System.out.println("text from Logger writeConsole: " + text);
		consoleWritter.write("try write text");

	}

}
