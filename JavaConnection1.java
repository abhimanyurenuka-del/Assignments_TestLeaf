package interface1.abstraction.assignment;

public class JavaConnection1 extends MysqlConnection {

	@Override
	public void connect() {
		System.out.println("MySQL is connected");
		
	}

	@Override
	public void disconnect() {
		System.out.println("MySQL is disconnected");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("MySQL is executed");
		
	}
public static void main(String[] args) {
		
        JavaConnection1 connectopt= new JavaConnection1();
        connectopt.connect();
        connectopt.disconnect();
        connectopt.executeUpdate();
        connectopt.executeQuery();
}
}
