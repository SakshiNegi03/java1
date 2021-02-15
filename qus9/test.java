package qus9;

import java.util.Scanner;	
	enum Rent{
	    Delhi(2000),
	    Mumbai(6000),
	    Noida(3000),
	    Gurugram(4000);

	    private final int price;

	    Rent(int price) {
	        this.price = price;
	    }

	    public int getPrice() {
	        return price;
	    }

	}
	public class test {
	    Rent rent;
	    test(Rent rent){
	        this.rent = rent;
	    }

	    public static void main(String[] args) {
	        for(Rent house : Rent.values()){
	            System.out.println("House name : "+house+"\nRent : "+house.getPrice());
	        }

	    }
	}