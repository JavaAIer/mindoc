package com.dwl.mindoc.domain;

import java.util.HashMap;
import java.util.Map;

public class BaseFreeMarkerVo {
	//https://paskaa.iteye.com/blog/1508351
	public static Map<String,String > tags ;
	/*
	 * \": 双引号		\\: 反斜杠		\r: 回车
		\b: 退格键		\': 单引号		\n: 换行             
		\t:Tab			\f:Form feed	\l:<           
		\g:>          	\a:&         	\{:{
	 * */
	
	 static {
		tags=new HashMap<String,String>();
		tags.put("\"","\\\"");
		tags.put("\\","\\\\");
		tags.put("'","\\\'");
		tags.put("\n","\\\n");
		tags.put("<","\\l");
		tags.put(">","\\g");
		tags.put("&","\\a");
		tags.put("{","\\{");
		tags.put("}","\\}");
	}
	public static  String replaceTags(String input )
	{
		return input ;
	}
}
