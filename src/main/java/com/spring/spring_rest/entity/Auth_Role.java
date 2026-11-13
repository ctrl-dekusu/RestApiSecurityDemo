package com.spring.spring_rest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * JPA entity mapped to the {@code auth_role} database table representing 
 * an authorization role.
 */
@Entity
@Table(name = "auth_role")
public class Auth_Role {
  @Id 
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "name")
  private String name;

  /**
   * Default no-argument constructor required by JPA.
   */
  public Auth_Role() {}

  /**
   * Constructs a new {@code Auth_Role} entity with the specified attributes.
   *
   * @param id the unique identifier of the role
   * @param name the name of the role
   */
  public Auth_Role(Long id, String name) {
    this.id = id;
    this.name = name;
  }

  /**
   * Returns the role's unique identifier.
   *
   * @return the role ID
   */
  public Long getId() {
    return id;
  }

  /**
   * Sets the role's unique identifier.
   *
   * @param id the role ID to set
   */
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Returns the role's name.
   *
   * @return the role name
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the role's name.
   *
   * @param name the role name to set
   */
  public void setName(String name) {
    this.name = name;
  }
}
