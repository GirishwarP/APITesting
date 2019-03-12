package com.APITestMethods;

import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import com.Base.Base;
import com.pojo.Employee;

public class EmployeeManagementAPI extends Base {

	public Response getEmployees() {
		return given().when().get(apiUrl);
	}

	public Response getEmployee(int id) {
		return given().contentType(ContentType.JSON).body(id).when().get(apiUrl);
	}

	public Response postEmployeeWithPayload(Employee payload) {
		return given().contentType(ContentType.JSON).body(payload).when().post(apiUrl);
	}
	
	
	public Response postEmployeeWithJSONString(String payload) {
		return given().contentType(ContentType.JSON).body(payload).when().post(apiUrl);
	}
	
	public Response deleteEmployeeWithPayload(Employee payload) {
		return given().contentType(ContentType.JSON).body(payload).when().delete(apiUrl);
	}
	
	public Response deleteEmployeeWithJSONString(String payload) {
		return given().contentType(ContentType.JSON).body(payload).when().delete(apiUrl);
	}
	
	public Response putEmployeeWithPayload(Employee payload) {
		return given().contentType(ContentType.JSON).body(payload).when().put(apiUrl);
	}
	
	public Response putEmployeeWithJSONString(String payload) {
		return given().contentType(ContentType.JSON).body(payload).when().put(apiUrl);
	}
}
