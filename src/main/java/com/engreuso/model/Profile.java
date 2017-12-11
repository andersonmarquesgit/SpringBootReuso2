package com.engreuso.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tb_profile")
public class Profile {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="function_id")
	private Function function;
	
	@Column(name="view")
	private Boolean viewOperation;
	
	@Column(name="insert")
	private Boolean insertOperation;
	
	@Column(name="update")
	private Boolean updateOperation;
	
	@Column(name="delete")
	private Boolean deleteOperation;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User customer) {
		this.user = customer;
	}

	public Function getFunction() {
		return function;
	}

	public void setFunction(Function function) {
		this.function = function;
	}

	public Boolean getViewOperation() {
		return viewOperation;
	}

	public void setViewOperation(Boolean viewOperation) {
		this.viewOperation = viewOperation;
	}

	public Boolean getInsertOperation() {
		return insertOperation;
	}

	public void setInsertOperation(Boolean insertOperation) {
		this.insertOperation = insertOperation;
	}

	public Boolean getUpdateOperation() {
		return updateOperation;
	}

	public void setUpdateOperation(Boolean updateOperation) {
		this.updateOperation = updateOperation;
	}

	public Boolean getDeleteOperation() {
		return deleteOperation;
	}

	public void setDeleteOperation(Boolean deleteOperation) {
		this.deleteOperation = deleteOperation;
	}

}
