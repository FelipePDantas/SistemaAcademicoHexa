package com.architetureHexagonal.apiStudyArchiteture.core.ports

import com.architetureHexagonal.apiStudyArchiteture.core.domain.Course

interface entryPointRepositoryPort {

   fun created(course: Course)
}