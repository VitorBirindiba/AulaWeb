package com.web.teste;

import org.junit.Assert;
import org.junit.Test;

import com.web.util.SuperUtil;


public class SuperUtilTeste {
	
	@Test	
	public void escapeHTMLTest() {
		
		String escapedHtml = SuperUtil.escapeHTML("<script>alert(1);</script>");
		
		String expected = "&lt;script&gt;alert(1);&lt;/script&gt;";
		Assert.assertEquals(expected, escapedHtml);
	}

}
