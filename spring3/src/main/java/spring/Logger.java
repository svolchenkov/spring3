package spring;

public class Logger {
	private ConsoleWritter consoleWritter;
	private FileWritter fileWritter;

	public void consoleWrite (String text) {
		this.consoleWritter.setText(text);
	}
	
	public void fileWrite (String text) {
		this.fileWritter.setText(text);
	}
	
	public ConsoleWritter getConsoleWritter() {
		return consoleWritter;
	}

	public void setConsoleWritter(ConsoleWritter consoleWritter) {
		this.consoleWritter = consoleWritter;
	}

	public FileWritter getFileWritter() {
		return fileWritter;
	}

	public void setFileWritter(FileWritter fileWritter) {
		this.fileWritter = fileWritter;
	}

}
