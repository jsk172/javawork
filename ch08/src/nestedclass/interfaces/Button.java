package nestedclass.interfaces;

public class Button {
	//필드 - 인터페이스형 맴버 변수
	private OnClickListener listener;
	
	//내부 인터페이스
	interface OnClickListener{
		public void OnClick();
	}
	//외부에서 구현 객체 입력
	public void setListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	//버튼터치
	public void touch() {
		listener.OnClick();
	}
}
