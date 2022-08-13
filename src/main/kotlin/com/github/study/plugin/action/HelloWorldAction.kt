package com.github.study.plugin.action

import com.intellij.notification.NotificationDisplayType
import com.intellij.notification.NotificationGroup
import com.intellij.notification.NotificationType
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class HelloWorldAction : AnAction() {

    override fun actionPerformed(event: AnActionEvent) {
        val notificationGroup = NotificationGroup(
            displayId = "myActionId",
            displayType = NotificationDisplayType.BALLOON
        )
        val notification = notificationGroup.createNotification(
            title = "Plugin Study",
            content = "Hello World",
            type = NotificationType.INFORMATION
        ).notify(event.project)
    }
}