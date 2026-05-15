package com.github.novotnyr.mincssrel.css

import com.github.novotnyr.mincssrel.shared.SharedMessageService
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.components.service
import com.intellij.openapi.project.DumbAwareAction
import com.intellij.openapi.ui.Messages

class CssAction : DumbAwareAction() {
    override fun actionPerformed(e: AnActionEvent) {
        val project = e.project ?: return
        val sharedContentModuleMessage = project.service<SharedMessageService>().getMessage()
        Messages.showInfoMessage("An action from a CSS content module was invoked. " +
                "Accessing $sharedContentModuleMessage", "MinCSSRel - CSS Action")
    }
}