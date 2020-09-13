package com.test.sp.ioc3;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Alba {	
	@NonNull
	private String name;	
	@NonNull
	private Integer age;
}
