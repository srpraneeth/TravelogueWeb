package com.travelogue.users.utils;

import java.text.FieldPosition;
import java.util.Date;

import com.fasterxml.jackson.databind.util.ISO8601DateFormat;
import com.fasterxml.jackson.databind.util.ISO8601Utils;

public class RFC3339DateFormat extends ISO8601DateFormat {

	private static final long serialVersionUID = -7317388960557778745L;

	// Same as ISO8601DateFormat but serializing milliseconds.
	@Override
	public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition) {
		String value = ISO8601Utils.format(date, true);
		toAppendTo.append(value);
		return toAppendTo;
	}

}