package com.xworkz.Laptop.External;

import com.xworkz.Laptop.Internal.AirtelInternetProvider;
import com.xworkz.Laptop.Internal.BookMyShowMovieBookingProvider;
import com.xworkz.Laptop.Internal.BookingProvider;
import com.xworkz.Laptop.Internal.DellProvider;
import com.xworkz.Laptop.Internal.ExtrmeAirtelInternetProvider;
import com.xworkz.Laptop.Internal.Fast5gExtreme;
import com.xworkz.Laptop.Internal.InternetProvider;
import com.xworkz.Laptop.Internal.JioAirtelInternetProvider;
import com.xworkz.Laptop.Internal.LenovoProvider;
import com.xworkz.Laptop.Internal.MovieBookingProvider;
import com.xworkz.Laptop.Internal.SatJioAirtelInternetProvider;

public class ProviderRunner {

	public static void main(String[] args) {
		
		
BookingProvider bookingProvider=new BookingProvider("jashb", "nsbdsvdv");
		
		
        boolean ref=bookingProvider.equals(null);
        
      System.out.println(ref);
      System.out.println(bookingProvider.toString());
      bookingProvider.service();
      
      System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<");
      
      DellProvider DellProvider =new DellProvider("zmndb", "msnhdbd");
        boolean ref1=DellProvider.equals(DellProvider);
        System.out.println(ref1);
        System.out.println(DellProvider.toString());
        DellProvider.service();
        
        System.out.println("..................................");
        LenovoProvider lenovoProvider1 =new LenovoProvider("snbd ", "skjehg", 25);
        LenovoProvider lenovoProvider2 =new LenovoProvider("jawh", "jashdbv", 25);
        boolean ref2=lenovoProvider1.equals(lenovoProvider2);
        System.out.println(ref2);
        System.out.println(lenovoProvider1.toString());
        lenovoProvider1.service();
        
        System.out.println("running in provider");
        
        InternetProvider internrtProvider=new InternetProvider("jhsbdd", "snbdd");
        boolean ref3=internrtProvider.equals(internrtProvider);
        System.out.println(ref3);
        System.out.println(internrtProvider.toString());
        internrtProvider.service();
        
        System.out.println("//////////////////////////////");
        
        MovieBookingProvider movieBookingProvider =new MovieBookingProvider("ajsbhd", "msnhhbd");
        boolean ref4=movieBookingProvider.equals(movieBookingProvider);
        System.out.println(ref4);
        System.out.println(movieBookingProvider.toString());
        movieBookingProvider.book();
        movieBookingProvider.cancel();
        movieBookingProvider.service();
        
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        
        BookMyShowMovieBookingProvider bookMyShowMovieBookingProvider=new BookMyShowMovieBookingProvider("nsbdv", "snbd  ", "snd");
        boolean ref5=bookMyShowMovieBookingProvider.equals(bookMyShowMovieBookingProvider);
        System.out.println(ref5);
        System.out.println(bookMyShowMovieBookingProvider.toString());
        bookMyShowMovieBookingProvider.book();
        bookMyShowMovieBookingProvider.cancel();
        bookMyShowMovieBookingProvider.service();
        
        System.out.println("------------------------");
        
        AirtelInternetProvider airtelInternetProvider =new AirtelInternetProvider("smdn", "sknd");
        boolean ref6=airtelInternetProvider.equals(airtelInternetProvider);
        System.out.println(ref6);
        System.out.println(airtelInternetProvider.toString());
        airtelInternetProvider.service();
        
        System.out.println("+++++++++++++++++++++");
        
        ExtrmeAirtelInternetProvider extremeAirtelInternetProvider=new ExtrmeAirtelInternetProvider("sdn", "skhdb");
        boolean ref7=extremeAirtelInternetProvider.equals(extremeAirtelInternetProvider);
        System.out.println(ref7);
        System.out.println(extremeAirtelInternetProvider.toString());
        extremeAirtelInternetProvider.service();
        
        System.out.println("=============");
        
        Fast5gExtreme fast5gExtreme=new Fast5gExtreme("smnd", "smndb");
        boolean ref8=fast5gExtreme.equals(fast5gExtreme);
        System.out.println(ref8);
        System.out.println(fast5gExtreme.toString());
        fast5gExtreme.service();
        
        System.out.println("running in provider");
        JioAirtelInternetProvider jioInternetProvider=new JioAirtelInternetProvider("sjfb", "sndb ");
        boolean ref9=jioInternetProvider.equals(airtelInternetProvider);
        System.out.println(ref9);
        System.out.println(jioInternetProvider.toString());
        jioInternetProvider.service();
        
        
        System.out.println("???????????????????????");
        
        
        
        SatJioAirtelInternetProvider satjioInternetProvider=new SatJioAirtelInternetProvider("smndbv", "dbv", 16," 14/09/2024");
        boolean ref0=satjioInternetProvider.equals(jioInternetProvider);
        System.out.println(ref0);
        System.out.println(satjioInternetProvider.toString());
        satjioInternetProvider.service();

	}

}
