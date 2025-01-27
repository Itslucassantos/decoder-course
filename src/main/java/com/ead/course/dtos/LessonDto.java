package com.ead.course.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LessonDto {

    @NotBlank
    private String title;

    private String description;

    @NotBlank
    private String videoUrl;
}
