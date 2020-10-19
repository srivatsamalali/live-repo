interface DebitCard {
	int cardNo = 123456789;
	// public void withdraw();
	// public abstract void withdraw();
	abstract void withdraw();
    //  error: interface abstract methods cannot have body
        // public void test(){
        // }
}
interface CreditCard {
	// public void withdraw();
	// public abstract void withdraw();
	void pay();
}

//create NetBanking with the methods
// openFixedDeposit();
//  test();