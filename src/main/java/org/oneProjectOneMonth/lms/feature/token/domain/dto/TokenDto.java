package org.oneProjectOneMonth.lms.feature.token.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TokenDto {
    private Long id;
    private String refreshtoken;
    private Instant expiredAt;
}