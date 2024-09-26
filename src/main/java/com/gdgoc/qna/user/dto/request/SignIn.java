package com.gdgoc.qna.user.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;

@Getter
public class SignIn {

  @NotEmpty(message = "이메일은 필수항목입니다.")
  @Email(message = "올바른 이메일 형식을 적어주세요.")
  private String email;

  @NotEmpty(message = "비밀번호는 필수항목입니다.")
  private String password;

}
