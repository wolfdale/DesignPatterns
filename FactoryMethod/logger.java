//
//
//

import java.io.*;

interface Logger{
	public void log(String msg);
}

class FileLogging implements Logger{
	public void log(String msg){
		try{
			FileWriter fw = new FileWriter("File.txt");
			fw.write(msg);
			fw.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}	

}

class ConsoleLogging implements Logger{

	public void log(String msg){
		System.out.println(msg);
	}
}

class LogFactory{
	Logger logObj = null;
	Logger getLogger(int x){
		if(x == 1){
			logObj = new FileLogging();
		}
		else{
			logObj = new ConsoleLogging();
		}
		return logObj;
	}
}

class Runner{
	public static void main(String [] agrs){
		LogFactory lf = new LogFactory();
		Logger log_It = lf.getLogger(1);
		log_It.log("This is To file");
		log_It = lf.getLogger(2);
		log_It.log("To console");
	}
}





