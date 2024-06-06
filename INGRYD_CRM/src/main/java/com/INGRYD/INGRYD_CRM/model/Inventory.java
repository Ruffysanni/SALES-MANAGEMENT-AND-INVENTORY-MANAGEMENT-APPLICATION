package com.INGRYD.INGRYD_CRM.model;

import com.INGRYD.INGRYD_CRM.model.Enum.Status;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@Entity(name = "inventory_table")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inventoryID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "productID")
    private Product product;

    @NotNull
    @NotBlank(message = "Please enter a value")
    private int stockQuantity;

    @NotNull
    @NotBlank()
    private int remainingQuantity;
    @Enumerated(EnumType.STRING)
    private Status status;

}
