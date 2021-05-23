package com.bdtech.com;

 public class Encupsulaiton {

	private String userName;
	private String password;
	private String email;
	private String fname;
	private String lname;

	
	  public String getName() {
		  return userName;
	  
	  }
	  
	  public void setName(String userName) { 
		  this.userName = userName;
	  
	  }
	  
	  public String getPassword() { 
		  return password;
	  
	  }
	  
	  public void setPassword(String password) {
		  this.password = password;
	  
	  }
	  
	  public String getEmail() { 
		  return email;
	  
	  }
	  
	  public void setEmail(String email) { 
		  this.email = email;
	  
	  }
	  
	  public String getFname() {
		  return fname;
	  
	  }
	  
	  public void setFname(String fname) { 
		  this.fname = fname;
	  
	  }
	  
	  public String getLname() { 
		  return lname;
	  
	  }
	  
	  public void setLname(String lname) { 
		  this.lname = lname;
	  
	  }
	  
	  public static void main(String[] args) {
		  Encupsulaiton e = new   Encupsulaiton();
	
	  
	  e.setName("mdislam123"); 
	  e.setPassword("12345");
	  e.setEmail("wislam@gmail.com");
	  e.setFname("md "); 
	  e.setLname("islam");
	  String uName=e.getName(); 
	  System.out.println(uName);
	  System.out.println(e.getPassword());
	  System.out.println(e.email);
	  System.out.println(e.fname);
	  System.out.println(e.lname);
	  
		/*
		 * System.out.print("user name:::" + e.getName());
		 * System.out.print("password:::" + e.getPassword());
		 * System.out.print("email:::" + e.getEmail()); System.out.print("firstName:::"
		 * + e.getFname()); System.out.print("last name:::" + e.getLname());
		 * System.out.println("+++++++++++");
		 */
	  }
	/*
	 * public void setMethod(String fname, String lname, String email, String uid,
	 * int pass) {
	 * 
	 * } public Encupsulaiton getMethod() { return new Encupsulaiton(); } public
	 * static void main(String[] args) { Encupsulaiton e = new Encupsulaiton();
	 * e.setMethod("md", "islam", "wsilam@yahoo.com", "mdislam123", 123456);
	 * System.out.println("                 "+e.getMethod()); }
	 */

}
