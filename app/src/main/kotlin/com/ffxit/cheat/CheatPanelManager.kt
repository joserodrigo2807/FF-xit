package com.ffxit.cheat

import android.content.Context
import android.graphics.PixelFormat
import android.view.Gravity
import android.view.WindowManager
import android.widget.LinearLayout
import android.widget.ToggleButton
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Button
import androidx.core.content.ContextCompat

class CheatPanelManager(private val context: Context) {
    private val windowManager = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
    private var panelView: LinearLayout? = null
    private var isShowing = false
    private var cheatSettings = CheatSettings()

    fun show() {
        if (isShowing) return

        panelView = LinearLayout(context).apply {
            orientation = LinearLayout.VERTICAL
            setBackgroundColor(ContextCompat.getColor(context, android.R.color.darker_gray))
            layoutParams = LinearLayout.LayoutParams(450, LinearLayout.LayoutParams.WRAP_CONTENT)
        }

        // Título
        val titleView = TextView(context).apply {
            text = "FF XIT - Painel de Cheat"
            textSize = 16f
            setPadding(10, 10, 10, 10)
            setTextColor(ContextCompat.getColor(context, android.R.color.white))
        }

        // Travamento de Alvo
        val lockTargetLabel = TextView(context).apply {
            text = "Travamento de Alvo"
            textSize = 14f
            setPadding(10, 5, 10, 5)
            setTextColor(ContextCompat.getColor(context, android.R.color.white))
        }

        val lockTargetToggle = ToggleButton(context).apply {
            textOn = "ATIVADO"
            textOff = "DESATIVADO"
            setOnCheckedChangeListener { _, isChecked ->
                cheatSettings.targetLockEnabled = isChecked
                updateTargetLock(isChecked)
            }
        }

        // Mira Automática
        val autoAimLabel = TextView(context).apply {
            text = "Mira Automática"
            textSize = 14f
            setPadding(10, 5, 10, 5)
            setTextColor(ContextCompat.getColor(context, android.R.color.white))
        }

        val autoAimToggle = ToggleButton(context).apply {
            textOn = "ATIVADO"
            textOff = "DESATIVADO"
            setOnCheckedChangeListener { _, isChecked ->
                cheatSettings.autoAimEnabled = isChecked
                updateAutoAim(isChecked)
            }
        }

        // Velocidade de Mira Automática
        val aimSpeedLabel = TextView(context).apply {
            text = "Velocidade de Mira: 100%"
            textSize = 12f
            setPadding(10, 5, 10, 5)
            setTextColor(ContextCompat.getColor(context, android.R.color.white))
        }

        val aimSpeedSeekBar = SeekBar(context).apply {
            max = 200
            progress = 100
            setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                    cheatSettings.aimSpeed = progress
                    aimSpeedLabel.text = "Velocidade de Mira: $progress%"
                }
                override fun onStartTrackingTouch(seekBar: SeekBar?) {}
                override fun onStopTrackingTouch(seekBar: SeekBar?) {}
            })
        }

        // Aumento de FOV
        val fovLabel = TextView(context).apply {
            text = "Aumento de FOV"
            textSize = 14f
            setPadding(10, 10, 10, 5)
            setTextColor(ContextCompat.getColor(context, android.R.color.white))
        }

        val fovToggle = ToggleButton(context).apply {
            textOn = "ATIVADO"
            textOff = "DESATIVADO"
            setOnCheckedChangeListener { _, isChecked ->
                cheatSettings.fovBoostEnabled = isChecked
                updateFOV(isChecked)
            }
        }

        // Percentual de FOV
        val fovPercentLabel = TextView(context).apply {
            text = "FOV: 100%"
            textSize = 12f
            setPadding(10, 5, 10, 5)
            setTextColor(ContextCompat.getColor(context, android.R.color.white))
        }

        val fovSeekBar = SeekBar(context).apply {
            max = 150
            progress = 100
            setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                    cheatSettings.fovPercent = progress
                    fovPercentLabel.text = "FOV: $progress%"
                }
                override fun onStartTrackingTouch(seekBar: SeekBar?) {}
                override fun onStopTrackingTouch(seekBar: SeekBar?) {}
            })
        }

        // Status
        val statusLabel = TextView(context).apply {
            text = "Status: INATIVO"
            textSize = 12f
            setPadding(10, 10, 10, 5)
            setTextColor(ContextCompat.getColor(context, android.R.color.holo_green_light))
        }

        // Botão Fechar
        val closeButton = Button(context).apply {
            text = "Fechar Painel"
            setPadding(10, 10, 10, 10)
            setOnClickListener { hide() }
        }

        panelView?.apply {
            addView(titleView)
            addView(lockTargetLabel)
            addView(lockTargetToggle)
            addView(autoAimLabel)
            addView(autoAimToggle)
            addView(aimSpeedLabel)
            addView(aimSpeedSeekBar)
            addView(fovLabel)
            addView(fovToggle)
            addView(fovPercentLabel)
            addView(fovSeekBar)
            addView(statusLabel)
            addView(closeButton)
        }

        val params = WindowManager.LayoutParams().apply {
            type = WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY
            format = PixelFormat.TRANSLUCENT
            flags = WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE
            width = 450
            height = WindowManager.LayoutParams.WRAP_CONTENT
            gravity = Gravity.TOP or Gravity.START
            x = 0
            y = 100
        }

        windowManager.addView(panelView, params)
        isShowing = true
    }

    fun hide() {
        if (!isShowing || panelView == null) return
        windowManager.removeView(panelView)
        panelView = null
        isShowing = false
    }

    fun toggle() {
        if (isShowing) hide() else show()
    }

    private fun updateTargetLock(enabled: Boolean) {
        // Implementar travamento de alvo
        // Detecta inimigos próximos e mantém a mira neles
    }

    private fun updateAutoAim(enabled: Boolean) {
        // Implementar mira automática
        // Move a câmera automaticamente para apontar inimigos
    }

    private fun updateFOV(enabled: Boolean) {
        // Aumentar o campo de visão da câmera
    }

    fun getSettings(): CheatSettings = cheatSettings
}
