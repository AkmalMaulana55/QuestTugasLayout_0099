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
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(R.drawable.logo_umy),
                contentDescription = null,
                modifier = Modifier
                    .size(dimensionResource(R.dimen.ukuran_logo))
                    .padding(all = dimensionResource(R.dimen.padding_logo))
            )

            Spacer(modifier = Modifier.width(dimensionResource(R.dimen.jarak_logo_teks)))

            Column(
                modifier = Modifier.weight(
                    ResourcesCompat.getFloat(
                        LocalContext.current.resources,
                        R.dimen.bobot_teks
                    )
                )
            ) {
                Text(
                    text = stringResource(nama),
                    fontSize = if (pakaiCursive) ukuranFont(R.dimen.font_nama_cursive)
                    else ukuranFont(R.dimen.font_nama),
                    fontFamily = if (pakaiCursive) FontFamily.Cursive else FontFamily.Default,
                    fontWeight = if (pakaiCursive) FontWeight.Normal else FontWeight.Bold,
                    color = colorResource(R.color.white),
                    modifier = Modifier.padding(top = dimensionResource(R.dimen.padding_nama))
                )
                if (telepon != null) {
                    Text(
                        text = stringResource(telepon),
                        fontSize = ukuranFont(R.dimen.font_telp),
                        color = colorResource(R.color.cyan),
                        modifier = Modifier.padding(top = dimensionResource(R.dimen.padding_telp))
                    )
                }
                Text(
                    text = stringResource(alamat),
                    fontSize = ukuranFont(R.dimen.font_alamat),
                    color = colorResource(warnaAlamat),
                    modifier = Modifier.padding(top = dimensionResource(R.dimen.padding_alamat))
                )
            }

            Spacer(modifier = Modifier.width(dimensionResource(R.dimen.jarak_logo_teks)))

            Image(
                painter = painterResource(R.drawable.logo_umy),
                contentDescription = null,
                modifier = Modifier
                    .size(dimensionResource(R.dimen.ukuran_logo))
                    .padding(all = dimensionResource(R.dimen.padding_logo))
            )
        }
    }
}

@Composable
fun HalamanUtama(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .padding(top = dimensionResource(R.dimen.padding_atas))
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            stringResource(id = R.string.prodi),
            fontSize = ukuranFont(R.dimen.font_prodi),
            fontWeight = FontWeight.Bold
        )
        Text(
            stringResource(id = R.string.univ),
            fontSize = ukuranFont(R.dimen.font_univ),
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.jarak_judul)))

    }
}