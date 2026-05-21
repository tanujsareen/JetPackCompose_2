package `in`.tanuj.basic.calculator.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeCalculator(modifier: Modifier = Modifier) {

    var num1 by remember {
        mutableStateOf("0")
    }
    var num2 by remember {
        mutableStateOf("0")
    }

    var result by remember {
        mutableStateOf("0")
    }

    Column {
        Spacer(modifier = modifier)
        TextField(
            value = num1,
            onValueChange = {
                num1 = it
            },
            modifier = modifier
        )
        Spacer(modifier = Modifier.height(32.dp))
        TextField(
            value = num2,
            onValueChange = {
                num2 = it
            })
        Spacer(modifier = Modifier.height(32.dp))
        Row {
            Button(
                modifier = modifier,
                onClick = {
                    result = (num1.toInt() + num2.toInt()).toString()
                }
            ) {
                Text(text = "Add")
            }

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                modifier = modifier,
                onClick = {
                    result = (num1.toInt() - num2.toInt()).toString()
                }
            ) {
                Text(text = "Subtract")
            }

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                modifier = modifier,
                onClick = {
                    result = (num1.toInt() * num2.toInt()).toString()
                }
            ) {
                Text(text = "Multiply")
            }

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                modifier = modifier,
                onClick = {
                    result = (num1.toInt() / num2.toInt()).toString()
                }
            ) {
                Text(text = "Divide")
            }

            Spacer(modifier = Modifier.height(16.dp))
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Result: $result")


    }


}