package com.gmorel.whatthezoobackend.infrastucture

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = ["http://localhost:3000"])
class MockShopController {

    @GetMapping("/shop")
    fun getShop(): List<Animal> {
        return listOf(
                Animal(
                        id = "ebb06c0a-79d5-4f70-98f0-13689c7543d2",
                        spaces = "GIRAFE",
                        name = "Sophie",
                        description = "La Girafe est une espèce de mammifères ongulés artiodactyles, du groupe des ruminants, vivant dans les savanes africaines et répandue du Tchad jusqu'en Afrique du Sud.",
                        price = 15,
                        gender = Gender.FEMALE
                ),
                Animal(
                        id = "fzefzegz-e27a-459c-bcd4-c706123060c0",
                        spaces = "GIRAFE",
                        name = "Sofiano",
                        description = "La Girafe est une espèce de mammifères ongulés artiodactyles, du groupe des ruminants, vivant dans les savanes africaines et répandue du Tchad jusqu'en Afrique du Sud.",
                        price = 20,
                        gender = Gender.MALE
                ),
                Animal(
                        id = "382cd0f5-e27a-459c-bcd4-c706123060c0",
                        spaces = "TIGER",
                        name = "Tigrou",
                        description = "L'autruche est le plus grand et le plus gros des oiseaux actuels. Ses ailes, aux immenses plumes, ne lui servent qu'à parader, à s'éventer ou à protéger ses petits : elle est incapable de voler. Mais elle court très vite, avec ses longues pattes aux cuisses rebondies.",
                        price = 350,
                        gender = Gender.MALE
                ),
                Animal(
                        id = "13-e27a-459c-bcd4-c706123060c0",
                        spaces = "TIGER",
                        name = "Grangrou",
                        description = "L'autruche est le plus grand et le plus gros des oiseaux actuels. Ses ailes, aux immenses plumes, ne lui servent qu'à parader, à s'éventer ou à protéger ses petits : elle est incapable de voler. Mais elle court très vite, avec ses longues pattes aux cuisses rebondies.",
                        price = 350,
                        gender = Gender.FEMALE
                ),
                Animal(
                        id = "12-e27a-459c-bcd4-c706123060c0",
                        spaces = "AUTRUCHE",
                        name = "Shanon",
                        description = "L'autruche est le plus grand et le plus gros des oiseaux actuels. Ses ailes, aux immenses plumes, ne lui servent qu'à parader, à s'éventer ou à protéger ses petits : elle est incapable de voler. Mais elle court très vite, avec ses longues pattes aux cuisses rebondies.",
                        price = 20,
                        gender = Gender.MALE
                )
        )
    }

    @PostMapping("/shop/{id}")
    fun buy(@PathVariable id: String): ResponseEntity<Any> {
        println("Buy $id")
        return ResponseEntity.ok().build()
    }

}


data class Animal(val id: String, val spaces: String, val name: String, val description: String, val price: Int, val gender: Gender)

enum class Gender {
    MALE, FEMALE
}