package singleton;

public class Incremental {
	
	private static Incremental uniqueInstance;
	
	private static int count = 0;
	private static int numero;
	
	private Incremental() {
		
	}
		@Override
	public String toString() {
		return "Incremental " + numero;
	}
		public static synchronized Incremental getInstance() {
			if (uniqueInstance == null)
				uniqueInstance = new Incremental();
			numero = count++;
			return uniqueInstance;
		}
	}

	
	


