package com.architetureHexagonal.apiStudyArchiteture.core.domain

import com.architetureHexagonal.apiStudyArchiteture.core.domain.enums.CourseTypeEnum
import java.math.BigDecimal
import java.util.UUID

class Course (
    val id: UUID? = null,
    val name: String,
    val monthlyCost: BigDecimal,
    val status: CourseTypeEnum,
    val istitutionId: UUID
)