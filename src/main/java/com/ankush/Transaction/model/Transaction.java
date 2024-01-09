package com.ankush.Transaction.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "transaction")
public class Transaction {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "this_account_id")
    @NotNull
	private int this_account_id;
	@Column(name = "other_account_number")
	
	private int other_account_number;
	@Column(name = "other_account_holder_name")
	
	private String other_account_holder_name;
	@Column(name = "other_account_metadata_image_URL")

	private String other_account_metadata_image_URL;
	@Column(name = "details_value_amount")

	private int details_value_amount;
	@Column(name = "details_value_currency")

	private String details_value_currency;
	@Column(name = "details_transaction_amount")

	private int details_transaction_amount;
	@Column(name = "details_transaction_currency")

	private String details_transaction_currency;
	@NotNull
	@Column(name = "transaction_type")
	private String transaction_type;
	
	@Column(name = "details_description")
    private String details_description;

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Transaction(int id, int this_account_id, int other_account_number, String other_account_holder_name,
			String other_account_metadata_image_URL, int details_value_amount, String details_value_currency,
			int details_transaction_amount, String details_transaction_currency, String transaction_type,
			String details_description) {
		super();
		this.id = id;
		this.this_account_id = this_account_id;
		this.other_account_number = other_account_number;
		this.other_account_holder_name = other_account_holder_name;
		this.other_account_metadata_image_URL = other_account_metadata_image_URL;
		this.details_value_amount = details_value_amount;
		this.details_value_currency = details_value_currency;
		this.details_transaction_amount = details_transaction_amount;
		this.details_transaction_currency = details_transaction_currency;
		this.transaction_type = transaction_type;
		this.details_description = details_description;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getThis_account_id() {
		return this_account_id;
	}

	public void setThis_account_id(int this_account_id) {
		this.this_account_id = this_account_id;
	}

	public int getOther_account_number() {
		return other_account_number;
	}

	public void setOther_account_number(int other_account_number) {
		this.other_account_number = other_account_number;
	}

	public String getOther_account_holder_name() {
		return other_account_holder_name;
	}

	public void setOther_account_holder_name(String other_account_holder_name) {
		this.other_account_holder_name = other_account_holder_name;
	}

	public String getOther_account_metadata_image_URL() {
		return other_account_metadata_image_URL;
	}

	public void setOther_account_metadata_image_URL(String other_account_metadata_image_URL) {
		this.other_account_metadata_image_URL = other_account_metadata_image_URL;
	}

	public int getDetails_value_amount() {
		return details_value_amount;
	}

	public void setDetails_value_amount(int details_value_amount) {
		this.details_value_amount = details_value_amount;
	}

	public String getDetails_value_currency() {
		return details_value_currency;
	}

	public void setDetails_value_currency(String details_value_currency) {
		this.details_value_currency = details_value_currency;
	}

	public int getDetails_transaction_amount() {
		return details_transaction_amount;
	}

	public void setDetails_transaction_amount(int details_transaction_amount) {
		this.details_transaction_amount = details_transaction_amount;
	}

	public String getDetails_transaction_currency() {
		return details_transaction_currency;
	}

	public void setDetails_transaction_currency(String details_transaction_currency) {
		this.details_transaction_currency = details_transaction_currency;
	}

	public String getTransaction_type() {
		return transaction_type;
	}

	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}

	public String getDetails_description() {
		return details_description;
	}

	public void setDetails_description(String details_description) {
		this.details_description = details_description;
	}

}
