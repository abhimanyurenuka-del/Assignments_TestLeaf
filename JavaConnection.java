package interface1.abstraction.assignment;

public class JavaConnection implements DatabaseConnection {
	@Override
	public void connect() {
		System.out.println("Java database is connected");
		
	}
    @Override
	public void disconnect() {
		System.out.println("Java database is disconnected");
}
@Override
	public void executeUpdate() {
		System.out.println("Java database is Updated");
}
	public static void main(String[] args) {
		
        JavaConnection connectopt= new JavaConnection();
        connectopt.connect();
        connectopt.disconnect();
        connectopt.executeUpdate();
	}


}
