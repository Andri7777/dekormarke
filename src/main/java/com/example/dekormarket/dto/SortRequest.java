package com.example.dekormarket.dto;

import org.springframework.data.domain.Sort;

public class SortRequest {

    private String sortFrom;

    private Sort.Direction direction;

    public SortRequest() {}

    public String getSortFrom() {
        return sortFrom;
    }

    public void setSortFrom(String sortFrom) {
        this.sortFrom = sortFrom;
    }

    public Sort.Direction getDirection() {
        return direction;
    }

    public void setDirection(Sort.Direction direction) {
        this.direction = direction;
    }
}
