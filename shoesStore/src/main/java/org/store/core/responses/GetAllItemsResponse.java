package org.store.core.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.store.core.domain.Item;

import java.util.List;

@AllArgsConstructor
@Getter
public class GetAllItemsResponse extends CoreResponse {

    private List<Item> items;


}