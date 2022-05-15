package com.wellsfargo.test.dto;

import java.time.LocalDate;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NgoDto {

	private Long id;

	@NotBlank
	@Length(min = 3, max = 100)
	private String ngoName;

	@NotBlank
	@Length(min = 3, max = 50)
	private String username;

	@NotBlank
	@Length(min = 3, max = 50)
	private String password;

	@NotBlank
	@Length(min = 3, max = 50)
	private String address;

	@NotNull
	@Min(value = 1000000000)
	@Max(value = 9999999999L)
	private Long phoneNumber;

	@NotNull
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Past
	private LocalDate startedIn;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNgoName() {
		return ngoName;
	}

	public void setNgoName(String ngoName) {
		this.ngoName = ngoName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDate getStartedIn() {
		return startedIn;
	}

	public void setStartedIn(LocalDate startedIn) {
		this.startedIn = startedIn;
	}
	
	

}
