package com.bb.item.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class IdList  implements Serializable {
    private List<Integer> ids;
}
