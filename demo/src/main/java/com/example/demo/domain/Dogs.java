package com.example.demo.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="DOGTYPE")

public class Dogs {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String dogtype;

    @ElementCollection
    private Collection<String> breed;

}
