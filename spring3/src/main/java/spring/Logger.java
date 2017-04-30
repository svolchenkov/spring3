package spring;

import java.security.GeneralSecurityException;

import spring.*;

public class Logger {
	private ConsoleWritter consoleWriter;
	private FileWritter fileWriter;

	public void setConsoleWriter(ConsoleWritter writer) {
		this.consoleWriter = writer;
	}

	public void setFileWriter(FileWritter fileWriter) {
		this.fileWriter = fileWriter;
	}
	
	public void writeFile(String text) {
		
	}
	
	public void writeConsole(String text) {
		
		System.out.println("text from Logger writeConsole: " + text);
		consoleWriter.write("try write text");

	}

}
