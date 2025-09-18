package com.fatec.decode.ui.components

import android.annotation.SuppressLint
import android.app.Activity
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext


@SuppressLint("ContextCastToActivity")
@Composable
 fun FinalScoreDialog(
    score: Int,
    onPlayAgain: () -> Unit,
    modifier: Modifier = Modifier
) {
    val activity = (LocalContext.current as Activity)

    AlertDialog(
        onDismissRequest = {
            // Feche o diálogo quando o usuário clicar fora do diálogo ou no botão Voltar.
            // Se você quiser desativar essa funcionalidade, basta usar um onCloseRequest vazio.
        },
        title = { Text("Parabéns!") },
        text = { Text("Você fez: $score pontos") },
        modifier = modifier,
        dismissButton = {
            TextButton(
                onClick = {
                    activity.finish()
                }
            ) {
                Text("Sair")
            }
        },
        confirmButton = {
            TextButton(onClick = onPlayAgain) {
                Text("Jogar Novamente")
            }
        }
    )
}