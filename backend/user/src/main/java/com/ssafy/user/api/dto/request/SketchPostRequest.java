package com.ssafy.user.api.dto.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class SketchPostRequest {

    @NotEmpty(message = "필수 입력 항목입니다.")
    private String userId;

    private String sketchName;

    private String sketchImgUrl;

}
