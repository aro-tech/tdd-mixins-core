/**
 * 
 */
package com.github.aro_tech.tdd_mixins;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.github.aro_tech.extended_mockito.ExtendedBDDMockito;

/**
 * Unit test(s) to verify that the core mixins are present and usable
 * 
 * @author aro_tech
 *
 */
public class AssertJTest implements AssertJ, ExtendedBDDMockito {

	ResultSet mock = mock(ResultSet.class);
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void verify_presence_of_mixins() throws SQLException {
		given(mock.getString(anyInt())).willReturn("12345");
		assertThat(mock.getString(2)).startsWith("123");
		verify(mock).getString(intThat(i -> (Integer)i < 3));
	}
	
	@Test
	public void assertJ_asserts_work() {
		List<String> list = new ArrayList<>();
		
		assertThat(list).isEmpty();
	}

}
