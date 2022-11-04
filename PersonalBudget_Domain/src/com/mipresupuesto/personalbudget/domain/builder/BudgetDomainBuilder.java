package com.mipresupuesto.personalbudget.domain.builder;

import static com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID.DEFAULT_UUID;
import static com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID.getDefaultUUID;

import java.util.UUID;

import com.mipresupuesto.personalbudget.domain.BudgetDomain;
import com.mipresupuesto.personalbudget.domain.PersonDomain;
import com.mipresupuesto.personalbudget.domain.YearDomain;

public final class BudgetDomainBuilder {

	private UUID id;
	private YearDomain year;
	private PersonDomain person;

	private BudgetDomainBuilder() {
		setId(DEFAULT_UUID);
		setYear(year);
		setPerson(person);
	}

	public static final BudgetDomainBuilder get() {
		return new BudgetDomainBuilder();
	}

	public final BudgetDomainBuilder setId(final UUID id) {
		this.id = getDefaultUUID(id);
		return this;
	}

	public final BudgetDomainBuilder setYear(final YearDomain year) {
		this.year = (year == null) ? YearDomainBuilder.get().build() : year;
		return this;
	}

	private final BudgetDomainBuilder setPerson(final PersonDomain person) {
		this.person = (person == null) ? PersonDomainBuilder.get().build() : person;
		return this;
	}

	public final BudgetDomain build() {
		return BudgetDomain.create(id, year, person);
	}

}