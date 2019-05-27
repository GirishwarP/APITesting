package com.EmployeManagement.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.APITestMethods.EmployeeManagementAPI;
import com.pojo.Employee;

public class EmployeeManagementTest {

	EmployeeManagementAPI api = new EmployeeManagementAPI();
	Employee postPayload = new Employee.Builder().setId(10).setName("Pramod Tekale").setProfession("Sr. Test Engineer").build();
	Employee putPayload = new Employee.Builder().setId(1).setName("Navin K").setProfession("Sr. Director").build();
	Employee deletePayload = new Employee.Builder().setId(1).setName("Navin K").setProfession("Sr. Director").build();
	
	@Test
	public void getAllEmployeesTest() {
		Assert.assertEquals(api.getEmployees().getStatusCode(), 200);
	}

	@Test
	public void getEmployeeTest() {
		Assert.assertEquals(api.getEmployee(3).getStatusCode(), 200);
		Assert.assertEquals(api.getEmployee(8).getStatusCode(), 200);
	}

	@Test
	public void postEmployeeWithPayloadTest() {
		Assert.assertEquals(api.postEmployeeWithPayload(postPayload).getStatusCode(), 200);
	}
	
	@Test
	public void postEmployeeWithJSONStringTest() {
		Assert.assertEquals(api.postEmployeeWithJSONString("{\"id\":26,\"name\":\"Alok Kumar\",\"profession\":\"Doctor\"}").getStatusCode(), 200);
	}
	
	@Test
	public void putEmployeeWithPayloadTest() {
		Assert.assertEquals(api.putEmployeeWithPayload(putPayload).getStatusCode(), 200);
	}
	
	@Test
	public void putEmployeeWithJSONStringTest() {
		Assert.assertEquals(api.putEmployeeWithJSONString("{\"id\":39,\"name\":\"Ashwin T\",\"profession\":\"Sr. Manager\"}").getStatusCode(), 200);
	}
	
	@Test 
	public void deleteEmployeeWithPayloadTest() {
		Assert.assertEquals(api.deleteEmployeeWithPayload(deletePayload).getStatusCode(), 200);
	}
	
	@Test
	public void deleteEmployeeWithJSONStringTest() {
		Assert.assertEquals(api.deleteEmployeeWithJSONString("{\"id\":26,\"name\":\"Alok Kumar\",\"profession\":\"Doctor\"}").getStatusCode(), 200);
	}
}
