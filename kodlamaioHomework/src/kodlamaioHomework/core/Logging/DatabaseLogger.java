package kodlamaioHomework.core.Logging;

public class DatabaseLogger implements ILogger {

	@Override
	public void log(String data) {
		System.out.println("veritabanına loglandı" + data);
		
	}

}
