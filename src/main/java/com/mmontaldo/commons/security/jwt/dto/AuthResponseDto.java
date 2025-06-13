package com.mmontaldo.commons.security.jwt.dto;

import java.time.LocalDateTime;

public record AuthResponseDto(String username, String token, LocalDateTime expires) {
}
