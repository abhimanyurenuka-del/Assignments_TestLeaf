package polymorphism.assignment;

public class LoginPage extends BasePage {
	
	@Override
    public void performCommonTasks()
	{
				
		System.out.println("common taskes in loginpage ");
		super.performCommonTasks();
	}
	
	public static void main(String[] args) {
		
		LoginPage logopt = new LoginPage();
		logopt.findElement();
		logopt.clickElement();
		logopt.enterText();
		logopt.performCommonTasks();
        
	}

}
