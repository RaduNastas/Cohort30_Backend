package de.ait.ec.dto;

import lombok.Data;

@Data //setter, getter, equals, hashcode
public class NewCourseDto {

    private String title;
    private String description;
    private String beginDate;
    private String endDate;
    private Double price;


}
