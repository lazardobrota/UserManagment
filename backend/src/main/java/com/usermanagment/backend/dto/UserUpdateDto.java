package com.usermanagment.backend.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserUpdateDto {

    @NotNull
    private int id;

    @NotBlank
    @NotNull
    @Size(max = 30)
    private String name;

    @NotBlank
    @NotNull
    @Size(max = 30)
    private String lastname;

    @NotBlank
    @NotNull
    @Size(max = 30)
    private String email;

    @NotBlank
    @NotNull
    @Size(max = 50)
    private String address;

    @NotBlank
    @NotNull
    @Size(max = 32)
    private String password;

    @NotBlank
    @NotNull
    private List<String> permissions;
}
