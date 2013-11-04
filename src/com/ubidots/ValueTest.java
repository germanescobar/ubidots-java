package com.ubidots;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Test;
import java.util.*;

public class ValueTest {

	@Test
	public void testAttributes() {
		Map<String, Object> raw  = new HashMap<String, Object>();
		raw.put("id", "abcdef");
		raw.put("timestamp", new Long(1383597065839l));
		raw.put("value", new Integer(5678));
		
		Value value = new Value(raw, mock(ApiClient.class));
		
		assertEquals(value.getId(), raw.get("id"));
		assertEquals(value.getTimestamp(), ((Long)raw.get("timestamp")).longValue());
		assertTrue(.1 > Math.abs(value.getValue()
				- ((Integer)raw.get("value")).doubleValue()));
	}

}
