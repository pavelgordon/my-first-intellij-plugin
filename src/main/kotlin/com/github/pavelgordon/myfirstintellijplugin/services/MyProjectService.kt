package com.github.pavelgordon.myfirstintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.pavelgordon.myfirstintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
