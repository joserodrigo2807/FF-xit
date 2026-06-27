package com.ffxit.cheat

data class CheatSettings(
    var targetLockEnabled: Boolean = false,
    var autoAimEnabled: Boolean = false,
    var aimSpeed: Int = 100,
    var fovBoostEnabled: Boolean = false,
    var fovPercent: Int = 100
)