package com.example.matches.android.data.model.ui.stat

import com.example.matches.android.R

enum class PlayerType(
    val labelRes: Int,
) {
    GOALSCORERS(R.string.total_goalscorers),
    GOALKEEPERS(R.string.total_goalkeepers),
}
