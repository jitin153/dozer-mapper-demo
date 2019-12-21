package com.jitin.dozercustomconverter.util;

import org.dozer.DozerConverter;

public class CustomBooleanStringConverter extends DozerConverter<Boolean, String> {

	private static final String VALUE_Y = "Yes";
	private static final String VALUE_N = "No";

	public CustomBooleanStringConverter() {
		super(Boolean.class, String.class);
	}

	@Override
	public Boolean convertFrom(String destination, Boolean source) {
		if (destination != null) {
			if (VALUE_Y.equalsIgnoreCase(destination)) {
				source = Boolean.TRUE;
			} else {
				source = Boolean.FALSE;
			}
			return source;
		}
		return null;
	}

	@Override
	public String convertTo(Boolean source, String destination) {
		if (source != null) {
			if (Boolean.TRUE.equals(source)) {
				destination = VALUE_Y;
			} else {
				destination = VALUE_N;
			}
			return destination;
		}
		return null;
	}
}
