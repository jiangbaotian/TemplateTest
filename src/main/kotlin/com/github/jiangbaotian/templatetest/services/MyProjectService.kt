package com.github.jiangbaotian.templatetest.services

import com.github.jiangbaotian.templatetest.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
