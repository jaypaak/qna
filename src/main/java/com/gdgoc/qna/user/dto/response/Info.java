package com.gdgoc.qna.user.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Info {

  private Long id;

  private String email;

  private String username;
}
