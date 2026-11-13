package com.spring.spring_rest.dto;

/**
 * Data Transfer Object representing user registration details for 
 * API requests.
 */
public class AuthUserRegisterDto {

  private String username;
  private String password;

  /**
   * Constructs a new {@code AuthUserRegisterDto} with the specified 
   * registration credentials.
   *
   * @param username the desired username for the new account
   * @param password the desired password for the new account
   */
  public AuthUserRegisterDto(String username, String password) {
    this.username = username;
    this.password = password;
  }

  /**
   * Returns the user's username.
   *
   * @return the username
   */
  public String getUsername() {
    return username;
  }

  /**
   * Sets the user's username.
   *
   * @param username the username to set
   */
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * Returns the user's password.
   *
   * @return the password
   */
  public String getPassword() {
    return password;
  }

  /**
   * Sets the user's password.
   *
   * @param password the password to set
   */
  public void setPassword(String password) {
    this.password = password;
  }  
}
