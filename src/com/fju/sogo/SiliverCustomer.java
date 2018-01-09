package com.fju.sogo;

public class SiliverCustomer extends Customer {
	public SiliverCustomer(int amount,float discount) {
		super(amount);
			super.discount =0.1f;
			super.amount =amount;
		}
		// TODO Auto-generated constructor stub
	
		// TODO Auto-generated constructor stub
	
	@Override
		public void print() {
			int total =(int)(amount*(1-discount));
			System.out.println(amount+"\t"+total);
		
	}	
	
	
}
