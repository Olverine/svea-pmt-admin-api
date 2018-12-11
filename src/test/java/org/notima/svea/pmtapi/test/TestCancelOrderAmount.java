package org.notima.svea.pmtapi.test;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.notima.svea.pmtapi.PmtApiClientRF;

public class TestCancelOrderAmount {

	@Before
	public void setUp() throws Exception {
			
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testCancelOrderAmount() {

		PmtApiClientRF client = new PmtApiClientRF();
		try {
		
			client.init(TestConfig.SERVER, TestConfig.MERCHANT_ID, TestConfig.SECRET_WORD);

			if (TestConfig.checkoutOrderId==null) {
				fail("No valid checkout order id specified in test-credentials.properties");
			}
			
			String result = client.cancelOrderAmount(TestConfig.checkoutOrderId, 200);
			
			System.out.println(result);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			fail(e.getMessage());
			
		}
		
	}
		



}