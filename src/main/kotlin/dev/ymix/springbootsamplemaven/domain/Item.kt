package dev.ymix.springbootsamplemaven.domain

import java.util.*

data class Item(var id: Int, var name: String, var type: String, var created_at: Date) {
}