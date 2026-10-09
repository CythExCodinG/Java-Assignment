package Model;

public class Order {
	int orderID;
	double amount;
	String status;
	
	public Order(int orderID, double i, String status) {
		super();
		this.orderID = orderID;
		this.amount = i;
		this.status = status;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	
	public double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "Order [orderID=" + orderID + ", amount=" + amount + ", status=" + status + "]";
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
