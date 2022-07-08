package com.example.evaluation3.data.model

import com.example.evaluation3.data.model.base.BaseEntity
import jakarta.persistence.*

@Entity
@Table(name = "sub_specie")
class SubSpecie(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    override val id: Long,

    @Column(name = "name", nullable = false)
    val name: String,

    @Column(name = "specie")
    @ManyToOne
    val specie: Specie
) : BaseEntity()