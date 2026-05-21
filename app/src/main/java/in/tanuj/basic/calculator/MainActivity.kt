package `in`.tanuj.basic.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import `in`.tanuj.basic.calculator.ui.theme.JetPackCompose_2Theme
import `in`.tanuj.basic.calculator.view.HomeCalculator

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetPackCompose_2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HomeCalculator(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
