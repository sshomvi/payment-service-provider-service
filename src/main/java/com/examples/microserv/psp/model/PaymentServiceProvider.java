package com.examples.microserv.psp.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="tbl_PaymentServiceProvider")
public class PaymentServiceProvider {

	@Id
	@GeneratedValue
	private Long id;
		
	private String pspCode;
	
	private String pspShortname;
	
	private String pspDescription;
	
	private Boolean active;
	
	@CreationTimestamp
    private LocalDateTime createDateTime;
 
    @UpdateTimestamp
    private LocalDateTime updateDateTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPspCode() {
		return pspCode;
	}

	public void setPspCode(String pspCode) {
		this.pspCode = pspCode;
	}

	public String getPspShortname() {
		return pspShortname;
	}

	public void setPspShortname(String pspShortname) {
		this.pspShortname = pspShortname;
	}

	public String getPspDescription() {
		return pspDescription;
	}

	public void setPspDescription(String pspDescription) {
		this.pspDescription = pspDescription;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public LocalDateTime getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(LocalDateTime createDateTime) {
		this.createDateTime = createDateTime;
	}

	public LocalDateTime getUpdateDateTime() {
		return updateDateTime;
	}

	public void setUpdateDateTime(LocalDateTime updateDateTime) {
		this.updateDateTime = updateDateTime;
	}
}
