package com.xworkz.tejaa.constant;

public enum SeatType {
	
	RECLINER("R18"), PREMIUM("P19"), EXECUTIVE("E20");

    private String seatNo;

    private SeatType(String seatNo) {
        this.seatNo = seatNo;
    }

    public String getSeatNo() {
        return seatNo;
    }

}
