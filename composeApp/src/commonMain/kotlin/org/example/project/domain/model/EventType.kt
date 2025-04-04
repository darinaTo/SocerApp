package com.example.matches.android.domain.model

import com.example.matches.android.R

sealed class EventType {
    abstract val drawableResId: Int

    data class Card(val color: CardColor, override val drawableResId: Int) : EventType()
    data class Substitution(override val drawableResId: Int) : EventType()
    data class Default(override val drawableResId: Int) : EventType()
    data class NormalGoal(override val drawableResId: Int) : EventType()
    data class CancelledGoal(override val drawableResId: Int) : EventType()

    enum class CardColor {
        YELLOW, RED
    }

    companion object {
        fun fromString(type: String, detail: String?): EventType {
            return when (type) {
                "Card" -> when (detail) {
                    "Yellow Card" -> Card(CardColor.YELLOW, R.drawable.icon_events_yellow_card)
                    "Red Card" -> Card(CardColor.RED, R.drawable.icon_events_red_card)
                    else -> Default(R.drawable.image_default_logo_club)
                }

                "subst" -> Substitution(R.drawable.icon_events_sub)
                "Goal" -> when (detail) {
                    "Normal Goal" -> NormalGoal(R.drawable.icon_events_goal)
                    "Penalty" -> NormalGoal(R.drawable.icon_events_goal)
                    "Cancelled Goal" -> CancelledGoal(R.drawable.icon_events_goal_cancelled)
                    else -> Default(R.drawable.image_default_logo_club)
                }
                else -> Default(R.drawable.image_default_logo_club)
            }
        }
    }
}
