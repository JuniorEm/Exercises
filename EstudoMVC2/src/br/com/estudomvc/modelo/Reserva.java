package br.com.estudomvc.modelo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Reserva {
	private int reservaNumero;
	private Date dataDaReserva;
	
	//Constructor
	public Reserva() {
		Random randomize = new Random();
		setReservaNumero(randomize.nextInt());
		Calendar calendar = Calendar.getInstance();
		Date date = new Date();
		calendar.setTime(date);
		setDataDaReserva(calendar.getTime());
	}
	
	//Getters and Setters
	public int getReservaNumero() {
		return reservaNumero;
	}

	public void setReservaNumero(int reservaNumero) {
		this.reservaNumero = reservaNumero;
	}

	public Date getDataDaReserva() {
		return dataDaReserva;
	}

	public void setDataDaReserva(Date dataDaReserva) {
		this.dataDaReserva = dataDaReserva;
	}
	
	//Methods
	public String toString() {
		return "\nNúmero da Reserva: " + reservaNumero +
				"Data da Reserva: " + dataDaReserva;
	}
	
	
}
