package com.spring.spring_rest.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.spring.spring_rest.service.CustomUserDetailService;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;

/**
 * Spring Security configuration class defining HTTP security rules, 
 * password encoding, and authentication management.
 */
@EnableWebSecurity 
@Configuration 
public class SecurityConfig {

  private CustomUserDetailService userDetailsService;

  /**
   * Constructs a {@code SecurityConfig} with the specified 
   * {@link CustomUserDetailService}.
   *
   * @param userDetailService the custom user details service 
   * used for loading user data
   */
  public SecurityConfig(CustomUserDetailService userDetailService) {
    this.setUserDetailsService(userDetailsService); 
  }
  
  /**
   * Sets the {@link CustomUserDetailService} instance.
   *
   * @param userDetailsService the custom user details service to set
   */
  public void setUserDetailsService(
    CustomUserDetailService userDetailsService
  ) {
    this.userDetailsService = userDetailsService;
  }

  /**
   * Configures the application's {@link SecurityFilterChain}, 
   * disabling CSRF, permitting public access to {@code /api/auth/**}, 
   * and requiring authentication for all other requests.
   *
   * @param security the {@link HttpSecurity} builder to configure
   * @return the configured {@link SecurityFilterChain}
   * @throws Exception if an error occurs while building the 
   * security filter chain
   */
  @Bean 
  SecurityFilterChain filterChain(
    HttpSecurity security
  ) throws Exception {
    return security.csrf(AbstractHttpConfigurer::disable)
            .authorizeHttpRequests(
              auth -> auth
              .requestMatchers("/api/auth/**")
              .permitAll()
              .anyRequest()
              .authenticated()
            ).httpBasic(Customizer.withDefaults())
            .build();
  }

  /**
   * Provides a {@link BCryptPasswordEncoder} bean for hashing user 
   * passwords.
   *
   * @return a new {@link BCryptPasswordEncoder} instance
   */
  @Bean
  BCryptPasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

  /**
   * Exposes the {@link AuthenticationManager} bean from the Spring 
   * {@link AuthenticationConfiguration}.
   *
   * @param authentication the {@link AuthenticationConfiguration} instance
   * @return the configured {@link AuthenticationManager}
   * @throws Exception if an error occurs while retrieving the 
   * authentication manager
   */
  @Bean
  AuthenticationManager authenticationManager(
    AuthenticationConfiguration authentication
  ) throws Exception {
    return authentication.getAuthenticationManager();
  }
}
