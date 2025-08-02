package com.example.gitproject

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun GitExample(modifier: Modifier = Modifier) {
    Row (
        modifier = modifier.fillMaxWidth().padding(20.dp),
        horizontalArrangement = Arrangement.Center

    ){
        Text(
            text = "Git Demo 1 "
        )
        Text(
            text = "Git Demo 2 "
        )
        Text(
            text = "Git Demo 3 "
        )


    }
}