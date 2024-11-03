package com.wstxda.clippy.cleaner.tools

import com.wstxda.clippy.cleaner.provider.TextRegexProvider

object TextCleaner {

    fun extractUrl(text: String): String? {
        return TextRegexProvider.urlRegex.find(text)?.value
    }
}