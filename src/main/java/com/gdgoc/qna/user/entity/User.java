package com.gdgoc.qna.user.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(unique = true)
  private String email;

  @Column(unique = true)
  private String username;

  private String password;

  @Builder
  public User(
          String email,
          String username,
          String password
  ) {
    this.email = email;
    this.username = username;
    this.password = password;
  }
}
