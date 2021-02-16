public class Invoice {
	private String partNumber;
	private String description;
	private int quantity;
	private double pricePerItem;

	public Invoice (String partNumber, String description, int quantity, double pricePerItem) {
		this.partNumber = partNumber;
		this.description = description;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setQuantity(int quantity) {
		if (quantity < 0) {
			quantity = 0;
		}
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setPricePerItem(double pricePerItem) {
		if (pricePerItem < 0) {
			pricePerItem = 0.0;
		}
		this.pricePerItem = pricePerItem;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public double getInvoiceAmount() {
		return quantity * pricePerItem;
	}
}
