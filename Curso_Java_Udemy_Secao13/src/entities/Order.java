package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private Integer id;
	private LocalDateTime moment;
	private OrderStatus status;
	
	private List<OrderItem> itens = new ArrayList<>();
	
	public Order() {
	}

	public Order(Integer id, LocalDateTime moment, OrderStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}
	
	public Order(LocalDateTime moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	
	public List<OrderItem> getItens() {
		return itens;
	}

	public void addItens(OrderItem item) {
		this.itens.add(item);
	}
	
	public void removeItens(OrderItem item) {
		this.itens.remove(item);
	}

	public Double total() {
		Double sum = 0.0;
		for (int i = 0; i < itens.size(); i++) {
			sum += this.itens.get(i).subTotal();
		}
		return sum;
	}
	
	@Override
	public String toString() {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		return "Order [id=" + id + ", moment=" + fmt.format(moment) + ", status=" + status + "]";
	}
	
}
