package polymorphism.assignment;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println("endpoint:"+endpoint);
		
	}
	public void sendRequest(String endpoint, String requestBody, boolean requestsStatus) {
		System.out.println("endpoint:"+endpoint);
		System.out.println("requestBody:"+requestBody);
		System.out.println("requestsStatus:"+requestsStatus);
	}

	public static void main(String[] args) {
		APIClient apiopt=new APIClient();
		apiopt.sendRequest("getusers");
		apiopt.sendRequest("createusers","TestLeaf",true);
	

	}

}
