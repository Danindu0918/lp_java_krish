package com.clientv1.amnclientv1.modles.client.category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDTO {
    private Long id;
    private String categoryName;
    private String prefix;
    private Integer customerNumberLength;
    private Integer customerLastNumber;
    private String note;
    private Boolean isNic;
    private Boolean isPhone;
    private Boolean isEmail;
    private String branch;
    private String status;
}
