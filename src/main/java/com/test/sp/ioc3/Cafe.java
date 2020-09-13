package com.test.sp.ioc3;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Cafe {
	@NonNull
	private String name;
	@NonNull
	private String address;
	@NonNull
	private Alba alba;
}
