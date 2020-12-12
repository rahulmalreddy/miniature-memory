package demomyProject.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import demomyProject.bean.User;

public class Usedao {
	
		
	public static Connection getConnection() {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/sql_hr";
		String uname = "root";
		String pass = "password";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,uname,pass);
			
			}
		catch(Exception e) {
			System.out.println("connection failed");
		}
		return con;
	}
	
	
	public static int save(User u) {
		
		int status = 0;
		try {
			Connection con = getConnection();
			 PreparedStatement ps=con.prepareStatement(  
					 "insert into userform(name,password,email,sex,country) values(?,?,?,?,?)");
			 
			 
			    ps.setString(1,u.getName());  
		        ps.setString(2,u.getPassword());  
		        ps.setString(3,u.getEmail());  
		        ps.setString(4,u.getSex());  
		        ps.setString(5,u.getCountry());  
		        status=ps.executeUpdate();  
		}
		catch(Exception e)
		{
			System.out.println(e);
		}  
	    return status; 
	}
	
	public static List <User> getAllRecords(){
		
		 List<User> list=new ArrayList<User>();  
		 try{  
		        Connection con=getConnection();  
		        PreparedStatement ps=con.prepareStatement("select * from userform");  
		        ResultSet rs=ps.executeQuery();  
		        while(rs.next()){  
		            User u=new User();  
		            u.setId(rs.getInt("id"));  
		            u.setName(rs.getString("name"));  
		            u.setPassword(rs.getString("password"));  
		            u.setEmail(rs.getString("email"));  
		            u.setSex(rs.getString("sex"));  
		            u.setCountry(rs.getString("country"));  
		            list.add(u);  
		        }  
		    }catch(Exception e){System.out.println(e);}  
		    return list;  
		}  
	
	public static User getRecordById(int id) {
		
		User u = null;
		   try{  
		        Connection con=getConnection();  
		        PreparedStatement ps=con.prepareStatement("select * from userform where id=?");  
		        ps.setInt(1,id);  
		        ResultSet rs=ps.executeQuery();  
		        while(rs.next()){  
		            u=new User();  
		            u.setId(rs.getInt("id"));  
		            u.setName(rs.getString("name"));  
		            u.setPassword(rs.getString("password"));  
		            u.setEmail(rs.getString("email"));  
		            u.setSex(rs.getString("sex"));  
		            u.setCountry(rs.getString("country"));  
		        }  
		    }catch(Exception e){System.out.println(e);}  
		    return u;  
		
}
	public static int update(User u){  
	    int status=0;  
	    try{  
	        Connection con=getConnection();  
	        PreparedStatement ps=con.prepareStatement(  
	"update userform set name=?,password=?,email=?,sex=?,country=? where id=?");  
	        ps.setString(1,u.getName());  
	        ps.setString(2,u.getPassword());  
	        ps.setString(3,u.getEmail());  
	        ps.setString(4,u.getSex());  
	        ps.setString(5,u.getCountry());  
	        ps.setInt(6,u.getId());  
	        status=ps.executeUpdate();  
	    }catch(Exception e){System.out.println(e);}  
	    return status;  
	} 
	
	public static int delete(User u){  
	    int status=0;  
	    try{  
	        Connection con=getConnection();  
	        PreparedStatement ps=con.prepareStatement("delete from userform where id=?");  
	        ps.setInt(1,u.getId());  
	        status=ps.executeUpdate();  
	    }catch(Exception e){System.out.println(e);}  
	  
	    return status;  
	}  
	
	

}
