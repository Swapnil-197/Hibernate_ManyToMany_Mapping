package com.tka.pojo;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Reader {
    @Id
    @GeneratedValue
    @Column(unique = true , nullable = false)
	private Integer readerId;
    @Column(unique = true , nullable = false)
    private String email;
    @Column(unique = false , nullable = false)
	private String firstName;
    @Column(unique = false , nullable = false)
	private String lastName;
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "reader_subscription")
	private Set<Subscription> subscriptions;
	
	public Reader() {
		super();
		
	}

	public Integer getReaderId() {
		return readerId;
	}

	public void setReaderId(Integer readerId) {
		this.readerId = readerId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Set<Subscription> getSubscriptions() {
		return subscriptions;
	}

	public void setSubscriptions(Set<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}
	
}
