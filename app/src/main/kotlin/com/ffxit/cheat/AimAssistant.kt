package com.ffxit.cheat

import kotlin.math.abs
import kotlin.math.min

class AimAssistant(private val settings: CheatSettings) {
    private var targetX: Float = 0f
    private var targetY: Float = 0f
    private var currentAimX: Float = 0f
    private var currentAimY: Float = 0f

    fun calculateAimAdjustment(
        currentX: Float,
        currentY: Float,
        targetX: Float,
        targetY: Float,
        deltaTime: Float
    ): Pair<Float, Float> {
        this.targetX = targetX
        this.targetY = targetY
        this.currentAimX = currentX
        this.currentAimY = currentY

        if (!settings.autoAimEnabled) {
            return Pair(currentX, currentY)
        }

        val speed = settings.aimSpeed / 100f
        val maxMovement = 15f * speed * deltaTime

        val deltaX = targetX - currentX
        val deltaY = targetY - currentY
        val distance = kotlin.math.sqrt(deltaX * deltaX + deltaY * deltaY)

        if (distance < 1f) {
            return Pair(targetX, targetY)
        }

        val moveX = (deltaX / distance) * min(maxMovement, distance)
        val moveY = (deltaY / distance) * min(maxMovement, distance)

        return Pair(currentX + moveX, currentY + moveY)
    }

    fun shouldLockTarget(targetX: Float, targetY: Float): Boolean {
        if (!settings.targetLockEnabled) return false

        val distX = abs(targetX - currentAimX)
        val distY = abs(targetY - currentAimY)
        val lockThreshold = 30f

        return distX < lockThreshold && distY < lockThreshold
    }
}