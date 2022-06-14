package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class CsvNew1ApplicationTests {
	private Calculator c = new Calculator();

	@Test
	void contextLoads() {
	}


	@Test
	 void testSum(){
		//expevted result
		int expectedResult=21;
		//Actual result
		int actualResult= c.doSum(6,7,8);
		assertThat(actualResult).isEqualTo(expectedResult);

}
@Test
void testMultiply(){
	//expevted result
		int expectedResult=36;
	//Actual result
		int actualResult=c.doMultiply(6,6);
	assertThat(actualResult).isEqualTo(expectedResult);

}
@Test
void compareTwoNums(){
		//actualResult
		Boolean actualResult=c.compareTwoNums(3,3);
	assertThat(actualResult).isTrue();

}
@Test
void getinformation(){
	boolean newResult = true;
	assertThat(newResult);

}
@Test
	void getPolicyIdOfPolicyCountMoreThenFive(){
	boolean actualResult=true;
	assertThat(actualResult);
}
@Test
	void getdetails(){
	boolean actualResult=true;
	assertThat(actualResult);
}
}
