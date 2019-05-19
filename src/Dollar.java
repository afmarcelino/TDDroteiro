class Dollar extends Money {
	
	Dollar(int amount) {
		this.amount = amount;
	}
	
	Dollar times(int multiplier) {
		amount = amount * multiplier;
		return new Dollar(amount);
	}
}