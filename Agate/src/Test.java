
public class Test {

	public static void main(String[] args) {
		
		AddNewCampaignUI view=new AddNewCampaignUI();
		Client model1=new Client();
		Campaign model2=new Campaign();
		AddNewCampaign controller=new AddNewCampaign(model1, view,model2);
		view.setVisible(true);
	}
}
