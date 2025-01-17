// Copyright 2000-2023 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package com.intellij.openapi.options.newEditor

import com.intellij.util.messages.Topic
import org.jetbrains.annotations.ApiStatus

@ApiStatus.Experimental
@ApiStatus.Internal
interface SettingsDialogListener {
  fun afterApply(settingsEditor: AbstractEditor) {}

  companion object {
    @Topic.AppLevel
    @JvmStatic
    val TOPIC: Topic<SettingsDialogListener> = Topic(SettingsDialogListener::class.java, Topic.BroadcastDirection.NONE)
  }
}