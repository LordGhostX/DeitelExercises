public class InvoiceTest {
	public static void main(String[] args) {
		Invoice invoice = new Invoice("iPhone", "Apple iPhone 12", 100, 1000);

		System.out.println(invoice.getPartNumber());
		invoice.setPartNumber("iPhone 12");
		System.out.println(invoice.getPartNumber());

		System.out.println(invoice.getDescription());
		invoice.setDescription("The Latest Apple iPhone");
		System.out.println(invoice.getDescription());

		System.out.println(invoice.getQuantity());
		invoice.setQuantity(-50);
		System.out.println(invoice.getQuantity());
		invoice.setQuantity(50);
		System.out.println(invoice.getQuantity());

		System.out.println(invoice.getPricePerItem());
		invoice.setPricePerItem(-50);
		System.out.println(invoice.getPricePerItem());
		invoice.setPricePerItem(2000);
		System.out.println(invoice.getPricePerItem());

		System.out.println(invoice.getInvoiceAmount());
	}
}
