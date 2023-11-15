package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {
	private String name;
	private String email;
	private LocalDate birthDate;
	private Order order;
	
	public Client() {
	}

	public Client(String name, String email, LocalDate birthDate, Order order) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
		this.order = order;
	}
	
	public Client(String name, String email, LocalDate birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY:\n");
		sb.append("Order moment: " + getOrder().getMoment().format(fmt) + "\n");
		sb.append("Order status: " + getOrder().getStatus() + "\n");
		sb.append("Client: " + this.name + " (" + this.birthDate.format(fmt2) + ") - " + this.email + "\n");
		sb.append("Order items:\n");
		for (OrderItem items : getOrder().getItens()) {
			sb.append(items + "\n");
		}
		sb.append("Total price: $" + String.format("%.2f", this.order.total()));
		return sb.toString();
	}

	
}
