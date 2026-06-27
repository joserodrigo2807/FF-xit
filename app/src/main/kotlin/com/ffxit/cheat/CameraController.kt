package com.ffxit.cheat

class CameraController(private val settings: CheatSettings) {
    private var baseFOV: Float = 60f
    private var currentFOV: Float = 60f

    fun updateFOV(): Float {
        if (!settings.fovBoostEnabled) {
            currentFOV = baseFOV
            return currentFOV
        }

        val fovMultiplier = settings.fovPercent / 100f
        currentFOV = baseFOV * fovMultiplier
        return currentFOV
    }

    fun getCurrentFOV(): Float = currentFOV

    fun setBaseFOV(fov: Float) {
        baseFOV = fov
    }

    fun getZoomLevel(): Float {
        return (60f / currentFOV)
    }
}