package com.javaprogrammer.userchatspring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Like_all")
public class Like {

    @Id
    @Column
    @GeneratedValue
    private int id;
    @ManyToOne
    private Post post;
    @ManyToOne
    private Image image;
    @ManyToOne
    private User user;
    @Column(name = "status_like")
    @Enumerated(EnumType.STRING)
    private LikeStatus likeStatus;
}
