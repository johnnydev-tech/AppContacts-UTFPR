package tech.johnnydev.appcontacts.ui.contact

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CloudOff

import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import tech.johnnydev.appcontacts.R
import tech.johnnydev.appcontacts.ui.theme.AppContactsTheme

//icons


@Composable
fun ContatctsListScreen(modifier: Modifier = Modifier) {

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun AppBar(modifier: Modifier = Modifier) {
    TopAppBar(
        modifier = modifier.fillMaxWidth(),

        title = { Text(text = stringResource(R.string.contacts_label)) },

        )
}

@Preview
@Composable
private fun AppBarPreview() {
    AppContactsTheme {
        AppBar()
    }
}

@Composable
private fun LoadingContent(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        CircularProgressIndicator(
            color = MaterialTheme.colorScheme.primary,
            trackColor = MaterialTheme.colorScheme.surfaceVariant,
            modifier = modifier.size(64.dp)
        )
        Spacer(modifier = Modifier.size(16.dp))
        Text(
            text = stringResource(R.string.loading_contacts),
            style = MaterialTheme.typography.titleLarge.copy(
                color = MaterialTheme.colorScheme.primary,
            )
        )

    }
}

@Preview
@Composable
private fun LoadingContentPreview() {
    AppContactsTheme {
        LoadingContent()
    }
}

@Composable
private fun ErrorContent(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(

            imageVector = Icons.Filled.CloudOff,
            contentDescription = "Erro ao carregar os contatos",
            tint = MaterialTheme.colorScheme.primary,
            modifier = modifier.size(64.dp)
        )
        Spacer(modifier = Modifier.size(16.dp))
        Text(
            text = stringResource(R.string.error_contacts_label),
            style = MaterialTheme.typography.titleLarge.copy(
                color = MaterialTheme.colorScheme.primary,
            )
        )
    }
}

@Preview
@Composable
private fun ErroContentPreview() {
    AppContactsTheme {
        ErrorContent()
    }
}