package com.infybuzz.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

@Component
public class FirstItemWriter implements ItemWriter<Long>{

	@Override
	public void write(List<? extends Long> items) throws Exception {
		System.out.println("inside the item writer");
		items.stream().forEach(System.out::println);
		
	}

}
