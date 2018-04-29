package com.query_generator;

import java.util.function.Function;

/**
 * Hello world!
 *
 */
public class App 
{
	/**
	 * 
	 */
	private void queryGenerator(){
		Function<String[],String> finalQuery = query -> query[0].split(query[1])[0] + " AND AGE<50 " + query[1] + query[0].split(query[1])[1];
		System.out.println(finalQuery.apply(new String[]{"SELECT ID FROM TEST WHERE 1=1 ORDER BY NAME ASC","ORDER BY"}));
	}
	
	
    public static void main( String[] args )
    {
    	App app = new App();
    	app.queryGenerator();
    }
}
