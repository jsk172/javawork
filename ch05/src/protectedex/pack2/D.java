package protectedex.pack2;

import protectedex.pack1.A;

//A를 D가 상속받음.
public class D extends A{
	public D() {
		super();
		this.field = "Yes";
		this.method();
	}

}
