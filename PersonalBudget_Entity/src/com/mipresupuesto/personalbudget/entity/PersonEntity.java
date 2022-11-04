package com.mipresupuesto.personalbudget.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID;

@Entity
@Table(name = "Person")
public final class PersonEntity {

	@Id
	@Column(name = "id")
	private UUID id;
	@Column(name = "idCard")
	private String idCard;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "middleName")
	private String middleName;
	@Column(name = "firstSurname")
	private String firstSurname;
	@Column(name = "secondSurname	")
	private String secondSurname;

	public PersonEntity() {
		setId(UtilUUID.DEFAULT_UUID);
		setIdCard("");
		setFirstName("");
		setMiddleName("");
		setFirstSurname("");
		setSecondSurname("");
	}

	public PersonEntity(final UUID id, final String idCard, final String firstName, final String middleName,
			final String firstSurname, final String secondSurname) {
		setId(id);
		setIdCard(idCard);
		setFirstName(firstName);
		setMiddleName(middleName);
		setFirstSurname(firstSurname);
		setSecondSurname(secondSurname);
	}

	public static final PersonEntity create() {
		return new PersonEntity();
	}

	public final UUID getId() {
		if (id == null) {
			setId(UtilUUID.DEFAULT_UUID);
		}
		return id;
	}

	public final void setId(final UUID id) {
		this.id = id;
	}

	public final String getIdCard() {
		if (idCard == null) {
			setIdCard("");
		}
		return idCard.trim();
	}

	public final void setIdCard(final String idCard) {
		this.idCard = idCard;
	}

	public final String getFirstName() {
		if (firstName == null) {
			setFirstName("");
		}
		return firstName.trim();
	}

	public final void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public final String getMiddleName() {
		if (middleName == null) {
			setMiddleName("");
		}
		return middleName.trim();
	}

	public final void setMiddleName(final String middleName) {
		this.middleName = middleName;
	}

	public final String getFirstSurname() {
		if (firstSurname == null) {
			setFirstSurname("");
		}
		return firstSurname.trim();
	}

	public final void setFirstSurname(final String firstSurname) {
		this.firstSurname = firstSurname;
	}

	public final String getSecondSurname() {
		if (secondSurname == null) {
			setSecondSurname("");
		}
		return secondSurname.trim();
	}

	public final void setSecondSurname(final String secondSurname) {
		this.secondSurname = secondSurname;
	}
}