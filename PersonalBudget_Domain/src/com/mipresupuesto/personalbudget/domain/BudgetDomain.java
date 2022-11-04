package com.mipresupuesto.personalbudget.domain;

import java.util.UUID;

import com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID;
import com.mipresupuesto.personalbudget.domain.builder.PersonDomainBuilder;
import com.mipresupuesto.personalbudget.domain.builder.YearDomainBuilder;

public final class BudgetDomain {

	private UUID id;
	private YearDomain year;
	private PersonDomain person;

	private BudgetDomain(final UUID id, final YearDomain year, final PersonDomain person) {
		setId(id);
		setYear(year);
		setPerson(person);
	}

	public static final BudgetDomain create(final UUID id, final YearDomain year, final PersonDomain person) {
		return new BudgetDomain(id, year, person);
	}

	private final void setId(final UUID id) {
		this.id = (id == null) ? UtilUUID.DEFAULT_UUID : id;
	}

	private final void setYear(final YearDomain year) {
		this.year = (year == null) ? YearDomainBuilder.get().build() : year;
	}

	private final void setPerson(final PersonDomain person) {
		this.person = (person == null) ? PersonDomainBuilder.get().build() : person;
	}

	public final UUID getId() {
		return id;
	}

	public final YearDomain getYear() {
		return year;
	}

	public final PersonDomain getPerson() {
		return person;
	}
}