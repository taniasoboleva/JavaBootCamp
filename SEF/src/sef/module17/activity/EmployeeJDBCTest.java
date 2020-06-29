package sef.module17.activity;
//Needs to be completed
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import junit.framework.TestCase;

public class EmployeeJDBCTest extends TestCase {

	EmployeeJDBC emp;
	Employee e1;
	
	protected void setUp() throws Exception {
	//setUp() is used to initialize member data which would be used by all/most of its methods
		emp = new EmployeeJDBC();	
			
		e1 = new Employee();
		e1.setId("1");
		e1.setFirstName("Marco");
		e1.setLastName("Chau");
		e1.setSalary(666);		
		
		emp.insertEmployee(e1);
		
	}

	public void testCreateConnection() {
		Connection con = emp.createConnection();
		assertNotNull(con);		
	}
	
	public void testInsertEmployee(){
		//complete the code here
		Employee e2 = new Employee();
		e2.setId("2");
		e2.setFirstName("John");
		e2.setLastName("Doe");
		e2.setSalary(555);		
		
		emp.insertEmployee(e2);
		
		Employee result = emp.findEmployeeById("2");
		
		assertEquals(result.getId(), "2");
		assertEquals(result.getFirstName(), "John");
		assertEquals(result.getLastName(), "Doe");
		assertEquals(result.getSalary(), 555);
	}

	public void testFindEmployeeById_MatchFound() {
		//complete the code here
		e1 = emp.findEmployeeById("1");
		assertEquals(e1.getFirstName(), "Marco");
	}

	public void testFindEmployeeById_NoMatchFound() {
		//complete the code here
		e1 = emp.findEmployeeById("5");
		assertNull(e1);
	}
	
	
	public void testFindEmployeeByName_MatchFound() {
		//complete the code here
		ArrayList <Employee> list = emp.findEmployeesByName("Ben");
		assertEquals(0, list.size());
	}
	
	public void testFindEmployeeByName_NoMatchFound() {
		//complete the code here
		ArrayList <Employee> list = emp.findEmployeesByName("Sparta");
		assertEquals(0, list.size());

	}

	public void testFindEmployeeBySalary_NoMatchFound() {
		//complete the code here
		ArrayList <Employee> list = emp.findEmployeesBySalary(898);
		assertEquals(0, list.size());
	}	
	
	protected void tearDown() throws Exception {
		Connection con = emp.createConnection();
		PreparedStatement pStmt = con.prepareStatement("delete from employee where id = ?");
		pStmt.setInt(1, 1);
		pStmt.executeUpdate();
		PreparedStatement pStmt2 = con.prepareStatement("delete from employee where id = ?");
		pStmt2.setInt(1, 2);
		pStmt2.executeUpdate();
		con.close();
    }
	
}
