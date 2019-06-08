package com.st.runner;

import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("=================1.========================");
		Set<String> allKeys= args.getOptionNames();
		System.out.println(allKeys);
		System.out.println("=================2.========================");	
		List<String> nonkeys=args.getNonOptionArgs();
		System.out.println(nonkeys);
		System.out.println("=================3.========================");
		System.out.println(args.containsOption("id"));
		System.out.println("=================4.========================");
		System.out.println(args.containsOption("div"));
		System.out.println("=================5.========================");
		List<String> getValueByKey=args.getOptionValues("db");
		System.out.println(getValueByKey);
	}	

}
