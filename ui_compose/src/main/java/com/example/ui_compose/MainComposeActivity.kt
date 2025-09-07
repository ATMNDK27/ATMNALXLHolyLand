package com.example.ui_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ui_compose.ui.theme.AtmnAlXLApplicationTheme

class MainComposeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val testTextList = listOf("你好","安德鲁")
        setContent {
            AtmnAlXLApplicationTheme {
                Scaffold (modifier = Modifier.fillMaxSize()){ innerPadding ->
                    CreatElementText(testTextList, modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var expanded by remember { mutableStateOf(false) }
    Surface(
        color = MaterialTheme.colorScheme.primary,
        modifier = modifier.padding(vertical = 4.dp, horizontal = 8.dp)) {
        Row (modifier = Modifier.fillMaxWidth().padding(24.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically){
            Column (modifier = modifier.weight(1f)){
                Text(
                    text = "Hello $name!"
                )
            }
            ItemButton(switch = expanded, onSwitchChange = {
                expanded = it
            })
        }
    }
}

@Composable
fun ItemButton(switch: Boolean,onSwitchChange: (Boolean) -> Unit){
    ElevatedButton(
        onClick = {
            onSwitchChange(!switch)
        }
    ) {
        Text(if (switch)"确定" else "不确定")
    }
}

@Composable
fun CreatElementText(nameList: List<String>, modifier: Modifier){
        Column(modifier = Modifier.padding(vertical = 4.dp)) {
            for (name in nameList){
                Greeting(name,modifier)
            }
        }
}

@Preview(showBackground = true ,widthDp = 320)
@Composable
fun GreetingPreview() {
    val testTextList = listOf("你好","安德鲁")
    AtmnAlXLApplicationTheme {
        CreatElementText(testTextList, modifier = Modifier)
    }
}