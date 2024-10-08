package com.xworkz.tejaa.runner;

import com.xworkz.tejaa.constant.SeatType;
import com.xworkz.tejaa.constant.TicketType;
import com.xworkz.tejaa.dto.TicketBookDTO;

public class TicketBookRunner {

	public static void main(String[] args) {

		
		TicketBookDTO ticket = new TicketBookDTO("Ibbani Tabbida Ileyali", "PVR Theater", TicketType.ONLINE, SeatType.RECLINER);
        ticket.ticketInfo();
	}

}
