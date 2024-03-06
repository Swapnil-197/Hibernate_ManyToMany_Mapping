package com.tka.pojo;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Subscription {
	
	@Id
	@GeneratedValue
	private Integer subscriptionId;
	private String subscriptionName; 
	private Set<Reader> readers;
	
	public Integer getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(Integer subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public String getSubscriptionName() {
		return subscriptionName;
	}

	public void setSubscriptionName(String subscriptionName) {
		this.subscriptionName = subscriptionName;
	}

	public Set<Reader> getReaders() {
		return readers;
	}

	public void setReaders(Set<Reader> readers) {
		this.readers = readers;
	}

	
}
