package com.alexandros.today.entity;

import com.alexandros.today.enums.Category;
import com.alexandros.today.security.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(name = "category", nullable = false)
    private Category category;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "completed", nullable = false)
    private Boolean completed;

    @Column(name = "order_number", nullable = false)
    private Integer order;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User owner;

    @Column(name = "scheduled_complete_date", nullable = false)
    private LocalDate scheduledCompleteDate;

    @Column(name = "complete_date", nullable = false)
    private LocalDate completeDate;

}
