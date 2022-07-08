package com.answers;

import java.util.Scanner;

class Candidate{
	String name;
	int totalRating;
	int totalContest;
	public Candidate(String name, int totalRating, int totalContest) {
		 
		this.name = name;
		this.totalRating = totalRating;
		this.totalContest = totalContest;
	}
	
	
}
class Validator{
	Boolean flag = false;
	Boolean flag1 = false;
	
	public String eligible(Candidate data) throws CriteriaMismatchException{
		String out="";
		//try {
			if(data.totalRating<1000) {
				flag=true;
				throw new CriteriaMismatchException("candidate not eligible");
			}else if(data.totalContest<10) {
				flag=true;
				throw new CriteriaMismatchException("candidate not eligible");
			}else {
				out="eligible candidate";
			}
//		}catch(CriteriaMismatchException ex) {
//			out=ex.getMessage();
//		}catch(Exception e) {
//			out=e.getMessage();
//		}
		return out;
		
	}
	public String sendInvite(Candidate data) {
		//String out="";
		try {
		
//			if(flag==true) {
//				throw new Exception("canidate not eligible");
//			}else if(flag1==true) {
//				throw new Exception("other exception");
//			}else {
//				out="invitation send";
//			}
			
//			
			if(eligible(data).equals("eligible candidate")) {
				System.out.println("eligible candidate");
				return "invitation send";
			}else {
				return "candidate not eligible";
			}
			
		}catch(CriteriaMismatchException ex) {
			return ex.getMessage();
		}catch(Exception e) {
			return "other exception";
		}
		//return out;
	}
}
class CriteriaMismatchException extends Exception{
	
	public CriteriaMismatchException(String msg) {
		super(msg);
	}
}
public class DoSelectOne {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Candidate data = new Candidate("steve",1020,11);
		Validator check = new Validator();
//		try {
//			check.eligible(data);
//		}catch(CriteriaMismatchException e)
//		{
//			System.out.println(e.getMessage());
//			
//		}
		System.out.println(check.sendInvite(data));
		
		
	}
}
