package com.mipresupuesto.personalbudget.domain;

import java.util.UUID;

import com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID;

public final class PersonDomain {

	private UUID id;
	private String idCard;
	private String firstName;
	private String middleName;
	private String firstSurname;
	private String secondSurname;

	private PersonDomain(final UUID id, final String idCard, final String firstName, final String middleName,
			final String firstSurname, final String secondSurname) {
		setId(id);
		setIdCard(idCard);
		setFirstName(firstName);
		setMiddleName(middleName);
		setFirstSurname(firstSurname);
		setSecondSurname(secondSurname);
	}

	public static PersonDomain create(final UUID id, final String idCard, final String firstName,
			final String middleName, final String firstSurname, final String secondSurname) {
		return new PersonDomain(id, idCard, firstName, middleName, firstSurname, secondSurname);
	}

	private final void setId(final UUID id) {
		this.id = (id == null) ? UtilUUID.DEFAULT_UUID : id;
	}

	private final void setIdCard(final String idCard) {
		this.idCard = (idCard == null) ? "" : idCard.trim();
	}

	private final void setFirstName(final String firstName) {
		this.firstName = (firstName == null) ? "" : firstName.trim();
	}

	private final void setMiddleName(final String middleName) {
		this.middleName = (middleName == null) ? "" : middleName.trim();
	}

	private final void setFirstSurname(final String firstSurname) {
		this.firstSurname = (firstSurname == null) ? "" : firstSurname.trim();
	}

	private final void setSecondSurname(final String secondSurname) {
		this.secondSurname = (secondSurname == null) ? "" : firstSurname.trim();
	}

	public final UUID getId() {
		return id;
	}

	public final String getIdCard() {
		return idCard;
	}

	public final String getFirstName() {
		return firstName;
	}

	public final String getMiddleName() {
		return middleName;
	}

	public final String getFirstSurname() {
		return firstSurname;
	}

	public final String getSecondSurname() {
		return secondSurname;
	}

	public final String getLastName() {
		return (getFirstSurname() + " " + getSecondSurname()).trim();
	}

	public final String getName() {
		return (getFirstName() + " " + getMiddleName()).trim();
	}

	public final String getCompleteName() {
		return getName() + " " + getLastName();
	}
}
