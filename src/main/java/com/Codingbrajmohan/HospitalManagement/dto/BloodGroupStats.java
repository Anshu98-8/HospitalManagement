package com.Codingbrajmohan.HospitalManagement.dto;

import com.Codingbrajmohan.HospitalManagement.entity.type.BloodGroupType;
import lombok.Data;

@Data
public class BloodGroupStats {
    private final BloodGroupType bloodGroupType;
    private final Long count;
}
