package org.store.core.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdateItemRequest {

    private Long id;
    private String name;
    private String model;
    private String brand;
    private Integer price;

}