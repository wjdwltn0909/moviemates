package com.nc13.moviemates.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter @Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "movies")
public class MovieEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String genre;
    private String director;
    private String actors;
    private double rate;
    private String plot;
    private Date releaseDate;
    private int runningTime;
    private String posterUrl;
}
