package com.example.evaluation3.data.model

import com.example.evaluation3.data.model.base.BaseEntity
import jakarta.persistence.*

@Entity
@Table(name = "sub_specie")
class SubSpecie(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    override val id: Long = 0,

    @Column(name = "name", nullable = false)
    val name: String,

    @ManyToOne
    val specie: Specie
) : BaseEntity()