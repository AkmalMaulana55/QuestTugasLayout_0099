package com.example.tugasactivity3

import androidx.annotation.DimenRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.TextUnit

@Composable
fun ukuranFont(@DimenRes id: Int): TextUnit =
    with(LocalDensity.current) { dimensionResource(id).toSp() }

@Composable
fun KartuProfil(
    warnaCard: Int,
    nama: Int,
    alamat: Int,
    telepon: Int? = null,
    pakaiCursive: Boolean = false,
    warnaAlamat: Int = R.color.yellow
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                horizontal = dimensionResource(R.dimen.padding_card),
                vertical = dimensionResource(R.dimen.padding_card_vertikal)
            ),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(warnaCard)
        )
    )
}