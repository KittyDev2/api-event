package com.eventostec.api.domain.address;

import com.eventostec.api.domain.event.Event;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue
    private UUID Id;

    private String city;
    private String uf;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Event event;


}
