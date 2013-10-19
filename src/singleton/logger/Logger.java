package singleton.logger;

import java.util.Date;

import upm.jbb.IO;

public class Logger {
	private String logs;
	private static Logger loger = null;

	public Logger() {
		this.clear();
	}
	
	public static Logger getLogger() {
		
		return Logger.loger;
		}

	public String getLogs() {
		return logs;
	}

	public void addLog(String log) {
		this.logs = this.logs + ">>> " + log + "\n";
	}

	public void clear() {
		this.logs = new Date().toString() + "\n";
	}

	public void print() {
		IO.out.print(this.logs);
	}
}