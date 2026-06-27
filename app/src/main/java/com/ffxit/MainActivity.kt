package com.ffxit

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.ffxit.cheat.CheatPanelManager

class MainActivity : AppCompatActivity() {
    private lateinit var cheatPanelManager: CheatPanelManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cheatPanelManager = CheatPanelManager(this)

        val startButton = findViewById<Button>(R.id.btn_start_cheat)
        val stopButton = findViewById<Button>(R.id.btn_stop_cheat)

        startButton.setOnClickListener {
            cheatPanelManager.show()
        }

        stopButton.setOnClickListener {
            cheatPanelManager.hide()
        }
    }
}