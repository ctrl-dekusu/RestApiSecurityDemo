package com.spring.spring_rest.dto;

/**
 * Data Transfer Object representing role registration details for 
 * API requests.
 */
public class AuthRoleRegisterDto {
  
  private String name;

  /**
   * Constructs a new {@code AuthRoleRegisterDto} with the specified 
   * role name.
   *
   * @param name the name of the role to register
   */
  public AuthRoleRegisterDto(String name) {
    this.name = name;
  }

  /**
   * Returns the role name.
   *
   * @return the role name
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the role name.
   *
   * @param name the role name to set
   */
  public void setName(String name) {
    this.name = name;
  } 
}
