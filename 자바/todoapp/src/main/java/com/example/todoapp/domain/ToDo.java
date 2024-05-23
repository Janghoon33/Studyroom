package com.example.todoapp.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "ToDo")
@Table(name = "todo")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String todo;


}
