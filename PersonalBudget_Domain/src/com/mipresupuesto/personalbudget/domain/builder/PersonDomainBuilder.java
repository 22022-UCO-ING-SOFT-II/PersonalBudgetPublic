package com.mipresupuesto.personalbudget.domain.builder;

import java.util.UUID;

import com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID;
import com.mipresupuesto.personalbudget.domain.PersonDomain;

public final class PersonDomainBuilder {

	private UUID id;
	private String idCard;
	private String firstName;
	private String middleName;
	private String firstSurname;
	private String secondSurname;

	private PersonDomainBuilder() {
		setId(UtilUUID.DEFAULT_UUID);
		setIdCard("");
		setFirstName("");
		setMiddleName("");
		setFirstSurname("");
		setSecondSurname("");
	}

	public static final PersonDomainBuilder get() {
		return new PersonDomainBuilder();
	}

	public final PersonDomainBuilder setId(final UUID id) {
		this.id = (id == null) ? UtilUUID.DEFAULT_UUID : id;
		return this;
	}

	private final PersonDomainBuilder setIdCard(final String idCard) {
		this.idCard = (idCard == null) ? "" : idCard.trim();
		return this;
	}

	private final PersonDomainBuilder setFirstName(final String firstName) {
		this.firstName = (firstName == null) ? "" : firstName.trim();
		return this;
	}

	private final PersonDomainBuilder setMiddleName(final String middleName) {
		this.middleName = (middleName == null) ? "" : middleName.trim();
		return this;
	}

	private final PersonDomainBuilder setFirstSurname(final String firstSurname) {
		this.firstSurname = (firstSurname == null) ? "" : firstSurname.trim();
		return this;
	}

	private final PersonDomainBuilder setSecondSurname(final String secondSurname) {
		this.secondSurname = (secondSurname == null) ? "" : firstSurname.trim();
		return this;
	}

	public final PersonDomain build() {
		return PersonDomain.create(id, idCard, firstName, middleName, firstSurname, secondSurname);
	}
}
