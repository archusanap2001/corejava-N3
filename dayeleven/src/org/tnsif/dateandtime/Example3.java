package org.tnsif.dateandtime;

import java.time.OffsetDateTime;
import java.time.OffsetTime;

public class Example3 {

	public static void main(String[] args) {
		OffsetDateTime d=OffsetDateTime.now();
		OffsetTime d1=OffsetTime.now();
		System.out.println(d1);
		System.out.println(d);
	}

}
