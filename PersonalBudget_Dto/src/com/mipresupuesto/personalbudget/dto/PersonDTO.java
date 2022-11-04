package com.mipresupuesto.personalbudget.dto;

public final class PersonDTO {

	private String id;
	private String idCard;
	private String firstName;
	private String middleName;
	private String firstSurname;
	private String secondSurname;
	private String name;
	private String lastName;
	private String completeName;

	public PersonDTO() {
		setId("");
		setIdCard("");
		setFirstName("");
		setMiddleName("");
		setFirstSurname("");
		setSecondSurname("");
		setName("");
		setLastName("");
		setCompleteName("");
	}

	@SuppressWarnings("all")
	public PersonDTO(final String id, final String idCard, final String firstName, final String middleName,
			final String firstSurname, final String secondSurname, final String name, final String lastName,
			final String completeName) {
		setId(id);
		setIdCard(idCard);
		setFirstName(firstName);
		setMiddleName(middleName);
		setFirstSurname(firstSurname);
		setSecondSurname(secondSurname);
		setName(name);
		setLastName(lastName);
		setCompleteName(completeName);
	}

	public static final PersonDTO create() {
		return new PersonDTO();
	}

	public final String getId() {
		if (id == null) {
			setId("");
		}
		return id.trim();
	}

	public final void setId(final String id) {
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

	public final String getName() {
		if (name == null) {
			setName("");
		}
		return name.trim();
	}

	public final void setName(final String name) {
		this.name = name;
	}

	public final String getLastName() {
		if (lastName == null) {
			setLastName("");
		}
		return lastName.trim();
	}

	public final void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	public final String getCompleteName() {
		if (completeName == null) {
			setCompleteName("");
		}
		return completeName.trim();
	}

	public final void setCompleteName(final String completeName) {
		this.completeName = completeName;
	}
}