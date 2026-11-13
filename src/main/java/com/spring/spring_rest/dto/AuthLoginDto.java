package com.spring.spring_rest.dto;

/**
 * Data Transfer Object representing user credentials for 
 * authentication login requests.
 */
public class AuthLoginDto {

  private String username;
  private String password;
  
  /**
   * Constructs a new {@code AuthLoginDto} with the specified credentials.
   *
   * @param username the user's login username
   * @param password the user's login password
   */
  public AuthLoginDto(String username, String password) {
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
