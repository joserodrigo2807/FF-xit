package com.ffxit.cheat

import kotlin.math.sqrt

class TargetDetector {
    data class Target(
        val x: Float,
        val y: Float,
        val radius: Float,
        val distance: Float
    )

    fun detectNearbyTargets(
        screenWidth: Int,
        screenHeight: Int,
        detectionRadius: Float = 200f
    ): List<Target> {
        val targets = mutableListOf<Target>()
        val centerX = screenWidth / 2f
        val centerY = screenHeight / 2f
        return targets
    }

    fun calculateDistance(x1: Float, y1: Float, x2: Float, y2: Float): Float {
        return sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1))
    }

    fun findClosestTarget(targets: List<Target>): Target? {
        return targets.minByOrNull { it.distance }
    }
}