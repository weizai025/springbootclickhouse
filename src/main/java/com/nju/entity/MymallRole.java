package com.nju.entity;

import lombok.Data;


/**
 * @author maw-b
 * @date 2021/6/6 18:09
 */
@Data
public class MymallRole extends BaseTkEntity {

    private Integer id;

    private String label;

    private String description;

    private Boolean enabled;

}
