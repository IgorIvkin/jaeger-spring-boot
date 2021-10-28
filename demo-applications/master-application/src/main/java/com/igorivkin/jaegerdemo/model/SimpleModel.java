package com.igorivkin.jaegerdemo.model;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SimpleModel {

    private String firstName;

    private String lastName;
}
