package dev.ymix.springbootsamplemaven.controller

import dev.ymix.springbootsamplemaven.domain.Item
import dev.ymix.springbootsamplemaven.domain.ItemType
import dev.ymix.springbootsamplemaven.mapper.ItemMapper
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
@RequestMapping("/items")
class ItemsController(private val itemMapper: ItemMapper) {

    @GetMapping("/")
    fun listByType(@RequestParam itemType: String, model: Model) :String {
        val itemData: List<Item> = itemMapper.selectItemsByType(itemType)
        val typeData: List<ItemType> = itemMapper.selectTypes()

        model.addAttribute("itemType", itemType)
        model.addAttribute("itemData", itemData)
        model.addAttribute("typeData", typeData)
        return "items_list"
    }

    @GetMapping("/{id}")
    fun itemDetail(@PathVariable id: String, model: Model) :String {
        val itemData: Item = itemMapper.selectItem(id)

        model.addAttribute("itemData", itemData)
        return "items"
    }
}