package com.architetureHexagonal.apiStudyArchiteture.core.ports

import com.architetureHexagonal.apiStudyArchiteture.core.domain.Course

interface entryPointPort {

    fun create(course: Course)
}