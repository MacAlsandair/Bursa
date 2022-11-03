package com.macalsandair;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.macalsandair.model.SocialClass;

public class SocialClassTest {
	
	@Test
	public void testReturnSocialClass_POOR () {
		Assertions.assertEquals(SocialClass.POOR, SocialClass.returnSocialClass("ridsh"));
		
	}
	
	@Test
	public void testReturnSocialClass_RICH () {
		Assertions.assertEquals(SocialClass.RICH, SocialClass.returnSocialClass("rich"));
		
	}
}
