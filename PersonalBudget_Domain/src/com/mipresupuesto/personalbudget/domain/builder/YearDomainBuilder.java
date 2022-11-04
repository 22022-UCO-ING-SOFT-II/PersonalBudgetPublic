package com.mipresupuesto.personalbudget.domain.builder;

import java.util.UUID;

import com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID;
import com.mipresupuesto.personalbudget.domain.YearDomain;

public final class YearDomainBuilder {

	private UUID id;
	private int year;

	private YearDomainBuilder() {
		setId(UtilUUID.DEFAULT_UUID);
		setYear(0);
	}

	public static final YearDomainBuilder get() {
		return new YearDomainBuilder();
	}

	public final YearDomainBuilder setId(final UUID id) {
		this.id = (id == null) ? UtilUUID.DEFAULT_UUID : id;
		return this;
	}

	public final YearDomainBuilder setYear(final int year) {
		this.year = year;
		return this;
	}

	public final YearDomain build() {
		return YearDomain.create(id, year);
	}
}
