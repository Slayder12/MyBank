package com.example.mybank.models

import androidx.core.os.BuildCompat
import com.example.mybank.R
import java.io.Serializable

class ViewPageModel(
    val title: String,
    val info: String,
    val imageView: Int,
    val checkButton: Boolean?
) : Serializable {

    companion object{
        val viewPagerList = mutableListOf(
            ViewPageModel(
              "Добро пожаловать в\nМой Банк\nУправляйте своими финансами легко!",
                "В мобильном приложении \"Мой Банк\" вы сможете быстро и удобно управлять своими счетами, проверять баланс и отслеживать транзакции в любое время и в любом месте.",
                (R.drawable._1),
                true
            ),
            ViewPageModel(
                "Все функции в одном приложении",
                "Откройте для себя удобство мобильного банкинга с \"Мой Банк\" – ваш финансовый помощник всегда под рукой!",
                (R.drawable._2),
                true
            ),
            ViewPageModel(
                "Ваши данные под надежной защитой\n",
                "Будьте уверены, ваши данные находятся в безопасности с \"Мой Банк\".",
                (R.drawable._3),
                false
            ),
            
        )

    }
}