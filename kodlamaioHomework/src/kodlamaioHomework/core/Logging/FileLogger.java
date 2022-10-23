package kodlamaioHomework.core.Logging;

public class FileLogger implements ILogger{

	@Override
	public void log(String data) {
		System.out.println("Dosyaya Loglandı" + data);
		
	}

}
