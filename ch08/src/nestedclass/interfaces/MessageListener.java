package nestedclass.interfaces;

public class MessageListener implements Button.OnClickListener{

	@Override
	public void OnClick() {
		System.out.println("문자를 보냅니다.");
	}

}
