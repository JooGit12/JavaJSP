package com.kwon.apr261uch.main;

public class StringCleaner {
	public static String clean(String s) {
		s = s.replace("&amp;quot;", "");
		s = s.replace("&lt;b&gt;", "");
		s = s.replace("&apos;", "");
		s = s.replace("<b>", "");
		s = s.replace("</b>", "");
		s = s.replace("&lt;/b&gt;", "");
		s = s.replace("&quot;", "");
		return s;
	}
}
