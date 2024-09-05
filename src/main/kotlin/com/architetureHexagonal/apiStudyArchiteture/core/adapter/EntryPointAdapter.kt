package com.architetureHexagonal.apiStudyArchiteture.core.adapter

import com.architetureHexagonal.apiStudyArchiteture.core.domain.Course
import com.architetureHexagonal.apiStudyArchiteture.core.ports.entryPointPort
import com.architetureHexagonal.apiStudyArchiteture.core.ports.entryPointRepositoryPort

class EntryPointAdapter(
    private val entryPointPortRepositoryPort: entryPointRepositoryPort
): entryPointPort{

    override fun create(course: Course){
        entryPointPortRepositoryPort.created(course)
    }


}