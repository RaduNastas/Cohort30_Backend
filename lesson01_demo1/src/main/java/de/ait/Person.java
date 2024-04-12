package de.ait;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Getter
@Setter
public class Person {
    private String firstName;
    private String lastName;
    private  int age;
}