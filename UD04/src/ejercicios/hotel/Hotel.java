package ejercicios.hotel;

import java.util.List;

public class Hotel {
	private List<Reserva> reservas;
	
	public Hotel(List<Reserva> reservas) {
		this.reservas = reservas;
	}
	public void nuevaReserva(Reserva r) {
		this.reservas.add(r);
	}
}
