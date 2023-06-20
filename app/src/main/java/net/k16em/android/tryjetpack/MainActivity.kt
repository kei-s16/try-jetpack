package net.k16em.android.tryjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import net.k16em.android.tryjetpack.ui.theme.TryjetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TryjetpackTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        Greeting(name = "Android")
                        Goodbye(name = "Android")
                        Greeting(name = "iOS")
                        Goodbye(name = "iOS")
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TryjetpackTheme {
        Greeting(name = "Android")
    }
}

@Composable
fun Goodbye(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Goodbye, $name.",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GoodbyePreview() {
    TryjetpackTheme {
        Goodbye(name = "Android")
    }
}