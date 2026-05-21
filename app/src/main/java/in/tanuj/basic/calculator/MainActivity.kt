package `in`.tanuj.basic.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import `in`.tanuj.basic.calculator.ui.theme.JetPackCompose_2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetPackCompose_2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TextField(
                        value = "0",
                        onValueChange = {},
                        modifier = Modifier.padding(innerPadding)
                    )
                    TextField(value = "0",
                        onValueChange = {})
                }
            }
        }
    }
}
