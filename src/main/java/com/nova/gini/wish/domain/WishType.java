package com.nova.gini.wish.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Wish type is a domain class that represents a kind of Wish. Pre-defined types are Financial,
 * Purchase, Skill etc.
 */
@Entity
@Table(name = "wish_type")
public class WishType {

    @Id
    @Column(nullable = false)
    @SequenceGenerator(name = "SEQ_NEW_WISH_TYP", sequenceName = "SEQ_NEW_WISH_TYPE", allocationSize = 50, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_NEW_WISH_TYPE")
    private Long id;

    @Basic
    @Column(name = "icon_id")
    private Long iconId;

    @Basic
    @Column(nullable = false)
    private String name;

    @Basic
    @Column()
    private String description;

    // Default constructor
    public WishType() {

    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public Long getIconId() {

        return iconId;
    }

    public void setIconId(Long iconId) {

        this.iconId = iconId;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }
}
