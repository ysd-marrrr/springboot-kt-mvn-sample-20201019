package dev.ymix.springbootsamplemaven.mapper

import dev.ymix.springbootsamplemaven.domain.Item
import dev.ymix.springbootsamplemaven.domain.ItemType
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface ItemMapper {
    @Select("""
        SELECT id, name, type, created_at
        FROM items
        WHERE id = #{id}
    """)
    fun selectItem(id: String): Item

    @Select("""
        SELECT DISTINCT(type)
        FROM items
    """)
    fun selectTypes(): List<ItemType>

    @Select("""
        SELECT id, name, type, created_at
        FROM items
        WHERE type = #{type}
    """)
    fun selectItemsByType(type: String): List<Item>
}